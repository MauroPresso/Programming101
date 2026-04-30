package sistemaDeAnimales;

public class Gato extends Animal 
{
    private String raza;

    public Gato(String nombre, int edad, String raza) 
    {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() 
    {
        return raza;
    }

    @Override
    public void hacerSonido() 
    {
        System.out.println("Miau");
    }
}