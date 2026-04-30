package sistemaDeVehiculos;

public abstract class Vehiculo implements Conducible
{
    private String marca;
    private String modelo;


    public Vehiculo(String marca, String modelo) 
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() 
    {
        return marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void mostrarInfo() 
    {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }

    @Override
    public void arrancar() 
    {
        System.out.println("El vehículo está arrancando.");
    }

    @Override
    public void acelerar() 
    {
        System.out.println("El vehículo está acelerando.");
    }

    @Override
    public void frenar() 
    {
        System.out.println("El vehículo está frenando.");
    }
}