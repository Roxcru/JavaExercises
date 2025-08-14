package feature;

public class Usuario {
    String Nombre;
    String Apellido;
    String Cargo;
    String DNI;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String cargo, String DNI) {
        Nombre = nombre;
        Apellido = apellido;
        Cargo = cargo;
        this.DNI = DNI;
    }

    public void cambiarDNI(String DNI){
        this.DNI = DNI;
        System.out.println("Se actualizó el DNI");
    }

    public void mostrarDNI(){
        System.out.println("El DNI es: " + this.DNI);
    }
}
