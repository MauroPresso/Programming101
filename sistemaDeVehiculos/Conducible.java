package sistemaDeVehiculos;

public interface Conducible 
{
    default void arrancar()
    {
        System.out.println("El vehículo ha arrancado.");
    }
    default void acelerar()
    {
        System.out.println("El vehículo está acelerando.");
    }
    default void frenar()
    {
        System.out.println("El vehículo está frenando.");
    }
    
}