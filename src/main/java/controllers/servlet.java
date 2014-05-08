package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by paulomcnally on 5/8/14.
 */
@WebServlet( name = "ser", urlPatterns = "/")
public class servlet extends HttpServlet {

    protected void doGet( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.getWriter().write("Hola mundo");


    }
}
