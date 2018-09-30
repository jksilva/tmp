package pi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pi.AppPackage;
import pi.AppClasse;

/**
 * Servlet implementation class Config1
 */
@WebServlet("/config1")
public class Config1 extends HttpServlet {
	int x=0;
	
	List flow = new ArrayList();
	int p = 0;
	int c =0;
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config1() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button = request.getParameter("button");
		AppPackage app = new AppPackage();
		AppClasse appc= new AppClasse();
		AppVar appv= new AppVar();
		
		switch(button){
			case "button1":
				
					if(p>0){
						
					}else{
					p=p+1;	
					app.setNome(Integer.toString(flow.size()));
					flow.add(0, app);
					}
				
				
				
			break;
			case "button2":
				if(c>0){
					
				}else{
					if(p==0){
					p=p+1;
					app.setNome(Integer.toString(flow.size()));
					flow.add(0, app);
					}
					c=c+1;
					appc.setNome(Integer.toString(flow.size()));
					flow.add(1, appc);
				
				}
				break;
			case "button3":
				
				if(c>0){
					
				}else{
					if(p==0){
					p=p+1;
					app.setNome(Integer.toString(flow.size()));
					flow.add(0, app);
					}
					c=c+1;
					appc.setNome(Integer.toString(flow.size()));
					flow.add(1, appc);
				
				}
				
				appv.setNome(Integer.toString(flow.size()));
				flow.add(appv);
				
				break;
			case "buttonx":
				flow.clear();
				c=0;
				p=0;
				break;
		}
		
        	PrintWriter out = response.getWriter();
        	out.println("<!DOCTYPE html>");
        	out.println("<html>");

        	out.println("<head>");
        	out.println("<meta charset='UTF-8'>");
        	out.println("  <link rel='stylesheet' type='text/css' href='app.css'> </head>");

        	out.println("<body>");
        	out.println("  <div id='mySidenav' class='sidenav'>");
        	out.println("    <a href='javascript:void(0)' class='closebtn' onclick='closeNav()'>×</a>");
        	 
        	out.println("    <form action='config1' method='post'>");
        	out.println("      <button type='submit' name='button' value='buttonx' class='config rd1'><span>Clear </span></button>");
        	
        	out.println("    </form>");
        	out.println("<br>");
        	out.println("    <form action='config1' method='post'>");
        	out.println("      <button type='submit' name='button' value='button1' class='config'><span>Packge </span></button>");
        	out.println("      <button type='submit' name='button' value='button2' class='config'><span>Classe </span></button>");
        	out.println("      <button type='submit' name='button' value='button3' class='config'><span>Variável </span></button>");
        	out.println("      <button type='submit' name='button' value='button4' class='config'><span>Conexão BD</span></button>");
        	out.println("    </form>");
        	out.println("    <br>");
        	out.println("    <form action='${pageContext.request.contextPath}/input1' method='post'>");
        	out.println("      <button type='submit' name='button1' value='button5' class='config input'><span>In Console </span></button>");
        	out.println("      <button type='submit' name='button2' value='button6' class='config input'><span>In TextField</span></button>");
        	out.println("      <button type='submit' name='button3' value='button7' class='config input'><span>In Button</span></button>");
        	out.println("      <button type='submit' name='button4' value='button8' class='config input'><span>In Select/BD</span></button>");
        	out.println("    </form>");
        	out.println("    <br>");
        	out.println("    <form action='${pageContext.request.contextPath}/process1' method='post'>");
        	out.println("      <button type='submit' name='button1' value='button9' class='config process'><span>Conversão/Var </span></button>");
        	out.println("      <button type='submit' name='button2' value='button10' class='config process'><span>Try/Catch </span></button>");
        	out.println("      <button type='submit' name='button3' value='button11' class='config process'><span>While </span></button>");
        	out.println("      <button type='submit' name='button4' value='button12' class='config process'><span>For </span></button>");
        	out.println("      <button type='submit' name='button5' value='button13' class='config process'><span>If/Else </span></button>");
        	out.println("      <button type='submit' name='button6' value='button14' class='config process'><span>Switch/Case </span></button>");
        	out.println("    </form>");
        	out.println("    <br>");
        	out.println("    <form action='${pageContext.request.contextPath}/output1' method='post'>");
        	out.println("      <button type='submit' name='button1' value='button15' class='config output'><span>Out Console </span></button>");
        	out.println("      <button type='submit' name='button2' value='button16' class='config output'><span>Out File </span></button>");
        	out.println("      <button type='submit' name='button3' value='button17' class='config output'><span>Out Update/BD</span></button>");
        	out.println("      <button type='submit' name='button4' value='button18' class='config output'><span>Out Inser/BD</span></button>");
        	out.println("    </form>");
        	out.println("  </div>");
        	out.println("  <div id='main'>");
        	out.println("    <h2 class='text-center'>Vamos começar, clique no botão abaixo para revelar os recursos</h2> ");
        	out.println("    <span style='font-size:30px;cursor:pointer' onclick='openNav()'>☰ Recursos</span>");
        	out.println("     </div>");
        	out.println("  <script>");
        	out.println("    function openNav() {");
        	out.println("        document.getElementById('mySidenav').style.width = '250px';");
        	out.println("        document.getElementById('main').style.marginLeft = '250px';");
        	out.println("    }");
        	out.println("    function closeNav() {");
        	out.println("        document.getElementById('mySidenav').style.width = '0';");
        	out.println("        document.getElementById('main').style.marginLeft= '0';");
        	out.println("    }");
        	out.println("  </script>");
        	
        
						
        	
        	for (int i = 0; i <= flow.size(); i++) {
        		
        		
        		out.println("<table>");
        		switch(flow.get(i).getClass().toString()){
        		case "class pi.AppPackage":
        			AppPackage cc1= (AppPackage) flow.get(i);
        			out.println("<tr><td>");
        			out.println("<input type='button' class='buttonp' value='"+cc1.getNome()+"'>");
        			out.println("</td><td>");
        			
        			
        			out.println(cc1.codigo());
        			out.println("</td></tr>");
        			break;
        		case "class pi.AppClasse":
        			AppClasse cc2= (AppClasse) flow.get(i);
        			out.println("<tr><td>");
        			out.println("<input type='button' class='buttonp' value='"+cc2.getNome()+"'>");
        			out.println("</td><td>");
        			
        			
        			out.println(cc2.codigo());
        			out.println("</td></tr>");
    				break;
        		case "class pi.AppVar":
        			AppVar cc3= (AppVar) flow.get(i);
        			out.println("<tr><td>");
        			out.println("<input type='button'  onclick='hvar()' class='buttonp' value='"+cc3.getNome()+"'>");
        			
        			out.println("</td><td>");
        			
        			
        			out.println(cc3.codigo());
        			
        			
        			out.println("</td></tr>");
    				break;
        		}
        		
        			
		        			  							
							
        			
        		
        		
        		
        		
			}
        		out.println("<script>\n"
        				+ "function hvar() {\n"
        				+ "document.getElementById('appvar').style");
        	out.println("</body>");

        	out.println("</html>");
        	
       
        
        
        
    }

}
