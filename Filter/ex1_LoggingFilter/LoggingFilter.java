package org.example;

import javax.servlet.*;
import java.io.*;

public class LoggingFilter implements Filter
{
    @Override
    public void init(FilterConfig filterconfig)throws ServletException
    {
        System.out.println("LogggingFilter Initialized");
    }

    @Override
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException
    {

        System.out.println("Request received at:"+System.currentTimeMillis());

        //pass the request to next filter or target servlet
        chain.doFilter(req,res);

        System.out.println("Response sent at:"+System.currentTimeMillis());
    }

    @Override
    public void destroy()
    {
        System.out.println("LogggingFilter destroyed");
    }

}
