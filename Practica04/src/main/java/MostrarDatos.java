

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarDatos
 */
@WebServlet("/MostrarDatos")
public class MostrarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String apellidoP = request.getParameter("apellidoP");
		String apellidoM = request.getParameter("apellidoM");
		String edad = request.getParameter("edad");
		String genero = request.getParameter("genero");
		String cuenta = request.getParameter("noCuenta");
		String ano = request.getParameter("ano");
		
		try {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Datos</title>");
			out.println("<body>");
			out.println("<h2>Datos recabados</h2>");
			out.println("<h3>Nombre: "+nombre+"</h3>");
			out.println("<h3>Apellido Paterno: "+apellidoP+"</h3>");
			out.println("<h3>Apellido Materno: "+apellidoM+"</h3>");
			out.println("<h3>Edad: "+edad+"</h3>");
			out.println("<h3>Genero: "+genero+"</h3>");
			out.println("<h3>Número de cuenta: "+cuenta+"</h3>");
			out.println("<h3>Año: "+ano+"</h3>");
			out.println("</body>");
			out.println("</html>");
			
		}finally {
			out.close();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
