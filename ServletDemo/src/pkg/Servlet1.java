package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
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
		response.setContentType("text/html");   
		 PrintWriter out = response.getWriter(); 
		 String n=request.getParameter("userName");   
		 String p=request.getParameter("userPass"); 
		 //System.out.println(p);
		 
		ServletContext context=getServletContext();   
		 Enumeration<String> e=context.getInitParameterNames();   
		       
		 String str="";   
		 while(e.hasMoreElements()){   
		     str=e.nextElement(); 
		
		 }
		    //System.out.println(context.getInitParameter(str));
		 if(p.equals(context.getInitParameter(str)))
				 {   
			         RequestDispatcher rd=request.getRequestDispatcher("servlet2");   
			         rd.forward(request, response);   
			     }   
			    else{   
			         out.print("Sorry UserName or Password Error!");   
			         RequestDispatcher rd=request.getRequestDispatcher("/Login.html");   
			         rd.include(request, response);   
			                        
			        } 

	}

}
