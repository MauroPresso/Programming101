package sistemaDeAnimales;

public class Pajaro extends Animal 
{
    
    private String tipo;
    
    public Pajaro(String nombre, int edad, String tipo) 
    {
        super(nombre, edad);
        this.tipo = tipo;
    }
    
    public String getTipo() 
    {
        return tipo;
    }
    
    @Override
    public void hacerSonido() 
    {
        System.out.println("Pío pío");
    }

}