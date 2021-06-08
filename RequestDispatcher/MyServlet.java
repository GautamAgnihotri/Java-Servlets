
package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
     public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        RequestDispatcher rd;
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
               
                out.println("<h2>Welcome to MY Servlet</h2>");
                String name= request.getParameter("user_name");
                String password= request.getParameter("user_password");
               
                if (name=="Gautam" && password=="123456"){
                   
                    rd=request.getRequestDispatcher("SuccessfulLogin.java");
                    rd.forward(request,response);
                }
                else{
                    out.println("<h1>Incorrect user name or password</h1>");
                     rd=request.getRequestDispatcher("/index.html");
                     rd.include(request, response);
                }
                out.println("<h2> Name : "+ name +"</h2>");
                
                
        }
        
    }