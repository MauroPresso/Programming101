package ejercicioEstructuras;
import java.util.Scanner;

public class EjercicioEstructuras 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        String claveCorrecta = "1234";

        do 
        {
            System.out.print("\n\nMenu de opciones:\n" + "1. Iniciar sesion\n" + "2. Ver informacion\n" + "0. Salir\n" + "\nIngrese opcion elegida:\t");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) 
            {
                case 1:
                    System.out.print("\nElegiste iniciar sesion.\n");

                    int intentos = 1;
                    boolean accesoPermitido = false;

                    while (intentos <= 3 && !accesoPermitido) // !x es x pero negado -> !(false) es true
                    {
                        System.out.print("Ingrese el password:\t");
                        String ingreso = teclado.nextLine();

                        if (ingreso.equals(claveCorrecta)) 
                        {
                            System.out.println("Acceso permitido");
                            accesoPermitido = true;
                        }
                        else 
                        {
                            intentos++;
                            if (intentos <= 3) 
                            {
                                System.out.println("Password incorrecto. Intento " + intentos + " de 3.");
                            }
                        }
                    }

                    if (!accesoPermitido) // !x es x pero negado -> !(false) es true
                    {
                        System.out.println("Cuenta bloqueada");
                    }
                    break;

                case 2:
                    System.out.println("\nSistema en funcionamiento");
                    break;

                case 0:
                    System.out.println("\nElegiste salir.");
                    break;

                default:
                    System.out.println("\nLa opcion elegida es incorrecta. Ingrese nuevamente.");
                    break;
            }

        } 
        while (opcion != 0);

        teclado.close();
    }
}