package sistemaDeVehiculos;

public class Motocicleta extends Vehiculo 
{
    private float cilindrada;

    public Motocicleta(String marca, String modelo, float cilindrada) 
    {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public float getCilindrada() 
    {
        return cilindrada;
    }

    @Override
    public void mostrarInfo() 
    {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}