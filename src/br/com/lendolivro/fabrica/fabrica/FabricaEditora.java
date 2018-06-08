package br.com.lendolivro.fabrica.fabrica;

import br.com.lendolivro.entidades.Editora;
import br.com.lendolivro.fabrica.interfaces.IEditora;
import br.com.lendolivro.fabrica.interfaces.IFabricaEditora;

public class FabricaEditora implements IFabricaEditora {

	@Override
	public IEditora criaEditora() {
		// TODO Auto-generated method stub
		return new Editora();
	}
	

}
