package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		// Instansiar a fábrica de Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle"); // nome dado na persistence.xml, desconfiar na prova que pode ter pegadinha
		
		// Obter um objeto de Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		
		
		em.close();
		fabrica.close();
	}

}
