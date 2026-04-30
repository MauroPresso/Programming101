package sistemaDeVehiculos;

public class Camion extends Vehiculo 
{
    private float capacidadCarga;

    public Camion(String marca, String modelo, float capacidadCarga) 
    {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public float getCapacidadCarga() 
    {
        return capacidadCarga;
    }

    // Implementación de métodos de Conducible
    @Override
    public void arrancar() 
    {
        System.out.println("El camión está arrancando.");
    }

    @Override
    public void acelerar() 
    {
        System.out.println("El camión está acelerando.");
    }

    @Override
    public void frenar() 
    {
        System.out.println("El camión está frenando.");
    }

    @Override
    public void mostrarInfo() 
    {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
    }
}