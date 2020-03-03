package br.com.fiap.jpa.model.dao;

import br.com.fiap.jpa.entity.Treinamento;

public interface TreinamentoDAOInterface {

	void cadastrar(Treinamento treinamento);

	Treinamento pesquisar(int codigo);

	void atualizar(Treinamento treinamento);

	void deletar(int codigo);

	void commit();

}
