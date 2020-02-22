package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Produto;

public class TesteRemocao {

	public static void main(String[] args) {

		// criar o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// pesquisar um produto pelo código
		Produto prod = em.find(Produto.class, 2);
		
		// remove o produto
		em.remove(prod);

		// commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		System.out.println(prod.getNome());

		// fechar as paradas
		em.close();
		fabrica.close();

	}

}
