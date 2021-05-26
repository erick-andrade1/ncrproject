package proj;

import java.io.IOException;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/cadastro")
public class DoGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource
	private UserTransaction ut;
	
	@PersistenceContext
	private EntityManager em;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto p = new Produto();
		
		p.setDescricao("Carne");
		p.setPreco(55.0);

		try {
			ut.begin();
			em.persist(p);
			ut.commit();
		} catch(Exception e) {
			throw new ServletException(e);
		}
		
		response.getWriter().append("Produto criado com o código = "+p.getCodigo());
		
	}

}
