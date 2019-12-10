package br.edu.ifpr.dados;

import java.util.List;
import java.util.Map;

import br.edu.ifpr.modelos.Aluno;
import br.edu.ifpr.modelos.Curso;
import br.edu.ifpr.modelos.Instrutor;

public class Dados {
	
	private Map<String, Curso> cursos;
	private List<Instrutor> instrutores;
	private List<Aluno> alunos;
	
	public Dados() {
		
		CursosFake lista = new CursosFake();
	
		instrutores = lista.getInstrutores();
		cursos = lista.getCursos();
		alunos = lista.getAlunos();
	}

	public void mostrarCursos() {
		System.out.println("\nCursos:\n");
		
		Curso admin = cursos.get("Administração");
		Curso moda = cursos.get("Moda");
		
		System.out.println(admin);
		System.out.println(moda);
	}

	public void mostrarInstrutores() {
		
		System.out.println("\nInstrutores:\n");
		
		for(Instrutor ins : instrutores) {
			System.out.println(ins);
		}
		
	}
	
	public void mostrarAlunos() {
		System.out.println("\nAlunos:\n");
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
