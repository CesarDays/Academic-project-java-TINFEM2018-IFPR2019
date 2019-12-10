package br.edu.ifpr.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.ifpr.utils.enumerados.PessoaType;
import br.edu.ifpr.utils.enumerados.SexoType;

public class Aluno extends Pessoa {
	
	protected String registro;
	protected List<Matricula> matriculas = new ArrayList<>();
	
	public Aluno(String nome, String rg, Date nascimento, SexoType sexo, PessoaType tipo, String email,
			Endereco endereco, List<Telefone> fones, String registro) {
		super(nome, rg, nascimento, sexo, tipo, email, endereco, fones);
		this.registro = registro;
		
	}
	
	public Aluno(String nome, String cpf, String rg, Date nascimento, SexoType sexo, PessoaType tipo, String email,
			Endereco endereco, List<Telefone> fones, String registro) {
		super(nome, cpf, rg, nascimento, sexo, tipo, email, endereco, fones);
		
		this.registro = registro;
		
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matriculas == null) {
			if (other.matriculas != null)
				return false;
		} else if (!matriculas.equals(other.matriculas))
			return false;
		if (registro == null) {
			if (other.registro != null)
				return false;
		} else if (!registro.equals(other.registro))
			return false;
		return true;
	}
	
	public void adicionarMatricula(Matricula matricula) {
		if(!matriculas.contains(matricula)){
			if(matricula.getAluno().getRegistro() == this.getRegistro()) {
				matriculas.add(matricula);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nAluno (\nregistro: " + registro + ",\nmatriculas: ");
		for(Matricula matricula: matriculas) {
			sb.append(matricula);
		}
		sb.append(", \npessoa: "+ super.toString() + ")");
		return sb.toString();
	}
	
	
}
