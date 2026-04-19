package sistemaDeBiblioteca;

public class Usuario 
{
    private String nombre;
    private Libro[] librosPrestados;
    private int cantidadMaximaLibros; // Cantidad máxima de libros que un usuario puede tener prestados.
    
    public Usuario(String nombre, int cantidadMaximaLibros) 
    {
        this.nombre = nombre;
        if (cantidadMaximaLibros <= 0) 
        {
            cantidadMaximaLibros = 1; // Establece un valor predeterminado si la cantidad máxima de libros es inválida.
        }
        this.cantidadMaximaLibros = cantidadMaximaLibros;
        this.librosPrestados = new Libro[cantidadMaximaLibros]; // Inicializa el arreglo de libros con la capacidad máxima.
    }

    public String getNombre() 
    {
        return nombre;
    }

    /*!
     *    @brief Método para prestar un libro a un usuario. 
     *           Verifica si el usuario ha alcanzado su límite de libros prestados antes de agregar el libro al arreglo de libros prestados.
     *    @param libro El libro que se desea prestar al usuario.
     */
    public void prestar(Libro libro)
    {
        int librosPrestadosCount = 0;
        for (Libro libroPrestado : librosPrestados) 
        {
            if (libroPrestado != null) 
            {
                librosPrestadosCount++;
            }
        }

        if(librosPrestadosCount >= cantidadMaximaLibros)
        {
            System.out.println("No se puede prestar el libro " + libro.getTitulo() + " a " + nombre + ". El usuario ha alcanzado su límite de libros prestados.");
            return;
        }
        
        for (int i = 0; i < librosPrestados.length; i++) 
        {
            if (librosPrestados[i] == null) 
            {
                librosPrestados[i] = libro; // Agrega el libro al arreglo de libros prestados del usuario.
                System.out.println("Libro " + libro.getTitulo() + " prestado a " + nombre + ".");
                break;
            }
        }
        
        
    }

    /*!
     *    @brief Método para mostrar los libros prestados a un usuario. 
     *           Recorre el arreglo de libros prestados y muestra el título y autor de cada libro que no sea nulo.
     */
    public void mostrarLibros() 
    {
        System.out.println("Libros prestados a " + nombre + ":");
        boolean tieneLibros = false;
        for (Libro libro : librosPrestados) 
        {
            if (libro != null) 
            {
                tieneLibros = true;
                System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
            }
        }
        if (!tieneLibros) 
        {
            System.out.println("No hay libros prestados.");
        }
    }
    
}
