package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Categoria;
import br.com.fiap.jpa.entity.Produto;

public class TesteAtualizacao {

	public static void main(String[] args) {

		// Criar o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		// Instanciar um produto com o id que existe no banco
		Produto prod = new Produto("Samsung", 5000, 4700, null, null, Categoria.ELETRODOMESTICO);
		prod.setCodigo(1);
		
		// realizar o merge (passar o produto para o entity manager gerenciar)
		em.merge(prod);

		// commit
		em.getTransaction().begin();
		em.getTransaction().commit();

		// fechar as paradas
		em.close();
		fabrica.close();
	}

}
