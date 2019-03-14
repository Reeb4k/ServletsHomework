package com.homework.level1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

@WebServlet(urlPatterns = "/display")
public class DisplayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {


        String name = req.getParameter("name");

resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.print("<html>" +
                    "<head>" +
                    "<title> Name entered </title>" +
                    "</head>" +
                    "<body>" +
                    "<h1 align= \"center\"> You look terrific today " + name + "! </h1>" +
                    "</body>" +
                    "</html>");



    }
}
