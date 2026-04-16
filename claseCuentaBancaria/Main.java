package claseCuentaBancaria;

public class Main 
{
    public static void main(String[] args) 
    {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", "123456789", 1000.0);

        // Mostrar información de la cuenta
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Número de Cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta1.getSaldo());

        // Realizar un depósito
        cuenta1.depositar(500.0);

        // Realizar un retiro
        cuenta1.retirar(200.0);

        // Retiro invalido (más de lo que hay en la cuenta)
        cuenta1.retirar(1500.0);    
    }
}