package pi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class App
 */
@WebServlet("/App")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public App() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Primeira Servlet</title>");
		out.println("</head>");
		out.println("<style> "
				+ "body{margin:0}"
				+ ".icon-bar{"
				+ "width: 90px;"
				+ "background-color: #555;"
				+ "}"
				+ ".icon-bar a{"
				+ "display:block;"
				+ "text-align:center;"
				+ "padding:16px;"
				+ "transition:all 0.3s ease;"
				+ "color:withe;"
				+ "font-size: 36px;"
				+ "}"
				+ ".icon-bar a:hover{"
				+ "background-color: #000;"
				+ "}"
				+ ".active{"
				+ "background-color: #7bff ;"
				+ "}"
				+ ".dropbtn {"
				+ "background-color: #555;"
				+ "color:white;"
				+ "padding:16px;"
				+ "font-size: 16px;"
				+ "border:none;"
				+ "cursor:pointer;"
				+ "}"
				+ ".dropbtn:hover,"
				
				+ "</style>");
		
		out.println("<div class='icon-bar'>"
				+ "<a class='active' href='#'><i/></a>");
		out.println("<a href='#'><img src='var.png' witdh='30' height='30'></a>");
		out.println("<a href='#'><img src='input.png' witdh='30' height='30'></a>");
		out.println("<a href='#'><img src='processamento.png' witdh='30' height='30'></a>");
		out.println("<a href='#'><img src='output.png' witdh='30' height='30'></a>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
