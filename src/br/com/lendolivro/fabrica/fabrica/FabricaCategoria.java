package br.com.lendolivro.fabrica.fabrica;

import br.com.lendolivro.entidades.Categoria;
import br.com.lendolivro.fabrica.interfaces.ICategoria;
import br.com.lendolivro.fabrica.interfaces.IFabricaCategoria;

public class FabricaCategoria implements IFabricaCategoria {

	@Override
	public ICategoria criaCategoria() {
		// TODO Auto-generated method stub
		return new Categoria();
	}

}
