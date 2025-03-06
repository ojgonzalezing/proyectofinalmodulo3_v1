package controllers;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Adivinanza;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/verificarPregunta.jsp")
public class VerificarPregunta extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String respuesta = request.getParameter("respuesta");
        List<Adivinanza> adivinanzas = (List<Adivinanza>)session.getAttribute("adivinanzas");
        String nombre = (String)session.getAttribute("nombre");
        int puntaje = (int)session.getAttribute("puntaje");
        int idAdivinanza = (int) session.getAttribute("idAdivinanza");

        if(respuesta != null && respuesta.equals(adivinanzas.get(idAdivinanza).getRespuestaCorrecta())){
            puntaje++;
        }
        ++idAdivinanza;
        session.setAttribute("idAdivinanza", idAdivinanza);
        session.setAttribute("nombre", nombre);
        session.setAttribute("puntaje", puntaje);

        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = null;
        if( idAdivinanza >= adivinanzas.size() || puntaje >= 10){
            requestDispatcher = servletContext.getRequestDispatcher("/resultados.jsp");
            requestDispatcher.forward(request, response);
        }else{
            requestDispatcher = servletContext.getRequestDispatcher("/quiz.jsp");
            requestDispatcher.forward(request, response);
        }
    }

}
