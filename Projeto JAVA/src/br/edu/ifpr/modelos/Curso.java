package br.edu.ifpr.modelos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.ifpr.utils.enumerados.CursoSituacaoType;

public class Curso {
	private String nome;
	private CursoSituacaoType situacao;
	private Date inicio;
	private List<Modulo> modulos = new ArrayList<>();
	private List<Matricula> matriculas = new ArrayList<>();
	
	public Curso(String nome, CursoSituacaoType situacao, Date inicio) {
		this.nome = nome;
		this.situacao = situacao;
		this.inicio = inicio;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CursoSituacaoType getSituacao() {
		return situacao;
	}
	public void setSituacao(CursoSituacaoType situacao) {
		this.situacao = situacao;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public List<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	public List<Matricula> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (matriculas == null) {
			if (other.matriculas != null)
				return false;
		} else if (!matriculas.equals(other.matriculas))
			return false;
		if (modulos == null) {
			if (other.modulos != null)
				return false;
		} else if (!modulos.equals(other.modulos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (situacao != other.situacao)
			return false;
		return true;
	}
	
	public void adicionarModulo(Modulo modulo) {
		if(!modulos.contains(modulo)) {
			modulos.add(modulo);
		}
	}
	
	public void adicionarMatricula(Matricula matricula) {
		if(!matriculas.contains(matricula)) {
			if(matricula.getCurso() == this) {
				matriculas.add(matricula);
			}
		}
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append("\nCurso (\nnome: " + nome + ",\nsituacao: " + situacao + ",\ninicio: " + sdf.format(inicio) + ",\nmodulos: ");
		for(Modulo modulo: modulos) {
			sb.append(modulo);
		}
		sb.append(",\nmatriculas: ");
		for(Matricula matricula: matriculas) {
			sb.append(matricula);
		}
		return sb.toString();
	}
	
	
}
