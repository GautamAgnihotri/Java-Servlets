import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
          PrintWriter out=response.getWriter();  
    out.print("filter is invoked before");  
          
    chain.doFilter(request, response);//sends request to next resource  
          
    out.print("filter is invoked after");  
       
       
    }
    public void destroy() {        
    }

    

    
