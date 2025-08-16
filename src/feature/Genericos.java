package feature;

import java.util.ArrayList;
import java.util.Collection;

public class Genericos {
    public static void main(String[] args) {
        Collection<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        System.out.println("Tamaños " + colores.size());
    }
}
