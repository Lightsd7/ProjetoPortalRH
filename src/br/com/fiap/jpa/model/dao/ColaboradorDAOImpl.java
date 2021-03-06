package br.com.fiap.jpa.model.dao;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.Colaborador;

public class ColaboradorDAOImpl implements ColaboradorDAO {

	private EntityManager em;

	// Construtor que recebe o Entity Manager
	public ColaboradorDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void cadastrar(Colaborador colaborador) {
		em.persist(colaborador);

	}

	@Override
	public Colaborador pesquisar(int id) {
		Colaborador colaborador = em.find(Colaborador.class, id);
		// Validar se existe um colaborador existente
		if (colaborador == null) {
			System.out.println("Colocar uma exce��o para o usu�rio");
			return null;
		}

		return colaborador;
	}

	@Override
	public void atualizar(Colaborador colaborador) {
		pesquisar(colaborador.getId());
		em.merge(colaborador);
	}

	@Override
	public void deletar(int codigo) {
		Colaborador colaborador = pesquisar(codigo);
		em.remove(colaborador);
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
