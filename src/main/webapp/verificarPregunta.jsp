<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, models.*, controllers.*"%>

<%
    String respuesta = request.getParameter("respuesta");
    List<Adivinanza> adivinanzas = (List<Adivinanza>)session.getAttribute("adivinanzas");
    String nombre = (String)session.getAttribute("nombre");
    int puntaje = (int)session.getAttribute("puntaje");
    int idAdivinanza = (int)session.getAttribute("idAdivinanza");

    Adivinanza adivinanzaActual = adivinanzas.get(idAdivinanza);

    if(respuesta != null && respuesta.equals(adivinanzaActual.getRespuestaCorrecta())){
        puntaje++;
        session.setAttribute("puntaje",puntaje);
    }
    idAdivinanza++;
    session.setAttribute("idAdivinanza",idAdivinanza);
    session.setAttribute("nombre", nombre);
    if(idAdivinanza >= adivinanzas.size() || puntaje >= 2){
        response.sendRedirect("resultados.jsp");
    }else{
        response.sendRedirect("quiz.jsp");
    }
%>