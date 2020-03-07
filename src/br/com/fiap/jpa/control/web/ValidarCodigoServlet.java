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

import br.com.fiap.jpa.entity.Colaborador;
import br.com.fiap.jpa.model.dao.ColaboradorDAOImpl;

@WebServlet("/logar")
public class ValidarCodigoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher;
		String codigo = req.getParameter("codigo");

		Colaborador colab = new Colaborador();
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		ColaboradorDAOImpl dao = new ColaboradorDAOImpl(em);
		colab = dao.pesquisar(Integer.parseInt(codigo));
//		System.out.println(colab.getDepartamento());
		String erro = "";

		if (colab == null) {
			erro = "erro";
			req.setAttribute("erroId", erro);
			dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
			em.close();
			fabrica.close();
		} else {
			if (colab.getDepartamento().toUpperCase().equals("RH")) {
				try {
					dispatcher = req.getRequestDispatcher("cadastrarTreinamento.jsp");
					dispatcher.forward(req, resp);
					em.close();
					fabrica.close();
				} catch (Exception e) {
					new Exception("RH não conseguiu logar");
					new Exception(e);
					System.out.println("RH não entrou");
				}
			} else {
				try {
					dispatcher = req.getRequestDispatcher("footer.jsp");
					dispatcher.forward(req, resp);
					em.close();
					fabrica.close();
				} catch (Exception e) {
					new Exception("Não conseguiu logar");
					new Exception(e);
					System.out.println("Colaborador não entrou");
				}
			}
		}
	}

}
