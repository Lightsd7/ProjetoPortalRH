package br.com.fiap.jpa.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Treinamento;

public class TreinamentoDAO {

	public void adicionar(Treinamento treinamento) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		em.persist(treinamento);

		em.getTransaction().begin();
		em.getTransaction().commit();

		em.close();
		fabrica.close();
	}
}
