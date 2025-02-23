package controllers;

import models.Adivinanza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adivinanzas {

    private static List<Adivinanza> adivianzas;

    static {
        adivianzas = new ArrayList<>();
        adivianzas.add(new Adivinanza("Blanco es Gallina lo pone y frito se come","El huevo", "El queso"));
        adivianzas.add(new Adivinanza("Redondo redondo barril sin fondo", "El anillo", "La botella"));
    }

    public static List<Adivinanza> listarAdivinanzas(int numeroAdivinanzas){
        List<Adivinanza> copiaLIstaAdivinanzas = new ArrayList<>(adivianzas);
        Collections.shuffle(copiaLIstaAdivinanzas);
        return copiaLIstaAdivinanzas.subList(0, numeroAdivinanzas);
    }
}
