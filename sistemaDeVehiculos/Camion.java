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

    @Override
    public void mostrarInfo() 
    {
        super.mostrarInfo();
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
    }
}