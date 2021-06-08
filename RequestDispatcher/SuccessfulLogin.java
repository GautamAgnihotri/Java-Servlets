package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessfulLogin {
     public void doPost(HttpServletRequest request,HttpServletResponse response)
            		 throws ServletException,IOException
    {   response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("user_name");
        out.println("<h1>"+"Welcome "+username+"</h1>");
    } 
}
