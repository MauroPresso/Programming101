package clasePersona;

public class Main 
{
    public static void main(String[] args) 
    {
        // Array de personas
        Persona[] personas = new Persona[3];
        // Crear personas y asignarlas al array
        personas[0] = new Persona("Juan", 25);
        personas[1] = new Persona("María", 17);
        personas[2] = new Persona("Pedro", 30);
        
        // Mostrar información de cada persona
        for(int i = 0; i < personas.length; i++) 
        {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Edad: " + personas[i].getEdad());
            if(personas[i].esMayorDeEdad()) 
            {
                System.out.println(personas[i].getNombre() + " es mayor de edad.");
            } 
            else 
            {
                System.out.println(personas[i].getNombre() + " es menor de edad.");
            }
        }

    }
    
}
