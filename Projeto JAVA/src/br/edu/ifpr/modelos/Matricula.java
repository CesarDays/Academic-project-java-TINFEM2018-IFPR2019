package br.edu.ifpr.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Matricula {
	// ANAJU ESTEVE AQUI =D
	// U R THE BEST FRIEND EVER 
	// LOVE U
	// GOOD CODES FOR U 
	// GOOD LUCK WITH THIS 
	// U R AMAZING 
	//<3
	
	//LOVE U (DAVI)
	
	private Curso curso;
	private Aluno aluno;
	private Date dataMatricula;
	
			
	public Matricula(Curso curso, Aluno aluno, Date dataMatricula) {
		this.curso = curso;
		this.aluno = aluno;
		this.dataMatricula = dataMatricula;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matricula other = (Matricula) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Matricula [curso=" + curso.getNome() + ", aluno=" + aluno.getNome() + ", dataMatricula=" + sdf.format(dataMatricula) + "]";
	}
	
	
	
}
