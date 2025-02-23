<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, models.Adivinanza, controllers.Adivinanzas"%>

<%
    List<Adivinanza> adivinanzas = Adivinanzas.listarAdivinanzas(2);
    session.setAttribute("adivinanzas",adivinanzas);
    session.setAttribute("puntaje", 0);
    session.setAttribute("idAdivinanza", 0);
    session.setAttribute("nombre", request.getParameter("nombre"));
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Adivinanzas</title>
        <meta charset="UTF-8"/>
    </head>

    <body>
        <h2>
            Bienvenido ${session.getId()}
        </h2>
        <c:set var="adivinanza" value="${adivinanzas[idAdivinanza]}" />
        <h1>${adivinanza.pregunta}</h1>
        <form action="verificarPregunta.jsp" method="post">
            <div>
                <input type="radio" name="respuesta" value="${adivinanza.respuestaCorrecta}">
                ${adivinanza.respuestaCorrecta}
                <br><input type="radio" name="respuesta" value="${adivinanza.respuestaErrada}">
                ${adivinanza.respuestaErrada}
            </div>
            <br>
            <div>
                <input type="submit" value="Siguiente">
            </div>
        </form>
    </body>
</html>
