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
            if(vehiculo instanceof Automovil)
            {
                Automovil automovil = (Automovil) vehiculo;
                automovil.mostrarInfo();
                automovil.arrancar();
                automovil.acelerar();
                automovil.frenar();
                System.out.println();
            }
            else if(vehiculo instanceof Motocicleta)
            {
                Motocicleta motocicleta = (Motocicleta) vehiculo;
                motocicleta.mostrarInfo();
                motocicleta.arrancar();
                motocicleta.acelerar();
                motocicleta.frenar();
                System.out.println();
            }
            else if(vehiculo instanceof Camion)
            {
                Camion camion = (Camion) vehiculo;
                camion.mostrarInfo();
                camion.arrancar();
                camion.acelerar();
                camion.frenar();
                System.out.println();
            }
        }
    }
}