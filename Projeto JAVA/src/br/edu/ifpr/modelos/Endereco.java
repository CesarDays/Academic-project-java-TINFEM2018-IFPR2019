package br.edu.ifpr.modelos;

import br.edu.ifpr.utils.enumerados.EnderecoType;
import br.edu.ifpr.utils.enumerados.UF;

public class Endereco {
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private EnderecoType tipo;
	private String cidade;
	private UF estado;
	
	public Endereco(String logradouro, int numero, String complemento, String bairro, String cep, EnderecoType tipo,
			String cidade, UF estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.tipo = tipo;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public EnderecoType getTipo() {
		return tipo;
	}
	public void setTipo(EnderecoType tipo) {
		this.tipo = tipo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public UF getEstado() {
		return estado;
	}
	public void setEstado(UF estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (estado != other.estado)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero != other.numero)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cep=" + cep + ", tipo=" + tipo + ", cidade=" + cidade + ", estado=" + estado
				+ "]";
	}

	
	
}
