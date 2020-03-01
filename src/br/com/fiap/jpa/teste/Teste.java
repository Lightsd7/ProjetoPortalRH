package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.model.dao.TreinamentoDAO;

public class Teste {

	public static void main(String[] args) {
		// Instansiar a fábrica de Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle"); // nome dado na persistence.xml, desconfiar na prova que pode ter pegadinha
		
		// Obter um objeto de Entity Manager
		EntityManager em = fabrica.createEntityManager();
//		
//		Treinamento t = new Treinamento("Arroz", "Cozinhar no fogão", "22/12/2020", "Vila Olímpia");
//		em.persist(t); //Cadastro produto
//		em.getTransaction().begin(); //Começa uma transação
//		em.getTransaction().commit(); //Commit no banco
//		
//		em.close();
//		fabrica.close();
		
		
//		List<Treinamento> results = query.getResultList();
//		System.out.println(results);
		
		TreinamentoDAO t = new TreinamentoDAO();
		t.selecionarTudo();
				
		em.close();
		fabrica.close();		
	}

}
