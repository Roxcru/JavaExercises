public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ejemplos");
        System.out.println("=============================");
        String imagen= "* ";
        for (int i = 0; i <= 4; i++) {
            for (int k = 4-i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(imagen);
            }
            System.out.println();
        }
//        for (int i = 1; i <= 10; i++) {
//            for (int k = 1; k < 10-i; k++) {
//                espacio = "  " + espacio;
//            }
//            for (int j = 1; j <= 10; j++) {
//                if(j <= i){
//                    if(j==1){
//                        System.out.print(espacio);
//                    }
//                    System.out.print(imagen + "\t");
//                }
//            }
//            espacio="";
//            System.out.println();
//        }
    }
}
