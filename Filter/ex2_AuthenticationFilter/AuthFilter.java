
package org.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AuthFilter implements Filter
{
    @Override
    public void init(FilterConfig filterconfig)throws ServletException
    {
        System.out.println("AuthenticationFilter Initialized");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException
    {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        response.setContentType("text/html");

        String user = request.getParameter("username");

        if ("admin".equals(user)) {
            chain.doFilter(req, res); // allow request
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Access Denied</h3>");
        }
    }

        @Override
        public void destroy()
        {
            System.out.println("AuthenticationFilter destroyed");
        }
    }

