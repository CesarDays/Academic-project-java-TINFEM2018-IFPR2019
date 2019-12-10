package br.edu.ifpr.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Modulo {
	private String nome;
	private Date inicio;
	private Instrutor instrutor;
	
	public Modulo(String nome, Date inicio, Instrutor instrutor) {
		this.nome = nome;
		this.inicio = inicio;
		this.instrutor = instrutor;
	}
	
	public Modulo(String nome, Date inicio) {
		this.nome = nome;
		this.inicio = inicio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Instrutor getInstrutor() {
		return instrutor;
	}
	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modulo other = (Modulo) obj;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (instrutor == null) {
			if (other.instrutor != null)
				return false;
		} else if (!instrutor.equals(other.instrutor))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Modulo [nome=" + nome + ", inicio=" + sdf.format(inicio) + ", instrutor=" + instrutor.getNome() + "]";
	}

	
	
}
