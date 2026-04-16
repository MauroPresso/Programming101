package claseAutomovil;

public class Main {
    public static void main(String[] args) 
    {
        // Crear un automóvil utilizando el constructor con velocidad en cero
        Automovil auto1 = new Automovil();
        System.out.println("Automóvil 1: " + auto1.getMarca() + " " + auto1.getModelo() + ", Velocidad: " + auto1.getVelocidad() + " km/h");

        // Crear un automóvil utilizando el constructor con velocidad específica
        Automovil auto2 = new Automovil("Honda", "Civic", 50);
        System.out.println("Automóvil 2: " + auto2.getMarca() + " " + auto2.getModelo() + ", Velocidad: " + auto2.getVelocidad() + " km/h");

        // Acelerar el primer automóvil
        auto1.acelerar(20);
        // Frenar el segundo automóvil
        auto2.frenar(10);
    }
}