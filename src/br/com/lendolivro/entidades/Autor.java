package br.com.lendolivro.entidades;

import br.com.lendolivro.fabrica.interfaces.IAutor;
import br.com.lendolivro.util.GerenciadorHash;

public class Autor implements IAutor{
	
	protected String codigo;
	protected String nome;
	
	public Autor() {
		super();
	}

	public Autor(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String mostrarDetalhes() {
		return "Autor [codigo=" + codigo + ", nome=" + nome + "]";
		
	}

}
