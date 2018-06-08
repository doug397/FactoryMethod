package br.com.lendolivro.entidades;

import br.com.lendolivro.fabrica.interfaces.ILivro;

public class Livro implements ILivro {
	
	protected String codigo;
	protected String titulo;
	protected Autor autor;
	protected Editora editora;
	protected Categoria categoria;


	public Livro() {
		super();
	}


	public Livro(String titulo, Autor autor, Editora editora) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}


	public Livro(String codigo, String titulo, Autor autor, Editora editora) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public Editora getEditora() {
		return editora;
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	

	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	@Override
	public String mostrarDetalhes() {
		return "Livro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora
				+ ", categoria=" + categoria + "]";
	}



}
