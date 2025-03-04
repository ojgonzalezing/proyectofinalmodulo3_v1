package controllers;

import models.Adivinanza;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adivinanzas {

    private static List<Adivinanza> adivianzas;

    static {
        adivianzas = new ArrayList<>();
        adivianzas.add(new Adivinanza("Quien lo fabrica, no lo necesita. Quien lo compra, no lo necesita. Quien lo usa, no lo ve ni lo siente. ¿Qué es?","Un ataúd.","Uno, el último."));
        adivianzas.add(new Adivinanza("Si me dejas caer, seguro que me parto. Dame una sonrisa, y siempre te devolveré otra. ¿Qué soy?","Un espejo.","Una vela."));
        adivianzas.add(new Adivinanza("Entras en una habitación a oscuras y solo tienes una cerilla. Tienes delante un periódico, una vela y un haz de leña. ¿Qué enciendes primero?","La cerilla.","Una vela de cumpleaños."));
        adivianzas.add(new Adivinanza("¿Cuál es la pregunta de dos palabras a la que nunca puedes responder sí?","¿Estás muerto?","Una cadena."));
        adivianzas.add(new Adivinanza("¿Cuántos ladrillos se necesitan para completar un edificio de ladrillo?","Uno, el último.","Un pleito."));
        adivianzas.add(new Adivinanza("Hablo sin boca y oigo sin oídos. No tengo cuerpo, pero cobro vida con el viento. ¿Qué soy?","El eco.","Un paracaídas."));
        adivianzas.add(new Adivinanza("Mides mi vida en horas y yo te sirvo expirando. Soy rápido cuando estoy delgado y lento cuando estoy gordo. El viento es mi enemigo.","Una vela.","Un mapa."));
        adivianzas.add(new Adivinanza("Los pobres lo tienen. Los ricos la necesitan. Si te lo comes te mueres. ¿Qué es?","Nada.","Un hombre. Las horas del día representan toda una vida. Gatea de bebé, camina de adulto y anda con bastón de anciano."));
        adivianzas.add(new Adivinanza("Tengo ciudades, pero no casas. Tengo montañas, pero no árboles. Tengo agua, pero no peces. ¿Qué soy?","Un mapa.","Un espejo."));
        adivianzas.add(new Adivinanza("¿Qué está siempre delante de ti, pero no se ve?","El futuro.","Un camino."));
        adivianzas.add(new Adivinanza("Me encontrarás en Mercurio, la Tierra, Marte, Júpiter, Saturno y Urano. Pero nunca en Neptuno ni en Venus. ¿Qué soy?","La letra R.","Un calcetín."));
        adivianzas.add(new Adivinanza("¿Cuántos meses tienen 28 días?","Todos los meses tienen 28 días.","Un ataúd."));
        adivianzas.add(new Adivinanza("Una mujer dispara a su marido y lo mantiene bajo el agua durante cinco minutos. A continuación, lo ahorca. Justo después, disfrutan de una cena encantadora. ¿Cómo lo explicas?","Le hizo una foto y la reveló en su cuarto oscuro.","Un árbol."));
        adivianzas.add(new Adivinanza("Cuando está viva cantamos, cuando está muerta aplaudimos. ¿Qué es?","Una vela de cumpleaños.","Un anzuelo."));
        adivianzas.add(new Adivinanza("Hago un ruido fuerte cuando me cambio. Cuando me cambio, me hago más grande pero peso menos. ¿Qué soy?","Palomitas de maíz.","Un agujero."));
        adivianzas.add(new Adivinanza("Dos niñas nacieron de la misma madre, el mismo día, a la misma hora, en el mismo mes y año, y sin embargo, no son gemelas. ¿Cómo puede ser?","Las dos niñas son dos de un par de trillizas.","Tu nombre."));
        adivianzas.add(new Adivinanza("Una niña tiene tantos hermanos como hermanas, pero cada hermano tiene solo la mitad de hermanos que hermanas. ¿Cuántos hermanos y hermanas hay en la familia?","Cuatro hermanas y tres hermanos.","Tu mano izquierda."));
        adivianzas.add(new Adivinanza("¿Qué desaparece en cuanto se pronuncia su nombre?","El silencio.","Tu hermana."));
        adivianzas.add(new Adivinanza("¿Cuáles son las tres letras siguientes de esta combinación? UDTCCSS...","OND (Cada letra representa la primera letra de los números escritos: Uno, Dos, Tres, Cuatro, Cinco...).","Todos los meses tienen 28 días."));
        adivianzas.add(new Adivinanza("Esto te pertenece, pero todos los demás lo usan más que tú.","Tu nombre.","Palomitas de maíz."));
        adivianzas.add(new Adivinanza("Primero, piensa en el color de las nubes. Después, piensa en el color de la nieve. Ahora, piensa en el color de una luna llena brillante. Ahora contesta rápidamente: ¿qué beben las vacas?","No es la leche, ¡es agua!","OND (Cada letra representa la primera letra de los números escritos: Uno, Dos, Tres, Cuatro, Cinco...)."));
        adivianzas.add(new Adivinanza("Primero me comes y luego te comen. ¿Qué soy?","Un anzuelo.","No es la leche, ¡es agua!"));
        adivianzas.add(new Adivinanza("¿Qué es más fuerte que el acero, pero no puede soportar el sol?","El hielo.","Nada."));
        adivianzas.add(new Adivinanza("¿Qué es lo que nadie quiere, pero nadie quiere perder?","Un pleito.","Los fuegos artificiales."));
        adivianzas.add(new Adivinanza("Cuanto más hay, menos se ve. ¿Qué soy?","La oscuridad.","Los cocos."));
        adivianzas.add(new Adivinanza("¿Cómo suman ocho ochos mil?","888 + 88 + 8 + 8 + 8 = 1000.","Los cerillas."));
        adivianzas.add(new Adivinanza("¿Qué puedes tener en la mano derecha, pero nunca en la izquierda?","Tu mano izquierda.","Llenó un vaso de agua y lo mantuvo sobre su cabeza durante 10 minutos."));
        adivianzas.add(new Adivinanza("Un hombre condujo de Madrid a Moscú en cuatro días. Al final de su viaje, descubrió que una de sus ruedas estaba pinchada. ¿Cómo pudo hacer el viaje?","Era la rueda de repuesto.","Le hizo una foto y la reveló en su cuarto oscuro."));
        adivianzas.add(new Adivinanza("Un mago presumía de cuánto tiempo podía aguantar la respiración bajo el agua. Su récord era de 6 minutos. Un niño que estaba escuchando dijo: eso no es nada, ¡yo puedo aguantar bajo el agua 10 minutos!. El mago le dijo al niño que si podía hacer eso, le daría mil euros. El niño lo hizo y ganó el dinero. ¿Cómo lo hizo?","Llenó un vaso de agua y lo mantuvo sobre su cabeza durante 10 minutos.","Lástima (o leche desnatada)."));
        adivianzas.add(new Adivinanza("Estoy lleno de agujeros, pero soy fuerte como el acero. ¿Qué soy?","Una cadena.","Las horas."));
        adivianzas.add(new Adivinanza("Un barril de agua pesaba 60 kilos. Alguien puso algo en él y ahora pesa 40 kilos. ¿Qué añadió esa persona?","Un agujero.","Las dos niñas son dos de un par de trillizas."));
        adivianzas.add(new Adivinanza("Tú eres mi hermano, pero yo no soy tu hermano. ¿Quién soy yo?","Tu hermana.","La oscuridad."));
        adivianzas.add(new Adivinanza("Dos hombres están en un desierto. Ambos llevan mochilas. Uno de ellos está muerto. El que está vivo tiene la mochila abierta y el que está muerto la tiene cerrada. ¿Qué hay en la mochila del muerto?","Un paracaídas.","La nariz y la boca."));
        adivianzas.add(new Adivinanza("Solo me tumbo una vez en la vida: cuando muero. ¿Qué soy?","Un árbol.","La letra R."));
        adivianzas.add(new Adivinanza("¿Qué camina sobre cuatro pies por la mañana, dos por la tarde y tres por la noche?","Un hombre. Las horas del día representan toda una vida. Gatea de bebé, camina de adulto y anda con bastón de anciano.","La guitarra."));
        adivianzas.add(new Adivinanza("Es suave por dentro y peludo por fuera. Con un poco de esfuerzo, lo podrás meter dentro.","Un calcetín.","La goma de borrar"));
        adivianzas.add(new Adivinanza("Bolas grandes, colgantes, gordas y peludas que son voluminosas y hermosas.","Los cocos.","La cerilla."));
        adivianzas.add(new Adivinanza("¿Qué puede dar una vaca flaca?","Lástima (o leche desnatada).","Era la rueda de repuesto."));
        adivianzas.add(new Adivinanza("Todos me pisan a mí, pero yo no piso a nadie; todos preguntan por mí, yo no pregunto por nadie.","Un camino.","El té."));
        adivianzas.add(new Adivinanza("Brazos con brazos, panza con panza, rascando en medio, surge la danza.","La guitarra.","El silencio."));
        adivianzas.add(new Adivinanza("Tengo llaves pero no cerradura. El blanco y el negro pasan por mi cintura.","El kárate.","El Rosario."));
        adivianzas.add(new Adivinanza("Vengo y voy, voy y vengo dejando blanco lo que era negro.","La goma de borrar","El kárate."));
        adivianzas.add(new Adivinanza("Doce señoras, todas con medias y sin zapatos.","Las horas.","El humo."));
        adivianzas.add(new Adivinanza("Te lo digo y te lo repito, y te lo puedo avisar, y por más que te lo diga no lo vas a adivinar.","El té.","El hielo."));
        adivianzas.add(new Adivinanza("Somos muchos hermanitos, en una sola casa vivimos, si nos rascan la cabeza al instante morimos.","Los cerillas.","El futuro."));
        adivianzas.add(new Adivinanza("Tres cuevas en la montaña, en dos el aire va a entrar y la tercera el vidrio empaña.","La nariz y la boca.","El eco."));
        adivianzas.add(new Adivinanza("Va al campo y no come, va al río y no bebe y con sonar se mantiene.","El cencerro.","El cencerro."));
        adivianzas.add(new Adivinanza("Cincuenta damas, cinco galanes; ellos piden pan, ellas piden ave.","El Rosario.","Cuatro hermanas y tres hermanos."));
        adivianzas.add(new Adivinanza("Antes que nazca la madre, anda el hijo por la calle.","El humo.","888 + 88 + 8 + 8 + 8 = 1000."));
        adivianzas.add(new Adivinanza("Se viste el cielo de luces en cascada de colores, para alegrar en la noche a los que están más tristones.","Los fuegos artificiales.","¿Estás muerto?"));

    }

    public static List<Adivinanza> listarAdivinanzas(int numeroAdivinanzas){
        List<Adivinanza> copiaLIstaAdivinanzas = new ArrayList<>(adivianzas);
        Collections.shuffle(copiaLIstaAdivinanzas);
        return copiaLIstaAdivinanzas.subList(0, numeroAdivinanzas);
    }
}
