package controllers;
import jakarta.servlet.RequestDispatcher;
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

        Adivinanza adivinanzaActual = null;
        if(adivinanzas.contains(idAdivinanza)){
            adivinanzaActual = adivinanzas.get(idAdivinanza);
        }

        try{
            if(respuesta != null && respuesta.equals(adivinanzaActual != null ? adivinanzaActual.getRespuestaCorrecta() : null)){
                puntaje ++;
                session.setAttribute("puntaje", puntaje);
            }
        }catch (NullPointerException npex){
            System.out.println("Error de tipo: " + npex.getMessage());
        }
        ++idAdivinanza;
        session.setAttribute("idAdivinanza", idAdivinanza);
        session.setAttribute("nombre", nombre);

        if( idAdivinanza >= adivinanzas.size()){
            RequestDispatcher requestDispatcher;
            requestDispatcher = request.getRequestDispatcher("/resultados.jsp");
            requestDispatcher.forward(request, response);
        }else{
            RequestDispatcher requestDispatcher;
            requestDispatcher = request.getRequestDispatcher("/quiz.jsp");
            requestDispatcher.forward(request, response);
        }
    }

}
