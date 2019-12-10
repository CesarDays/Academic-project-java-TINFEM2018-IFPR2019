package br.edu.ifpr.aplicacao;

import br.edu.ifpr.dados.Dados;

public class Principal {

	
	public Principal() {
		Dados dados = new Dados();
		dados.mostrarCursos();
		dados.mostrarAlunos();
		dados.mostrarInstrutores();
	}

	public static void main(String[] args) {
		new Principal();
	}

}
