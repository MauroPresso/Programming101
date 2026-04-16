package clasePOO;

import java.util.Scanner;

public class Celular 
{
    // Atributos (private)
    private String marca;
    private String modelo;
    private int bateria;
    private boolean encendido;
    
    // Métodos (public)
    
    // Getters
    public String getMarca() 
    {
        return marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public int getBateria() 
    {
        return bateria;
    }

    public boolean isEncendido() 
    {
        return encendido;
    }

    // Setters
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public void setBateria(int bateria) 
    {
        this.bateria = bateria;
    }

    public void setEncendido(boolean encendido) 
    {
        this.encendido = encendido;
    }

    // Ejercicio 1
    public void cargar(Scanner teclado, int cantidad)
    {
        while(bateria < 0 || bateria > 100)
        {
            System.out.println("\nNivel de bateria incorrecto. Por favor, ingrese:\t");
            bateria = teclado.nextInt();
            teclado.nextLine();
        }

        while (cantidad < 0 || cantidad > 100) 
        {
            System.out.println("\nCantidad de bateria incorrecta. Por favor, ingrese nuevamente:\t");
            cantidad = teclado.nextInt();
            teclado.nextLine();
        }

        // Carga actual de la bateria
        int excedente;
        int cargado;
        if((bateria + cantidad) >= 100) // Celular totalmente cargado.
        {
            excedente = ((bateria + cantidad) - 100);
            cargado = (cantidad - excedente);
            System.out.println("\nSe cargo: " + cargado + "% de bateria.");
            bateria = 100;
            System.out.println("\nNivel actual de carga: " + bateria + "% de bateria.");
        }
        else
        {
            bateria = bateria + cantidad;
            System.out.println("\nSe cargo: " + cantidad + "% de bateria.");
            System.out.println("\nNivel actual de carga: " + bateria + "% de bateria.");
        }
    } 

    // Ejercicio 2
    public void usar(Scanner teclado, int cantidad)
    {
        while(bateria < 0 || bateria > 100)
        {
            System.out.println("\nNivel de bateria incorrecto. Por favor, ingrese:\t");
            bateria = teclado.nextInt();
        }

        while (cantidad < 0 || cantidad > 100) 
        {
            System.out.println("\nCantidad de bateria incorrecta. Por favor, ingrese nuevamente:\t");
            cantidad = teclado.nextInt();
        }
        
        // Uso actual de la bateria
        int excedente;
        int usado;
        if((bateria - cantidad) <= 0) // Celular totalmente descargado.
       {
            excedente = ((-1)*(bateria - cantidad));
            usado = (cantidad - excedente);
            System.out.println("\nSe uso: " + usado + "% de bateria.");
            bateria = 0;
            System.out.println("\nNivel actual de carga: " + bateria + "% de bateria.");
        }
        else
        {
            bateria = bateria - cantidad;
            System.out.println("\nSe uso: " + cantidad + "% de bateria.");
            System.out.println("\nNivel actual de carga: " + bateria + "% de bateria.");
        }
    } 

    // Ejercicio 3
    public void estadoBateria(Scanner teclado)
    {
        while(bateria < 0 || bateria > 100)
        {
            System.out.println("\nCantidad de bateria incorrecta. Por favor, ingrese nuevamente:\t");
            bateria = teclado.nextInt();
        }
        
        if(bateria >= 81 && bateria <=100)
        {
            System.out.println("\n¡Bateria llena!");
        }
        else if(bateria >= 21 && bateria <=80)
        {
            System.out.println("\n¡Bateria en nivel!");
        }
        else if(bateria >= 1 && bateria <=20)
        {
            System.out.println("\n¡Bateria baja!");
        }
        else
        {
            System.out.println("\n¡Celular apagado!");
        }
    } 
}
