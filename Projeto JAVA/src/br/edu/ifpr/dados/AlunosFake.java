package br.edu.ifpr.dados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.ifpr.modelos.Aluno;
import br.edu.ifpr.modelos.Endereco;
import br.edu.ifpr.modelos.Telefone;
import br.edu.ifpr.utils.enumerados.EnderecoType;
import br.edu.ifpr.utils.enumerados.PessoaType;
import br.edu.ifpr.utils.enumerados.SexoType;
import br.edu.ifpr.utils.enumerados.TelefoneType;
import br.edu.ifpr.utils.enumerados.UF;

public class AlunosFake {
	private List<Aluno> alunos = new ArrayList<>();
	
	public AlunosFake() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		
		try {
			
			//Alunos Moda
			Aluno aluno1 = new Aluno(
				"Rubia Aparecida Uriah",
				"05801344667",
				"413345348",
				format.parse("13/12/2001"),
				SexoType.FEMININO,
				PessoaType.ALUNO,
				"ra_uriah@gmail.com",
				new Endereco(
					"Beco Barbosa",
					585,
					"fundos",
					"Madre Gertrudes",
					"30512-711",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"37064250",
					TelefoneType.RESIDENCIAL
				)),
				"20171498789"
			);
			Aluno aluno2 = new Aluno(
				"Thales Guias",
				"39032017667",
				"217045182",
				format.parse("16/05/2001"),
				SexoType.MASCULINO,
				PessoaType.ALUNO,
				"thales_guiasguias@gmail.com",
				new Endereco(
					"Praça Floriano Peixoto",
					287,
					"casa",
					"Santa Efigênia",
					"30150-360",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"35269761",
					TelefoneType.RECADO
				)),
				"2017146349"
			);
			Aluno aluno3 = new Aluno(
				"Frederico Almeida Neves",
				"18721991600",
				"104044184",
				format.parse("26/01/2001"),
				SexoType.MASCULINO,
				PessoaType.ALUNO,
				"freado_almeidneves@gmail.com",
				new Endereco(
					"Rua Curral Del Rei",
					205,
					"casa",
					"Padre Eustáquio",
					"30720-220",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"999848621",
					TelefoneType.CELULAR
				)),
				"20171409879"
			);			
			Aluno aluno4 = new Aluno(
				"Paula Ferrerini",
				"69657133645",
				"255185455",
				format.parse("03/05/2002"),
				SexoType.FEMININO,
				PessoaType.ALUNO,
				"Paula_ferrer@gmail.com",
				new Endereco(
					"Rua Bartolomeu Dias",
					347,
					"sobreloja",
					"Taquaril",
					"30295-220",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"991719663",
					TelefoneType.CELULAR
				)),
				"20171456432"
			);
			Aluno aluno5 = new Aluno(
				"Diego Pires Albuquerque",
				"28684626699",
				"208356289",
				format.parse("23/08/2001"),
				SexoType.MASCULINO,
				PessoaType.ALUNO,
				"diego-p-albuquerque@gmail.com",
				new Endereco(
					"Rua Monte Horebe",
					504,
					"apartamento",
					"Ribeiro de Abreu",
					"31872-460",
					EnderecoType.RESIDENCIAL,
					"Belo Horizonte",
					UF.MG
				),
				Arrays.asList(new Telefone(
					31,
					"992728514",
					TelefoneType.CELULAR
				)),
				"20171487612"
			);
			
			//Alunos Admin
			Aluno aluno6 = new Aluno(
				"Juliana Cardoso",
				"86906167057",
				"472903974",
				format.parse("26/06/2004"),
				SexoType.FEMININO,
				PessoaType.ALUNO,
				"julianacardoso_12@gmail.com",
				new Endereco(
					"Alameda cinquenta e sete",
					312,
					"casa",
					"Tapanã",
					"66831-057",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"989605688",
					TelefoneType.CELULAR
				)),
				"20206712094"
			);
			
			Aluno aluno7 = new Aluno(
				"Laura Sophia Queiroz",
				"94254823657",
				"195878693",
				format.parse("13/07/2004"),
				SexoType.FEMININO,
				PessoaType.ALUNO,
				"laura.queiroz@gmail.com",
				new Endereco(
					"Rua Nossa Senhora do Rosário",
					967,
					"casa",
					"Residencial Solar Sul",
					"12922-293",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"37017965",
					TelefoneType.RESIDENCIAL
				)),
				"20206709834"
			);
			Aluno aluno8 = new Aluno(
				"Isabel da Silva Gonçalves",
				"75583520884",
				"381934615",
				format.parse("08/10/2004"),
				SexoType.FEMININO,
				PessoaType.ALUNO,
				"Isabel_gonc6174@gmail.com",
				new Endereco(
					"Rua Luiz Carlos Prestes",
					839,
					"apartamento",
					"Ponto Novo",
					"49097-380",
					EnderecoType.RESIDENCIAL,
					"São Caetano",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"998429567",
					TelefoneType.CELULAR
				)),
				"20206712345"
			);
			Aluno aluno9 = new Aluno(
				"Ana Paula Duarte",
				"63006063767",
				"408080589",
				format.parse("10/11/2004"),
				SexoType.FEMININO,
				PessoaType.ALUNO,
				"apaulinhaduart@hotmail.com",
				new Endereco(
					"Passagem Santa Maria",
					189,
					"casa",
					"Sacramento",
					"05879-452",
					EnderecoType.RESIDENCIAL,
					"São Paulo",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"38628904",
					TelefoneType.RESIDENCIAL
				)),
				"20206756823"
			);
			Aluno aluno10 = new Aluno(
				"Guilherme da Silva Soares",
				"84273215977",
				"404640709",
				format.parse("14/06/2004"),
				SexoType.MASCULINO,
				PessoaType.ALUNO,
				"euguisoares@hotmail.com",
				new Endereco(
					"Avenida Trinta",
					497,
					"fundos",
					"Mangueirão",
					"66640-480",
					EnderecoType.RESIDENCIAL,
					"Santo André",
					UF.SP
				),
				Arrays.asList(new Telefone(
					11,
					"986562007",
					TelefoneType.CELULAR
				)),
				"20206789078"
			);
			
			alunos.add(aluno1);
			alunos.add(aluno2);
			alunos.add(aluno3);
			alunos.add(aluno4);
			alunos.add(aluno5);
			alunos.add(aluno6);
			alunos.add(aluno7);
			alunos.add(aluno8);
			alunos.add(aluno9);
			alunos.add(aluno10);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
}
