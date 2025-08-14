package feature;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        System.out.println("Conversor de monedas");
        System.out.println("=============================");

        Scanner sc = new Scanner(System.in);

        Object array[][] = {
                {1,"Dolares"},
                {2,"Euros"},
                {3,"Yenes"},
                {4,"Rublos"}
        };

        System.out.println("Ingresar el tipo de moneda");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " - " + array[i][1]);
        }

        int operacion = sc.nextInt();
        double valotTipoCambio = 0;
        String moneda = "";
        switch (operacion){
            case 1:
                valotTipoCambio = 3.54;
                moneda = "Dolares";
                break;
            case 2:
                valotTipoCambio = 4.13;
                moneda = "Euros";
                break;
            case 3:
                valotTipoCambio = 0.024;
                moneda = "Yenes";
                break;
            case 4:
                valotTipoCambio = 0.045;
                moneda = "Rublos";
                break;
            default:
                System.out.println("Operación no valida");
                break;
        }

        System.out.println("El tipo de cambio es: " + valotTipoCambio);
        System.out.println("Ingresar el monto en soles:");

        try {
            double montoSoles = sc.nextDouble();
            System.out.println("El monto en " + moneda + " es: " + String.format("%.2f", montoSoles / valotTipoCambio));
        }catch(InputMismatchException e){
            System.out.println("El valor no es un numero correcto");
        }



        sc.close();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
