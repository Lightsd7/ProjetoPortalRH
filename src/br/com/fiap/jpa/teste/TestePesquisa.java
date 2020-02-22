package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Produto;

public class TestePesquisa {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		Produto prod = em.find(Produto.class, 3);

		System.out.println("Nome: " + prod.getNome() + " Valor: R$" + prod.getValor());
		System.out.println(prod.getValorLiquido());
		
		//Alterar o valor do produto
		prod.setValor(1500);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Nome: " + prod.getNome() + " Valor: R$" + prod.getValor());
		
		em.close();
		fabrica.close();
	}

}
