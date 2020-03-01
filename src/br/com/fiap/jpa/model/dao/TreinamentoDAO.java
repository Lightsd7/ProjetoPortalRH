package br.com.fiap.jpa.model.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.jpa.entity.Treinamento;

public class TreinamentoDAO {

	private static TreinamentoDAO instance;
	protected EntityManager entityManager;

	public static TreinamentoDAO getInstance() {
		if (instance == null) {
			instance = new TreinamentoDAO();
		}

		return instance;
	}

	public TreinamentoDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

//	public void adicionar(Treinamento treinamento) {
//
//		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
//		EntityManager em = fabrica.createEntityManager();
//
//		em.persist(treinamento);
//
//		em.getTransaction().begin();
//		em.getTransaction().commit();
//
//		em.close();
//		fabrica.close();
//	}

	public void adicionar(Treinamento treinamento) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(treinamento);
			entityManager.getTransaction().commit();
			System.out.println("Salvou no banco!");
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
			System.out.println("Não salvou no banco!");
		}
	}
	
	public Treinamento selecionarTudo() {
		String hql = "from Treinamento";
		Query query = entityManager.createQuery(hql);
		List l = query.getResultList();
		System.out.println(l.size());
		Iterator it = l.iterator();
		while(it.hasNext())
	    {
			Treinamento t = (Treinamento)it.next();
//			System.out.println("ID_TREINAMENTO: "+ t.getId());
//	        System.out.println("Nome do Treinamento : "+t.getNome());
//	        System.out.println("Descrição do treinamento: "+t.getDescricao());
//	        System.out.println("Data do treinamento: "+t.getDataTreinamento());
//	        System.out.println("Local do treinamento: "+t.getLocal());
//	        System.out.println("----------------------------------------------");
			return new Treinamento(t.getNome(), t.getDescricao(), t.getDataTreinamento(), t.getLocal());
	        
	    }
		return null;
	}
}
