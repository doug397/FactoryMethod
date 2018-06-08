package br.com.lendolivro.test;


import java.security.NoSuchAlgorithmException;

import br.com.lendolivro.dao.AutorDAO;
import br.com.lendolivro.dao.CategoriaDAO;
import br.com.lendolivro.dao.EditoraDAO;
import br.com.lendolivro.dao.GenericDAOIF;
import br.com.lendolivro.dao.LivroDAO;
import br.com.lendolivro.entidades.Livro;
import br.com.lendolivro.fabrica.fabrica.FabricaAutor;
import br.com.lendolivro.fabrica.fabrica.FabricaCategoria;
import br.com.lendolivro.fabrica.fabrica.FabricaDeLivroLido;
import br.com.lendolivro.fabrica.fabrica.FabricaEditora;
import br.com.lendolivro.fabrica.interfaces.IAutor;
import br.com.lendolivro.fabrica.interfaces.ICategoria;
import br.com.lendolivro.fabrica.interfaces.IEditora;
import br.com.lendolivro.fabrica.interfaces.IFabricaAutor;
import br.com.lendolivro.fabrica.interfaces.IFabricaCategoria;
import br.com.lendolivro.fabrica.interfaces.IFabricaDeLivro;
import br.com.lendolivro.fabrica.interfaces.IFabricaEditora;
import br.com.lendolivro.fabrica.interfaces.ILivro;
import br.com.lendolivro.util.GerenciadorHash;

public class AppMain {
	
	public static void main(String[] args) {
		
		IFabricaDeLivro fabricaLivro = new FabricaDeLivroLido();
		ILivro livro =  fabricaLivro.criarLivro();
		
		
		IFabricaAutor fabricaAutor = new FabricaAutor();
		IAutor autor = fabricaAutor.criaAutor();
		
		IFabricaEditora fabricaEditora = new FabricaEditora();
		IEditora editora = fabricaEditora.criaEditora();
		
		IFabricaCategoria fabricaCategoria = new FabricaCategoria();
		ICategoria categoria = fabricaCategoria.criaCategoria();
		
	
		
		System.out.println(livro.mostrarDetalhes());
		System.out.println(autor.mostrarDetalhes());
		System.out.println(editora.mostrarDetalhes());
		System.out.println(categoria.mostrarDetalhes());
		
	
		
		GenericDAOIF autordao = new AutorDAO();
		GenericDAOIF editoradao = new EditoraDAO();
		GenericDAOIF livrodao = new LivroDAO();
		GenericDAOIF categoriadao = new CategoriaDAO();
		
		((Livro) livro).setTitulo("A Culpa é Das Estrelas");
		livrodao.insert(livro);
		
		try {
			((Livro) livro).setCodigo(GerenciadorHash.getHashMd5(((Livro) livro).getTitulo()));
			System.out.println(((Livro) livro).getCodigo());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
