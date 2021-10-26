

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarDatos2
 */
@WebServlet("/MostrarDatos2")
public class MostrarDatos2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatos2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
	
		String turno = request.getParameter("turno");
		String promedio = request.getParameter("promedio");
		String facultad = request.getParameter("fac");
		
		try {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Datos</title>");
			out.println("<body>");
			out.println("<h2>Datos recabados</h2>");
			out.println("<h3>Turno: "+turno+"</h3>");
			out.println("<h3>Promedio: "+promedio+"</h3>");
			out.println("<h3>Facultad: "+facultad+"</h3>");
			out.println("</body>");
			out.println("</html>");
			
		}finally {
			out.close();
		}
	}

}
