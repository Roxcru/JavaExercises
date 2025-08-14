import com.sun.source.tree.NewArrayTree;
import feature.Car;
import feature.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");

        Car l = new Car();

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

        Usuario user = new Usuario("Juan", "Flores","Gerente","43532123");
        user.mostrarDNI();
        user.cambiarDNI("64768673");
        user.mostrarDNI();

        Scanner obj = new Scanner(System.in);

//        System.out.println("Ingresar el primer numero");
//        int primerNumero = obj.nextInt();
//        //String name = obj.nextLine();
//
//        System.out.println("Ingresar el segundo numero");
//        int age = obj.nextInt();
//        int resultado = primer
//        System.out.println("La suma de los 2 numeroes es: " + resultado);

        System.out.println("Ingresar el primer numero");
        int primerNumero = obj.nextInt();

        System.out.println("Ingresar el segundo numero");
        int segundoNumero = obj.nextInt();
        int resSuma = primerNumero + segundoNumero;
        int resResta = primerNumero - segundoNumero;
        int resMultiplicacion = primerNumero * segundoNumero;
        int resDivision = primerNumero / segundoNumero;

        System.out.println("La suma de los 2 numero es: " + resSuma);
        System.out.println("La resta de los 2 numero es: " + resResta);
        System.out.println("La multiplicación de los 2 numero es: " + resMultiplicacion);
        System.out.println("La división de los 2 numero es: " + resDivision);
    }
}