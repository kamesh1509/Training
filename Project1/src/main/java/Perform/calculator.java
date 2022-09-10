package Perform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		 PrintWriter out = response.getWriter();
         String n1 = request.getParameter("txt1");
         String n2 = request.getParameter("txt2");
         String n3 = request.getParameter("txt3");
         String op = request.getParameter("op");                
 switch (op) {
     case "Addition":
         out.println("Answer = "+(Integer.parseInt(n1) + Integer.parseInt(n2) + Integer.parseInt(n3)));
         break;
     case "Subtraction":
         out.println("Answer = "+(Integer.parseInt(n1) - Integer.parseInt(n2) - Integer.parseInt(n3)));
         break;
     case "multiplication":
         out.println("Answer = "+(Integer.parseInt(n1) * Integer.parseInt(n2) * Integer.parseInt(n3)));
         break;
   
        } 
 
      } 
	}


