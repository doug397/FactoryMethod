package br.com.lendolivro.fabrica.fabrica;

import br.com.lendolivro.entidades.Autor;
import br.com.lendolivro.fabrica.interfaces.IAutor;
import br.com.lendolivro.fabrica.interfaces.IFabricaAutor;

public class FabricaAutor implements IFabricaAutor {

	@Override
	public IAutor criaAutor() {
		// TODO Auto-generated method stub
		return new Autor();
	}

}
