package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/restaurarmarcadores.jsp")
public class RestaurarMarcadores extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int puntaje = (int)session.getAttribute("puntaje");
        int idAdivinanza = (int) session.getAttribute("idAdivinanza");
        puntaje = 0;
        idAdivinanza = 0;
        session.setAttribute("puntaje", puntaje);
        session.setAttribute("idAdivinanza", idAdivinanza);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/quiz.jsp");
        requestDispatcher.forward(request, response);
    }
}
