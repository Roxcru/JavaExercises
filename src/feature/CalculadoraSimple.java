package feature;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        System.out.println("Calculadora simple");
        System.out.println("=============================");

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar la operación");
        System.out.println("Suma: (+) Resta: (-) División (/) Multiplicación: (*)");
        String operacion = sc.nextLine();

        System.out.println("Ingresar el primer numero");
        double primerNumero = sc.nextDouble();

        System.out.println("Ingresar el segundo numero");
        double segundoNumero = sc.nextDouble();
        double valorResultante = 0;

        switch (operacion){
            case "+":
                valorResultante = primerNumero + segundoNumero;
                break;
            case "-":
                valorResultante = primerNumero - segundoNumero;
                break;
            case "*":
                valorResultante = primerNumero * segundoNumero;
                break;
            case "/":
                if( segundoNumero==0 ){
                    System.out.println("El segundo valor debe ser diferente a 0");
                    sc.close();
                    System.exit(0);
                }
                valorResultante = primerNumero / segundoNumero;
                break;
            default:
                System.out.println("Operación no valida");
        }

        // Como comprobar que alguien es mayor de edad, la edad tiene que ser mayor o igual a 18
        System.out.println("=============================");
        System.out.println("Valor resultante: " + valorResultante);

        sc.close();
    }
}
