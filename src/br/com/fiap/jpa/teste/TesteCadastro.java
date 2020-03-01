package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Categoria;
import br.com.fiap.jpa.entity.Produto;

public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Instanciar produto
		Produto prod = new Produto("Xiaomi", 1200, 950, null, null, Categoria.ELETRONICO);
		
		em.persist(prod); //Cadastro produto
		
		em.getTransaction().begin(); //Começa uma transação
		em.getTransaction().commit(); //Commit no banco
		
		em.close();
		fabrica.close();
	}

}
