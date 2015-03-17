/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turniejwknurowie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Marcin
 */
public class TurniejwKnurowie extends HttpServlet {

    /**
     * Processes requests for <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html><head><title>TurniejwKnurowie</title></head>");
            out.println("<body><h1>TurniejwKnurowie</h1>");
            out.println("Hello from turniejwknurowie.TurniejwKnurowie to");
            out.println(request.getParameter("name"));
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
