package clasePOO;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Celular celular = new Celular();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S21");
        celular.setBateria(50);
        celular.setEncendido(true);
        
        Celular celular2 = new Celular();
        celular2.setMarca("Apple");
        celular2.setModelo("iPhone 13");
        celular2.setBateria(80);
        celular2.setEncendido(false);

        Celular celular3 = new Celular();
        celular3.setMarca("Xiaomi");
        celular3.setModelo("Mi 11");
        celular3.setBateria(30);
        celular3.setEncendido(true);


        Scanner teclado = new Scanner(System.in); // Abro el teclado

        // Probando el metodo cargar(int cantidad)
        System.out.println("\n\nProbando el metodo cargar(int cantidad)");
        System.out.println("\nProbando el metodo cargar(int cantidad) para el celular 1:");
        celular.cargar(teclado, 100);
        System.out.println("\nProbando el metodo cargar(int cantidad) para el celular 2:");
        celular2.cargar(teclado, 70);
        System.out.println("\nProbando el metodo cargar(int cantidad) para el celular 3:");
        celular3.cargar(teclado, 60);

        // Probando el metodo usar(int cantidad)
        System.out.println("\n\nProbando el metodo usar(int cantidad)");
        System.out.println("\nProbando el metodo usar(int cantidad) para el celular 1:");
        celular.usar(teclado, 110);
        System.out.println("\nProbando el metodo usar(int cantidad) para el celular 2:");
        celular2.usar(teclado, 20);
        System.out.println("\nProbando el metodo usar(int cantidad) para el celular 3:");
        celular3.usar(teclado, 30);
        
        // Probando el metodo estadoBateria()
        System.out.println("\n\nProbando el metodo estadoBateria()");
        System.out.println("\nProbando el metodo estadoBateria() para el celular 1:");
        celular.estadoBateria(teclado);
        System.out.println("\nProbando el metodo estadoBateria() para el celular 2:");
        celular2.estadoBateria(teclado);
        System.out.println("\nProbando el metodo estadoBateria() para el celular 3:");
        celular3.estadoBateria(teclado);


        teclado.close(); // Cierro el teclado

        // getters
        System.out.println("\n\nProbando los getters:");
        System.out.println("\nMarca del celular 1: " + celular.getMarca());
        System.out.println("Modelo del celular 1: " + celular.getModelo());
        System.out.println("Bateria del celular 1: " + celular.getBateria());
        System.out.println("Encendido del celular 1: " + celular.isEncendido());

        System.out.println("\nMarca del celular 2: " + celular2.getMarca());
        System.out.println("Modelo del celular 2: " + celular2.getModelo());
        System.out.println("Bateria del celular 2: " + celular2.getBateria());
        System.out.println("Encendido del celular 2: " + celular2.isEncendido());

        System.out.println("\nMarca del celular 3: " + celular3.getMarca());
        System.out.println("Modelo del celular 3: " + celular3.getModelo());
        System.out.println("Bateria del celular 3: " + celular3.getBateria());
        System.out.println("Encendido del celular 3: " + celular3.isEncendido());

    }    
}
