package feature;

public class Car {
    String color;
    String marca;
    String modelo;

    public Car() {
    }

    public Car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }

    public void stop(){
        System.out.println("Stop");
    }
}
