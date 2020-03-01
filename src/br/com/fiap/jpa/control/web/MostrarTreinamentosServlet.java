package br.com.fiap.jpa.control.web;

import java.io.IOException;

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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		TreinamentoDAO dao = new TreinamentoDAO();
		dao.selecionarTudo();
		RequestDispatcher dispatcher;
		req.setAttribute("tudo", dao);
		req.setAttribute("mensagem", "Todos os treinamentos.");
		dispatcher = req.getRequestDispatcher("cadastrarPessoa.jsp");
		dispatcher.forward(req, resp);
	}

}
