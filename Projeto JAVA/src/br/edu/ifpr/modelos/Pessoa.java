package br.edu.ifpr.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.edu.ifpr.utils.CpfUtils;
import br.edu.ifpr.utils.enumerados.CpfStatus;
import br.edu.ifpr.utils.enumerados.PessoaType;
import br.edu.ifpr.utils.enumerados.SexoType;

public abstract class Pessoa {
	protected String cpf;
	protected String nome;
	protected String rg;
	protected Date nascimento;
	protected SexoType sexo;
	protected PessoaType tipo;
	protected String email;
	protected Endereco endereco;
	protected List<Telefone> fones;
	
	public Pessoa (String nome, String cpf, String rg, Date nascimento, SexoType sexo, PessoaType tipo, String email, Endereco endereco, List<Telefone> fones) {
		cpf = cpf.replaceAll("[^0-9]", "");
		if (CpfUtils.validarCpf(cpf)== CpfStatus.CPF_DEUBOM) {
			this.cpf = cpf;
		}
		this.nome = nome;
		this.rg = rg.replaceAll("[^0-9]", "");
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.tipo = tipo;
		this.email = email;
		this.endereco = endereco;
		this.fones = fones;
	}
	public Pessoa (String nome, String rg, Date nascimento, SexoType sexo, PessoaType tipo, String email, Endereco endereco, List<Telefone> fones) {
		this.cpf = CpfUtils.gerarCpf();
		this.nome = nome;
		this.rg = rg.replaceAll("[^0-9]", "");;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.tipo = tipo;
		this.email = email;
		this.endereco = endereco;
		this.fones = fones;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		cpf = cpf.replaceAll("[^0-9]", "");
		if (CpfUtils.validarCpf(cpf)== CpfStatus.CPF_DEUBOM) {
			this.cpf = cpf;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg.replaceAll("[^0-9]", "");;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public SexoType getSexo() {
		return sexo;
	}
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	public PessoaType getTipo() {
		return tipo;
	}
	public void setTipo(PessoaType tipo) {
		this.tipo = tipo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Telefone> getFones() {
		return fones;
	}
	public void setFones(List<Telefone> fones) {
		this.fones = fones;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (fones == null) {
			if (other.fones != null)
				return false;
		} else if (!fones.equals(other.fones))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo != other.sexo)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", nascimento=" + sdf.format(nascimento) + ", sexo=" + sexo
				+ ", tipo=" + tipo + ", email=" + email + ", endereco=" + endereco + ", fones=" + fones + "]";
	}
	
}
