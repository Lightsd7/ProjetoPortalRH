package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Treinamento;

public class TesteCadastrarTreinamento {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Instanciar produto
		Treinamento treinamento = new Treinamento("React", "Desenvolvimento", "03/04/2020", "Av. Paulista",20);
		
		em.persist(treinamento); //Cadastro produto
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
}
