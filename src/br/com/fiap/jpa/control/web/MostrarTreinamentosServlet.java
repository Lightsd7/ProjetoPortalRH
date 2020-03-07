package br.com.fiap.jpa.control.web;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jpa.model.dao.TreinamentoDAO;

@WebServlet("/cadastrarPessoa")
public class MostrarTreinamentosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		TreinamentoDAO dao = new TreinamentoDAO();
		dao.consulta(em);
		RequestDispatcher dispatcher;
		req.setAttribute("dao", dao);
		req.setAttribute("mensagem", "Todos os treinamentos.");
		dispatcher = req.getRequestDispatcher("cadastrarPessoa.jsp");
		dispatcher.forward(req, resp);
		em.close();
		fabrica.close();
	}

}
