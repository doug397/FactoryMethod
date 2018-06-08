package br.com.lendolivro.dao;

import br.com.lendolivro.fabrica.interfaces.IDetalhes;

public interface GenericDAOIF  {
	
	void delete(IDetalhes objeto);
	boolean update (IDetalhes objeto);
	void insert(IDetalhes objeto);
	IDetalhes findByName(String name);

}
