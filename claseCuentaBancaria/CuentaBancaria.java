package claseCuentaBancaria;

public class CuentaBancaria 
{
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) 
    {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Métodos getters y setters
    public String getTitular() 
    {
        return titular;
    }

    public void setTitular(String titular) 
    {
        this.titular = titular;
    }

    public String getNumeroCuenta() 
    {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) 
    {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) 
    {
        if (cantidad > 0) 
        {
            saldo += cantidad;
            System.out.println("Depósito realizado. Saldo actual: " + saldo);
        } 
        else 
        {
            System.out.println("Cantidad inválida para depositar.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) 
    {
        if (cantidad > 0 && cantidad <= saldo) 
        {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Saldo actual: " + saldo);
        } 
        else 
        {
            System.out.println("Cantidad inválida para retirar.");
        }
    }
}