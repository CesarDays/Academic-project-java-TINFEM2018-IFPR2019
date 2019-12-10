package br.edu.ifpr.modelos;

import br.edu.ifpr.utils.enumerados.TelefoneType;

public class Telefone {
	private int ddd;
	private String numero;
	private TelefoneType tipo;
	
	public Telefone(int ddd, String numero, TelefoneType tipo) {
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public TelefoneType getTipo() {
		return tipo;
	}
	public void setTipo(TelefoneType tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (ddd != other.ddd)
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

}
