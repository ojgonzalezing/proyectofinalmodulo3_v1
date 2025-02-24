<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Resultados</title>
        <meta charset="UTF-8"/>
    </head>
    <body>
        <h1>Resultados</h1>
        <h3>
            Nombre jugador: <% out.print(session.getAttribute("nombre")); %>
        </h3>
        <h3>
            Puntaje Final: <% out.print(session.getAttribute("puntaje")); %>
        </h3>

    </body>
</html>