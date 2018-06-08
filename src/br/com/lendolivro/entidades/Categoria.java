package br.com.lendolivro.entidades;

import br.com.lendolivro.fabrica.interfaces.ICategoria;

public class Categoria implements ICategoria{
	
	protected String codigo;
	protected String nome;
	protected int cor;
	
	public Categoria() {
		super();
	}

	public Categoria(String codigo, String nome, int cor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + cor;
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
		Categoria other = (Categoria) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cor != other.cor)
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



	public int getCor() {
		return cor;
	}



	public void setCor(int cor) {
		this.cor = cor;
	}



	@Override
	public String mostrarDetalhes() {
		return "Categoria [codigo=" + codigo + ", nome=" + nome + ", cor=" + cor + "]";
	}

}
