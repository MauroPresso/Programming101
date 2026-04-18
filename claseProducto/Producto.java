package claseProducto;

public class Producto 
{
    private String nombre;
    private float precio;
    private int stock;

    public Producto(String nombre, float precio, int stock) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos getters y setters
    public String getNombre() 
    {
        return nombre;
    }

    public float getPrecio() 
    {
        return precio;
    }

    public int getStock() 
    {
        return stock;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) 
    {
        this.precio = precio;
    }

    public void setStock(int stock) 
    {
        this.stock = stock;
    }

    // Método para vender el producto
    public void vender(int cantidad) 
    {
        if (cantidad <= stock) 
        {
            stock -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        } 
        else 
        {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
        }
    }

    // Método para reponer el stock
    public void reponer(int cantidad) 
    {
        stock += cantidad;
        System.out.println("Stock repuesto: " + cantidad + " unidades de " + nombre);
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() 
    {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

}
