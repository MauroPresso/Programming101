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

}