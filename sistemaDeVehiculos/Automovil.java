package sistemaDeVehiculos;

public class Automovil extends Vehiculo 
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
}