import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejemplos");
        System.out.println("=============================");
        int finHeat= 6;

        for (int j = 1; j < finHeat; j++) {
            System.out.print("Tabla: " +  j + "\t");
        }
        System.out.println("|");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < finHeat; j++) {
                System.out.print(i + " x " + j + " = " +(i*j) + "\t");
            }
            System.out.println("|");
        }
    }
}
