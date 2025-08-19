package ProyectoFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroPersonal {

    static List<Personal> lstPersonal = new ArrayList<>();

    public static void main(String[] args) {
        lstPersonal = listaPersonal();
        listarMenu();
    }

    public static class Personal implements Comparable<Personal>{

        private String codigo;
        private String nombre;
        private String apellido;
        private String area;
        private int edad;

        public Personal() {

        }

        public Personal(String codigo, String nombre, String apellido, String area, int edad) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.apellido = apellido;
            this.area = area;
            this.edad = edad;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public int compareTo(Personal o) {
            return Integer.compare(this.edad, o.edad);
        }
    }

    public static void listarMenu(){
        Scanner sc = new Scanner(System.in);

        //Menu
        System.out.println("=============================MENU=============================");
        System.out.println("1. Ver los usuarios");
        System.out.println("2. Agregar nuevo usuarios");

        int opcMenu = sc.nextInt();

        switch (opcMenu) {
            case 1:
                lstPersonal.forEach(personal -> {
                    System.out.println(
                            "|Codigo: " + personal.codigo + "\t" +
                                    "|Nombre: " + personal.nombre + "\t" +
                                    "|Apellido: " + personal.apellido + "\t" +
                                    "|Area: " + personal.area + "\t" +
                                    "|Edad: " + personal.edad + "|"
                    );
                });
                System.out.println("\n");
                break;
            case 2:
                registrarPersonal();
                System.out.println("Se registro correctamente");
                System.out.println("\n");
                break;
        }
        listarMenu();
    }

    public static List<Personal> listaPersonal(){
        //Lista de Personal
        List<Personal> lstPersonal = new ArrayList<>();

        lstPersonal.add(new Personal(
                "001",
                "Juan",
                "Flores",
                "Contabilidad",
                35));

        lstPersonal.add(new Personal(
                "002",
                "Rosa",
                "Galvez",
                "Administración",
                35));

        lstPersonal.add(new Personal(
                "003",
                "Carolina",
                "Martinez",
                "Marketing",
                23));


        lstPersonal.add(new Personal(
                "004",
                "Matias",
                "Rodriguez",
                "Contabilidad",
                40));

        return lstPersonal;
    }

    public static List<Personal> registrarPersonal(){

        Personal personal = new Personal();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Registrar Nombre:");
        String nombre = sc2.nextLine();
        System.out.println("Registrar Apellido:");
        String apellido = sc2.nextLine();
        System.out.println("Elegir el Area:");
        Object array[][] = {
                {1,"Contabilidad"},
                {2,"Administración"},
                {3,"Marketing"},
                {4,"Mantenimiento"},
                {5,"Almacen"}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println("(" + array[i][0] + ") - " + array[i][1]);
        }
        int idArea = sc2.nextInt();
        String area = array[idArea-1][1].toString();
        System.out.println("Registrar Edad:");
        int edad = sc2.nextInt();

        // Calcular el código
        String codigo = "000" + Integer.toString((lstPersonal.size() + 1));
        int longitud = codigo.length();

        personal.codigo = codigo.substring(longitud - 3, 4);
        personal.nombre = nombre;
        personal.apellido = apellido;
        personal.area = area;
        personal.edad = edad;

        lstPersonal.add(personal);

        return lstPersonal;
    }


    public class MantenimientoPersonal {
        private List<Personal> lstPersonal = new ArrayList<>();

        public void addPersonal(Personal personal){
            lstPersonal.add(personal);
        }

    }
}
