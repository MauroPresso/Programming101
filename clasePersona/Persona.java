package clasePersona;

public class Persona 
{
    private String nombre;
    private int edad;

    // constructor
    public Persona(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    // getters y setters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
    
    // método para mostrar si la persona es mayor de edad
    public boolean esMayorDeEdad() 
    {        
        if(edad >= 18) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}
