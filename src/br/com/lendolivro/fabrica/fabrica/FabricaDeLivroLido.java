package br.com.lendolivro.fabrica.fabrica;

import br.com.lendolivro.entidades.Livro;
import br.com.lendolivro.fabrica.interfaces.IFabricaDeLivro;
import br.com.lendolivro.fabrica.interfaces.ILivro;

public class FabricaDeLivroLido implements IFabricaDeLivro{

	@Override
	public ILivro criarLivro() {
		// TODO Auto-generated method stub
		return new Livro();
	}

}
