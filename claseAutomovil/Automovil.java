package claseAutomovil;

public class Automovil 
{
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor que permite inicializar el automóvil con una velocidad en cero.
    public Automovil() 
    {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.velocidad = 0; // Llama al constructor con velocidad específica, estableciendo la velocidad en cero
    }

    // Constructor que permite inicializar el automóvil con una velocidad específica. Además, permite establecer la marca y el modelo.
    public Automovil(String marca, String modelo, int velocidad) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad; // Velocidad inicial
    }

    // Métodos getters y setters
    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    public int getVelocidad() 
    {
        return velocidad;
    }

    public void setVelocidad(int velocidad) 
    {
        this.velocidad = velocidad;
    }
    // Método para acelerar el automóvil
    public void acelerar(int incremento) 
    {
        this.velocidad += incremento;
        System.out.println("El automóvil ha acelerado. Velocidad actual: " + this.velocidad + " km/h");
    }
    // Método para frenar el automóvil
    public void frenar(int decremento) 
    {
        this.velocidad -= decremento;
        if (this.velocidad < 0) {
            this.velocidad = 0; // La velocidad no puede ser negativa
        }
        System.out.println("El automóvil ha frenado. Velocidad actual: " + this.velocidad + " km/h");
    }
}   