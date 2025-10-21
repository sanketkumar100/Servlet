package org.example;

import javax.servlet.*;

public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("✅ Application Started: ServletContext created");
        ServletContext context = event.getServletContext();
        context.setAttribute("appName", "My Servlet App");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("🛑 Application Stopped: ServletContext destroyed");
    }
}
