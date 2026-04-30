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

    // Implementación de métodos de Conducible
    @Override
    public void arrancar() 
    {
        System.out.println("La motocicleta está arrancando.");
    }

    @Override
    public void acelerar() 
    {
        System.out.println("La motocicleta está acelerando.");
    }

    @Override
    public void frenar() 
    {
        System.out.println("La motocicleta está frenando.");
    }
}