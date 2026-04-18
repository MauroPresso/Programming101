package claseProducto;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Producto[] productos = new Producto[3];

        // Llenar el arreglo de productos con datos ingresados por el usuario.
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < productos.length; i++)
        {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            float precio = scanner.nextFloat();
            System.out.println("Ingrese la cantidad del producto " + (i + 1) + ":");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            productos[i] = new Producto(nombre, precio, cantidad);
            
        }
        scanner.close();

        // Simular ventas de productos.
        productos[0].vender(2);
        productos[1].vender(5);
        productos[2].vender(1);

        // Simular reposición de stock.
        productos[0].reponer(5);
        productos[1].reponer(10);
        productos[2].reponer(3);

        // Mostrar la información de cada producto después de las ventas y reposiciones.
        for(Producto producto : productos)
        {            
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Stock: " + producto.getStock());
            System.out.println();  
        }         

    }    
}
