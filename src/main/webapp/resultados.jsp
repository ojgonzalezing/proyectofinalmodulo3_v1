<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Resultados</title>
        <meta charset="UTF-8"/>
    </head>
    <body>
        <h1>Resultados</h1>
        <h3>
            Nombre jugador: <%out.print(session.getAttribute("nombre"));%>
        </h3>

        <h3>
            Puntaje Final: <%out.print(session.getAttribute("puntaje"));%>
        </h3>
        <c:set var="puntaje" value="${sessionScope.puntaje}" scope="page"/>
        <c:set var="victorias" value="${sessionScope.victorias}" scope="page"/>
        <c:set var="derrotas" value="${sessionScope.derrotas}" scope="page"/>
        <c:choose>
            <c:when test="${puntaje >= 10}">
                <h2 style="color:blue;"> Ha superado el reto</h2>
            </c:when>
            <c:otherwise>
                <h2 style="color:red;"> El reto lo ha superado</h2>
            </c:otherwise>
        </c:choose>
        <div>
            <table>
                <tr>
                    <th>Retos</th>
                    <th>Victorias</th>
                    <th>Derrotas</th>
                </tr>
                <tr>
                    <td> <% out.print(session.getAttribute("retos")); %></td>
                    <td>${session.getAttribute("victorias")}</td>
                    <td>${session.getAttribute("derrotas")}</td>
                </tr>
            </table>
        </div>
    </body>
</html>