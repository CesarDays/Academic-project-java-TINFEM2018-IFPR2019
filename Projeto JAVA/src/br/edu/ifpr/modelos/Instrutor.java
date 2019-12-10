package br.edu.ifpr.modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.ifpr.utils.enumerados.PessoaType;
import br.edu.ifpr.utils.enumerados.SexoType;

public class Instrutor extends Pessoa {
	
	protected String codigo;
	protected List<Modulo> modulos = new ArrayList<>();
	
	public Instrutor(String nome, String rg, Date nascimento, SexoType sexo, PessoaType tipo, String email,
			Endereco endereco, List<Telefone> fones, String codigo) {
		super(nome, rg, nascimento, sexo, tipo, email, endereco, fones);
		this.codigo = codigo;
		
	}
	
	public Instrutor(String nome, String cpf, String rg, Date nascimento, SexoType sexo, PessoaType tipo, String email,
			Endereco endereco, List<Telefone> fones, String codigo) {
		super(nome, cpf, rg, nascimento, sexo, tipo, email, endereco, fones);
		
		this.codigo = codigo;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instrutor other = (Instrutor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (modulos == null) {
			if (other.modulos != null)
				return false;
		} else if (!modulos.equals(other.modulos))
			return false;
		return true;
	}
	
	public void adicionarModulo(Modulo modulo) {
		if(!modulos.contains(modulo)){
			if(modulo.getInstrutor().getCodigo() == this.getCodigo()) {
				modulos.add(modulo);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nInstrutor (\ncodigo: " + codigo + ",\nmodulos: ");
		for(Modulo modulo: modulos) {
			sb.append(modulo);
		}
		sb.append(", \npessoa: "+ super.toString() + ")");
		return sb.toString();
	}
	
	
}
