package org.example;
import java.io.*;
import javax.servlet.*;
public class Service implements Servlet
{
        ServletConfig config=null;

        public void init(ServletConfig config)
        {
            this.config=config;
        }

        public void service(ServletRequest req, ServletResponse res)throws IOException,ServletException
        {
            res.setContentType("text/html");
            PrintWriter out=res.getWriter();
            String username=req.getParameter("username");
            out.println("<html><body>");
            if(username!=null && !username.isEmpty())
            {
                out.println("<h2>Heloo, " + username + " Welcome to servlet Interface.<h2>");
            }
            else
            {
                out.println("<h2>Hello without username from servlet Interface</h2>");
            }
            out.println("</body></html>");
        }
        public void destroy()
        {
            System.out.println("Servlet created using servlet Interface Destroyed");
        }
        public ServletConfig getServletConfig()
        {
            return config;
        }
        public String getServletInfo()
        {
            return "Servlet creation using servlet Interface";
        }
}
