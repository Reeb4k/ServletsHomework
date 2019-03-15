package com.homework.level1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class DataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.print("<html>" +
                "<head>" +
                "<title> Your Name </title>" +
                "</head>" +
                "<body>" +
                "<h1 align= \"center\"> Hello! Please enter your name, nickname or how you like to be called" +
                " and than push the \"submit\" button! </h1>" +
                "<form action= \"data\" method=\"post\" align=\"center\">" +
                "Your Name: <input type= \"text\" name =\"name\">" +
                "<br>" +
                "<input type= \"submit\" name =\"data\">" +
                "</form></body>" +
                "</html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        if (name != null){

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
            req.getSession().setAttribute("Session attribute", name);
            resp.sendRedirect("/display"); // that line

        } else {
            resp.sendRedirect("/data");
        }


    }
}
