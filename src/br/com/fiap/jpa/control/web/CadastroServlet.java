package br.com.fiap.jpa.control.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.jpa.entity.Treinamento;
import br.com.fiap.jpa.model.dao.TreinamentoDAO;

@WebServlet("/cadastro-treinamento")
public class CadastroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String nome = req.getParameter("nome");
			String descricao = req.getParameter("descricao");
			String data = req.getParameter("data");
			String local = req.getParameter("local");

			Treinamento treinamento = new Treinamento(nome, descricao, data, local);
			new TreinamentoDAO().adicionar(treinamento);

			req.setAttribute("treinamento", treinamento);
			req.setAttribute("mensagem", "Cadastro realizado com sucesso!");

			req.getRequestDispatcher("confirmacao.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
