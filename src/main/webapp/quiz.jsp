<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, models.*, controllers.Adivinanzas"%>

<%
    List<Adivinanza> adivinanzas = Adivinanzas.listarAdivinanzas(15);
    session.setAttribute("adivinanzas",adivinanzas);
    if(session.getAttribute("idAdivinanza") == null){
        session.setAttribute("idAdivinanza", 0);
    }
    session.setAttribute("nombre", session.getAttribute("nombre"));
    if(session.getAttribute("nombre") == null){
        session.setAttribute("nombre", request.getParameter("nombre"));
    }
    session.setAttribute("puntaje", session.getAttribute("puntaje"));
    if(session.getAttribute("puntaje") == null){
        session.setAttribute("puntaje", 0);
    }

    session.setAttribute("retos", session.getAttribute("retos"));
    if(session.getAttribute("retos") == null){
        session.setAttribute("retos",0);
    }
    session.setAttribute("victorias", session.getAttribute("victorias"));

    if (session.getAttribute("victorias") == null){
        session.setAttribute("victorias",0);
    }

    session.setAttribute("derrotas",session.getAttribute("derrotas"));
    if (session.getAttribute("derrotas") == null){
        session.setAttribute("derrotas", 0);
    }

%>

<!DOCTYPE html>
<html>
    <head>
        <title>Adivinanzas</title>
        <meta charset="UTF-8"/>
    </head>

    <body>
        <h2>
            Bienvenido
            <%
                out.print(session.getAttribute("nombre"));
            %>
        </h2>

        <h3>
            Contador de adivinanzas:
            <% out.print(session.getAttribute("idAdivinanza"));
            %>
        </h3>
        <h3>
            Su puntaje:
            <%
                out.print(session.getAttribute("puntaje"));
            %>
        </h3>
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
                <input type="submit" formaction="resultados.jsp" value="Finalizar">
            </div>
        </form>
    </body>
</html>
