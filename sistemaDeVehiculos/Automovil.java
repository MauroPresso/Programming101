package sistemaDeVehiculos;

public class Automovil extends Vehiculo implements Conducible
{

    private int puertas;

    public Automovil(String marca, String modelo, int puertas) 
    {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() 
    {
        return puertas;
    }


    @Override
    public void mostrarInfo() 
    {
        super.mostrarInfo();
        System.out.println("Puertas: " + puertas);
    }

    // Implementación de métodos de Conducible
    @Override
    public void arrancar() 
    {
        System.out.println("El automóvil está arrancando.");
    }

    @Override
    public void acelerar() 
    {
        System.out.println("El automóvil está acelerando.");
    }

    @Override
    public void frenar() 
    {
        System.out.println("El automóvil está frenando.");
    }
}