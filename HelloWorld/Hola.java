import java.util.Scanner;

public class Hola 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
        scanner.close();

        System.out.println("¡Adiós, " + nombre + "! Que tengas un buen día.");
    }
}
