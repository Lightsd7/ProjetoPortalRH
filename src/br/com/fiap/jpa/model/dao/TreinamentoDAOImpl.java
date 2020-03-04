package br.com.fiap.jpa.model.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.Treinamento;

public class TreinamentoDAOImpl implements TreinamentoDAOInterface {

	private EntityManager em;

	// Construtor que recebe o Entity Manager
	public TreinamentoDAOImpl(EntityManager em) {
		this.em = em;
	}


	@Override
	public void cadastrar(Treinamento treinamento) {
		em.persist(treinamento);
	}

	@Override
	public Treinamento pesquisar(int codigo) {
		Treinamento treinamento = em.find(Treinamento.class, codigo);
		// Validar se existe um treinamento existente
		if (treinamento == null) {
			System.out.println("Colocar uma exceção para o usuário");
		}

		return treinamento;
	}

	@Override
	public void atualizar(Treinamento treinamento) {
		pesquisar(treinamento.getCodigo());
		em.merge(treinamento);

	}

	@Override
	public void deletar(int codigo) {
		Treinamento treinamento = pesquisar(codigo);
		em.remove(treinamento);

	}

	@Override
	public void commit() {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
