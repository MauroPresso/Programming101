package sistemaDeVehiculos;

public class Main 
{
    public static void main(String[] args) 
    {
        Vehiculo vehiculos[] = new Vehiculo[3];
        vehiculos[0] = new Automovil("Toyota", "Corolla", 4);
        vehiculos[1] = new Motocicleta("Honda", "CBR600RR", 600);
        vehiculos[2] = new Camion("Volvo", "FH16", 25);

        for (Vehiculo vehiculo : vehiculos) 
        {
            System.err.println("-----------------------------");
            vehiculo.mostrarInfo();

            if(vehiculo instanceof Conducible)
            {
                ((Conducible) vehiculo).arrancar();
                ((Conducible) vehiculo).acelerar();
                ((Conducible) vehiculo).frenar();
            }
            else
            {
                System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " no es conducible.");
            }
        }
    }
}