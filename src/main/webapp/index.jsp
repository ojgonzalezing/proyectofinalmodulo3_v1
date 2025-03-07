<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Adivinanzas</h1>
        <form action="quiz.jsp" method="post">
            <h2>Bienvenido ingresa tus datos</h2>
            <div>
                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre" id="nombre"/>
            </div>
            <br>
            <textarea name="instrucciones" cols="50" rows="20" disabled>
Este es un reto de acertar adivinanzas

Se te presentaran 15 adivinanzas aleatorias de un pool de 50 adivinanzas.

Para cada una de las adivinanzas se te darán a escoger 2 respuestas, una de las cuales es la correcta.

Por cada acierto acumularas 1 punto de éxito, las respuestas incorrectas no otorgan puntaje.

Si has acumulado mas de 6 desaciertos, automáticamente se declarará la derrota en el reto.

Si alcanzas un mínimo de 10 puntos habrás ganado, de lo contrario serás derrotado.

En cualquier momento podrás dar por terminado el reto, pero dependiendo de tu puntaje, se sumara a tu contador de retos jugados y a tu contador de victorias/derrotas.

Si lo deseas puedes finalizar tu sesión.
            </textarea>
            <br>
            <br>
            <div>
                <input type="submit" value="Continuar">
            </div>
        </form>
    </body>
</html>