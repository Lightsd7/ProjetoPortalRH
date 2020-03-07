package br.com.fiap.jpa.model.dao;

import br.com.fiap.jpa.entity.Colaborador;

public interface ColaboradorDAO {
	
	void cadastrar(Colaborador colaborador);
	
	Colaborador pesquisar(int id);

	void atualizar(Colaborador colaborador);

	void deletar(int id);

	void commit();

}
