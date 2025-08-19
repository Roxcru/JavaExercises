package feature;

import java.util.*;

public class CollectionGuide {
    public static void main(String[] args) {
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.add(11.3);
        calificaciones.add(18.0);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.5);

        double suma = 0;

        for (Double calificacion: calificaciones){
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();

        System.out.println("Su promedio es: " + promedio);

        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);
        System.out.println("nota alta: " + max);
        System.out.println("nota baja: " + min);

        Map<String, Integer> clase = new HashMap<>();
        clase.put("Pepito",28);
        clase.put("Juan", 34);
        clase.put("Marcelo",65);

        System.out.println("valor: " + clase.get("Pepito"));
        System.out.println("valor: " + clase.containsKey("Juan"));

        for (var obj: clase.entrySet()){
            String nombre = obj.getKey();
            Integer edad = obj.getValue();
            System.out.println(nombre + " -> " + edad);
        }

        clase.forEach((clave,valor) -> System.out.println(clave + " tiene " + valor));


//        Queue<Integer> cola = new PriorityQueue<>(Comparator.comparing(Persona.getNombre));
//        cola.add(new Persona("Luis", 29));
//        cola.add(new Persona("Andre", 14));
//        System.out.println("Return");
    }

//    public static class Persona implements Comparable<Persona> {
//        private  String nombre;
//        private int edad;
//
//        public String getNombre() {
//            return nombre;
//        }
//
//        public void setNombre(String nombre) {
//            this.nombre = nombre;
//        }
//
//
//    }
}
