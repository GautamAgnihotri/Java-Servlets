import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Cookie2 extends HttpServlet {

    

   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       Cookie c[]=request.getCookies();
      out.println("c length"+c.length);
      for(int i=0;i<c.length;i++){
          out.println("cookie name ="+c[i].getName()+"cookie value ="+c[i].getValue());
          Cookie c1=new Cookie("c2","054");
          response.addCookie(c1);
          String path="/Cookie/Cookie3";
          out.println("<a href="+path+">CLick me</a>");
          
          
          
      }
       
    }

 
    }
