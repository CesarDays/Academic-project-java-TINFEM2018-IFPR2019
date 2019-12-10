package br.edu.ifpr.dados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifpr.modelos.Aluno;
import br.edu.ifpr.modelos.Curso;
import br.edu.ifpr.modelos.Endereco;
import br.edu.ifpr.modelos.Instrutor;
import br.edu.ifpr.modelos.Matricula;
import br.edu.ifpr.modelos.Modulo;
import br.edu.ifpr.modelos.Telefone;
import br.edu.ifpr.utils.enumerados.CursoSituacaoType;
import br.edu.ifpr.utils.enumerados.EnderecoType;
import br.edu.ifpr.utils.enumerados.PessoaType;
import br.edu.ifpr.utils.enumerados.SexoType;
import br.edu.ifpr.utils.enumerados.TelefoneType;
import br.edu.ifpr.utils.enumerados.UF;

public class CursosFake {
	
	private Map<String,Curso> cursos = new HashMap<>();
	private List<Instrutor> instrutores = new ArrayList<>();
	private List<Aluno> alunos;

	public CursosFake(){

		alunos = new AlunosFake().getAlunos();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			//Instrutores Moda
			Instrutor ins1 = new Instrutor(
				"Emerson Luiz Figueredo",
				"21947263650",
				"392647321",
				format.parse("22/04/1974"),
				SexoType.MASCULINO,
				PessoaType.INSTRUTOR,
				"emersonfiguereido.edu@hotmail.com",
				new Endereco(
					"Rua Flor",
					740,
					"casa",
					"Jardim São José",
					"30820-400",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"30254786",
					TelefoneType.RESIDENCIAL
				)),
				"12345876098"
			);
	
			Instrutor ins2 = new Instrutor(
				"Geovana Maria dos Santos",
				"57796647654",
				"316555204",
				format.parse("17/10/1978"),
				SexoType.FEMININO,
				PessoaType.INSTRUTOR,
				"geomaria_santos@gmail.com",
				new Endereco(
					"Rua Gustavo Valim",
					181,
					"apartamento",
					"Jardim Goiânia",
					"31950-360",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"989869430",
					TelefoneType.CELULAR
				)),
				"12341111000"
			);
			Instrutor ins3 = new Instrutor(
				"Graça Polezzi",
				"72070665623",
				"107618242",
				format.parse("27/09/1963"),
				SexoType.FEMININO,
				PessoaType.INSTRUTOR,
				"graça.polezzi@gmail.com",
				new Endereco(
					"Av. Getúlio Vargas",
					561,
					"apartamento",
					"Savassi",
					"30112-024",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"984342119",
					TelefoneType.CELULAR
				)),
				"12340909876"
			);
			Instrutor ins4 = new Instrutor(
				"Amanda Cerqueira Aragão",
				"40984296670",
				"179190957",
				format.parse("14/03/1970"),
				SexoType.FEMININO,
				PessoaType.INSTRUTOR,
				"amandacerqaragao@gmail.com",
				new Endereco(
					"Rua Crauta",
					299,
					"casa",
					"Santa Maria",
					"30525-300",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"327975673",
					TelefoneType.RESIDENCIAL
				)),
				"12344567321"
			);
			Instrutor ins5 = new Instrutor(
				"Tatiana da Silva",
				"99338375676",
				"107387165",
				format.parse("24/09/1974"),
				SexoType.MASCULINO,
				PessoaType.INSTRUTOR,
				"tatisilva@gmail.com",
				new Endereco(
					"Rua Geraldo do Carmo",
					712,
					"casa",
					"Betania",
					"30590-260",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"989577678",
					TelefoneType.CELULAR
				)),
				"12347890098"
			);
			
			//Instrutores Admin
			Instrutor ins6 = new Instrutor(
				"Darci Azevedo",
				"18460428877",
				"338897835",
				format.parse("18/08/1969"),
				SexoType.FEMININO,
				PessoaType.INSTRUTOR,
				"darci-e-deus@gmail.com",
				new Endereco(
					"Rua Flor-de-Cardeal",
					666,
					"casa",
					"Jardim Nossa Senhora Aparecida",
					"03939-067",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"982213510",
					TelefoneType.RECADO
				)),
				"12348900567"
			);
			Instrutor ins7 = new Instrutor(
				"Fábia França",
				"10422668834",
				"447460778",
				format.parse("07/02/1972"),
				SexoType.FEMININO,
				PessoaType.INSTRUTOR,
				"fabiafrancaff@gmail.com",
				new Endereco(
					"Avenida Professor Alfonso Bovero",
					808,
					"casa",
					"Sumaré",
					"01254-000",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"983144459",
					TelefoneType.CELULAR
				)),
				"12301843295"
			);
			Instrutor ins8 = new Instrutor(
				"Antônio Aparecido Mello",
				"52873328827",
				"503653627",
				format.parse("10/07/1966"),
				SexoType.MASCULINO,
				PessoaType.INSTRUTOR,
				"aamello@gmail.com",
				new Endereco(
					"Rua José Padilha",
					917,
					"casa",
					"Santa Etelvina III",
					"08485-448",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"982779793",
					TelefoneType.CELULAR
				)),
				"16626587340"
			);
			Instrutor ins9 = new Instrutor(
				"Amilton Tavares",
				"81598295829",
				"172675935",
				format.parse("02/03/1972"),
				SexoType.MASCULINO,
				PessoaType.INSTRUTOR,
				"tavares_amilton@gmail.com",
				new Endereco(
					"Rua Augusto Blasi",
					469,
					"CASA",
					"Jardim Celeste",
					"04195-160",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"982271900",
					TelefoneType.CELULAR
				)),
				"16798343975 "
			);
			Instrutor ins10 = new Instrutor(
				"Laís Dias e Lima",
				"69548942810",
				"48058790",
				format.parse("01/06/1979"),
				SexoType.FEMININO,
				PessoaType.INSTRUTOR,
				"lais_diaslima@gmail.com",
				new Endereco(
					"Rua José Neves",
					488,
					"casa",
					"Vila São Paulo",
					"04650-141",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"984419681",
					TelefoneType.CELULAR
				)),
				"12343334312"
			);
			
			//Cursos
			Curso moda = new Curso(
				"Técnico em Moda Integrado ao Ensino Médio",
				CursoSituacaoType.ANDAMENTO,
				format.parse("22/02/2019")
			);
			
			Curso admin = new Curso(
				"Técnico em Administração Integrado ao Ensino Médio ",
				CursoSituacaoType.ABERTO,
				format.parse("27/02/2020")
			);
			
			//Módulos do Curso Moda
			Modulo moda1 = new Modulo(
				"Alfaiataria",
				format.parse("22/02/2019"),
				ins1
			);
			Modulo moda2 = new Modulo(
				"Ateliê de Figurino",
				format.parse("30/07/2019"),
				ins2
			);
			Modulo moda3 = new Modulo(
				"Consultoria de Estilo",
				format.parse("22/02/2019"),
				ins3
			);
			Modulo moda4 = new Modulo(
				"Desenho de Moda",
				format.parse("30/07/2019"),
				ins4
			);
			Modulo moda5 = new Modulo(
				"Administração de Produção",
				format.parse("22/02/2019"),
				ins5
			);
			
			//Módulos do Curso Admin
			Modulo admin1 = new Modulo(
				"Finanças e Orçamentos",
				format.parse("27/02/2020"),
				ins6
			);
			Modulo admin2 = new Modulo(
				"Recursos Humanos",
				format.parse("27/02/2020"),
				ins7
			);
			Modulo admin3 = new Modulo(
				"Mercado e Marketing",
				format.parse("27/02/2020"),
				ins8
			);
			Modulo admin4 = new Modulo(
				"Responsabilidade Social e Terceiro Setor",
				format.parse("27/02/2020"),
				ins9
			);
			Modulo admin5 = new Modulo(
				"Tecnologia e Inovação",
				format.parse("27/02/2020"),
				ins10
			);
			
			moda.adicionarModulo(moda1);
			moda.adicionarModulo(moda2);
			moda.adicionarModulo(moda3);
			moda.adicionarModulo(moda4);
			moda.adicionarModulo(moda5);
			
			admin.adicionarModulo(admin1);
			admin.adicionarModulo(admin2);
			admin.adicionarModulo(admin3);
			admin.adicionarModulo(admin4);
			admin.adicionarModulo(admin5);
			
			//Moda matriculas
			Matricula mat1 = new Matricula(
				moda,
				alunos.get(0),
				format.parse("29/01/2017")
			);
			
			Matricula mat2 = new Matricula(
				moda,
				alunos.get(1),
				format.parse("28/01/2017")
			);
			
			Matricula mat3 = new Matricula(
				moda,
				alunos.get(2),
				format.parse("29/01/2017")
			);
			
			Matricula mat4 = new Matricula(
				moda,
				alunos.get(3),
				format.parse("29/01/2017")
			);
			
			Matricula mat5 = new Matricula(
				moda,
				alunos.get(4),
				format.parse("29/01/2017")
			);
			
			//Admin matriculas
			Matricula mat6 = new Matricula(
				admin,
				alunos.get(5),
				format.parse("14/11/2019")
			);
			
			Matricula mat7 = new Matricula(
				admin,
				alunos.get(6),
				format.parse("14/11/2019")
			);
			
			Matricula mat8 = new Matricula(
				admin,
				alunos.get(7),
				format.parse("13/11/2019")
			);
			
			Matricula mat9 = new Matricula(
				admin,
				alunos.get(8),
				format.parse("13/11/2019")
			);
			
			Matricula mat10 = new Matricula(
				admin,
				alunos.get(9),
				format.parse("14/11/2019")
			);
			
			moda.adicionarMatricula(mat1);
			moda.adicionarMatricula(mat2);
			moda.adicionarMatricula(mat3);
			moda.adicionarMatricula(mat4);
			moda.adicionarMatricula(mat5);
			
			admin.adicionarMatricula(mat6);
			admin.adicionarMatricula(mat7);
			admin.adicionarMatricula(mat8);
			admin.adicionarMatricula(mat9);
			admin.adicionarMatricula(mat10);
			
			cursos.put("Administração", admin);
			cursos.put("Moda", moda);
			
			
			ins1.adicionarModulo(moda1);
			ins2.adicionarModulo(moda2);
			ins3.adicionarModulo(moda3);
			ins4.adicionarModulo(moda4);
			ins5.adicionarModulo(moda5);
			ins6.adicionarModulo(admin1);
			ins7.adicionarModulo(admin2);
			ins8.adicionarModulo(admin3);
			ins9.adicionarModulo(admin4);
			ins10.adicionarModulo(admin5);
			
			instrutores.add(ins1);
			instrutores.add(ins2);
			instrutores.add(ins3);
			instrutores.add(ins4);
			instrutores.add(ins5);
			instrutores.add(ins6);
			instrutores.add(ins7);
			instrutores.add(ins8);
			instrutores.add(ins9);
			instrutores.add(ins10);
	
			alunos.get(0).adicionarMatricula(mat1);
			alunos.get(1).adicionarMatricula(mat2);
			alunos.get(2).adicionarMatricula(mat3);
			alunos.get(3).adicionarMatricula(mat4);
			alunos.get(4).adicionarMatricula(mat5);
			alunos.get(5).adicionarMatricula(mat6);
			alunos.get(6).adicionarMatricula(mat7);
			alunos.get(7).adicionarMatricula(mat8);
			alunos.get(8).adicionarMatricula(mat9);
			alunos.get(9).adicionarMatricula(mat10);
			
			
			
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
	}

	public Map<String,Curso> getCursos(){
		return cursos;
	}
	
	public List<Instrutor> getInstrutores(){
		return instrutores;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
}
