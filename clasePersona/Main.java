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
        for(Persona persona : personas) 
        {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            if(persona.esMayorDeEdad()) 
            {
                System.out.println(persona.getNombre() + " es mayor de edad.");
            } 
            else 
            {
                System.out.println(persona.getNombre() + " es menor de edad.");
            }
        }

    }
    
}
