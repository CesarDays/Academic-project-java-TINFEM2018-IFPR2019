package br.edu.ifpr.utils;

import java.util.Arrays;
import java.util.Random;

import br.edu.ifpr.utils.enumerados.CpfStatus;
import br.edu.ifpr.utils.enumerados.UF;

public class CpfUtils {
	
	public static String gerarCpf() {
		Random gerador = new Random();
		
		//Gera os 9 primeiros números
		int cpf[] = new int[11];
	
		for(int index = 0; index<cpf.length-2;index++) {
			cpf[index] = gerador.nextInt(10);
		}
		
		//Define os 2 ultimos digitos
		int cpfValido[] = gerarDigito(cpf);
		return Arrays.toString(cpfValido).replaceAll("[^a-zZ-Z0-9]", "");
	}
	
	public static int[] gerarDigito(int cpf[]) {
		//Penultimo digito
		int aux = 0;
		for(int index = 0; index<cpf.length-2;index++) {
			aux += (10-index)*cpf[index];	
		}

		int	digito = 11-(aux%11);
		if(digito > 9) {
			digito = 0;
		}
		
		cpf[9] = digito;
		//Ultimo digito
		aux = 0;
		for(int index = 0; index<cpf.length-1;index++) {
			aux += (11-index)*cpf[index];	

		}
		digito = 11-(aux%11);
		
		if(digito > 9) {
			digito = 0;
		}
		
		cpf[10] = digito;
		
		return cpf;
	}
	public static CpfStatus validarCpf(String cpf) {
		if(cpf == null || cpf.isEmpty()) return CpfStatus.CPF_ERR;
		if(cpf.length() != 11) return CpfStatus.CPF_TAM;
		
		char cpfv[] = cpf.toCharArray();
		int aux = 0;
		for(int index = 0; index<(cpfv.length-2);index++) {
			aux += (10-index)*(cpfv[index]-48);	
		}
		
		int dv = 11-(aux%11);
		dv = (dv == 10|| dv ==11)? 0 : dv;
		
	    if (dv != (cpfv[9] - 48)) {
	    	return CpfStatus.CPF_DV1;
	    }
		
		//Ultimo digito
		aux = 0;
		for(int index = 0; index<(cpfv.length-1);index++) {
			aux += (11-index)*(cpfv[index]-48);	

		}
		
		dv = 11-(aux%11);
		dv = (dv == 10|| dv ==11)? 0 : dv;
		
		if(dv != (cpfv[10]-48)) {
			return CpfStatus.CPF_DV2;
		}
		
		return CpfStatus.CPF_DEUBOM;
	}
	
	public static String formatarCpf(String cpf) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(cpf.substring(0,3)).append('.');
		sb.append(cpf.substring(3,6)).append('.');
		sb.append(cpf.substring(6,9)).append('-');
		sb.append(cpf.substring(9));
		
		return sb.toString();
	}
	public static String estadoCpf(String cpf) {
		/*Implementar um método cujo onjetivo é verificar e retirar a qual(is) estados(s) pertence
		o cpf recebido.*/
		if (validarCpf(cpf) != CpfStatus.CPF_DEUBOM) return "";
		int digito = cpf.charAt(8)-48;
		String uf = "";
		switch (digito) {
//		case 1 :return "Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins";
//		case 2 :return "Acre, Amapa, Para, Rondonia e Roraima";
//		case 3 :return "Ceará, Maranhão e Piauí";
//		case 4 :return "Alagoas, Paraíba, Pernambuco e Rio Grande do Norte";
//		case 5 :return "Bahia e Sergipe";
//		case 6 :return "Minas Gerais";
//		case 7 :return "Espirito Santo e Rio de Janeiro";
//		case 8 :return "São Paulo";
//		case 9 :return "Paraná e Santa Catarina";
//		case 0 :return "Rio Grande do Sul";
		case 1 : uf = String.format("%s,%s, %s, %s, %s", 
				UF.GO.nome(), UF.MT.nome(),
				UF.MS.nome(), UF.TO.nome(),
				UF.DF.nome());break;
		
		case 2 :uf = String.format("%s, %s, %s, %s, %s, %s",
			    UF.AC.nome(), UF.AM.nome(), UF.AP.nome(),
			    UF.PA.nome(), UF.RO.nome(),
			    UF.RR.nome());break;
		
		case 3 :uf = String.format("%s, %s, %s",
				UF.CE.nome(), UF.MA.nome(),
				UF.PI.nome()); break;
		
		case 4 :uf = String.format("%s, %s, %s, %s",
			    UF.AL.nome(), UF.PA.nome(),
			    UF.RN.nome(), UF.PE.nome()); break;
		
		case 5 :uf = String.format("%s, %s",
				UF.BA.nome(),UF.SE.nome()); break;
		
		case 6 :uf = UF.MG.nome(); break;
		
		case 7 :uf = String.format("%s, %s",
				UF.ES.nome(), UF.RJ.nome()); break;
		
		case 8 :uf = UF.SP.nome(); break;
		
		case 9 :uf = String.format("%s, %s",
				UF.PR.nome(),UF.SC.nome()); break; 
		
		case 0 : uf = UF.RS.nome(); break;
		}
		return uf;
	}
	
}
