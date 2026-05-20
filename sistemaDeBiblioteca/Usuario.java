package sistemaDeBiblioteca;

public class Usuario 
{
    private String nombre;
    private Libro[] librosPrestados;
    
    public Usuario(String nombre, int cantidadMaximaLibros) 
    {
        this.nombre = nombre;
        if (cantidadMaximaLibros <= 0) 
        {
            cantidadMaximaLibros = 1; // Establece un valor predeterminado si la cantidad máxima de libros es inválida.
        }
        this.librosPrestados = new Libro[cantidadMaximaLibros]; // Inicializa el arreglo de libros con la capacidad máxima.
    }

    public String getNombre() 
    {
        return nombre;
    }

    /*!
     * @brief Método para prestar un libro al usuario.
     * 
     *        Verifica que el usuario no tenga ya prestado el mismo libro.
     *        Luego verifica si tiene espacio disponible dentro de su límite máximo de libros.
     *        Si hay espacio, agrega el libro al arreglo de libros prestados del usuario.
     * 
     * @param libro Libro que se desea prestar al usuario.
     * @return true si el libro pudo prestarse correctamente, false en caso contrario.
     */
    public boolean prestar(Libro libro)
    {
        // Verifica si el usuario ya tiene prestado el mismo libro.
        for (Libro libroPrestado : librosPrestados) 
        {
            if (libroPrestado == libro) 
            {
                System.out.println("El usuario " + nombre + " ya tiene prestado el libro \"" + libro.getTitulo() + "\".");
                return false;
            }
        }

        // Busca un espacio libre en el arreglo de libros prestados.
        for (int i = 0; i < librosPrestados.length; i++) 
        {
            if (librosPrestados[i] == null) 
            {
                librosPrestados[i] = libro;
                System.out.println("Libro \"" + libro.getTitulo() + "\" prestado a " + nombre + ".");
                return true;
            }
        }

        // Si no encontró ningún espacio libre, el usuario alcanzó su límite.
        System.out.println("No se puede prestar el libro \"" + libro.getTitulo() + "\" a " + nombre + ". El usuario alcanzó su límite de libros prestados.");
        return false;
    }

    /*!
     * @brief Método para devolver un libro prestado por el usuario.
     * 
     *        Busca el libro dentro del arreglo de libros prestados del usuario.
     *        Si lo encuentra, elimina la referencia colocando null en esa posición.
     * 
     * @param libro Libro que el usuario desea devolver.
     * @return true si el libro fue devuelto correctamente, false si el usuario no tenía ese libro.
     */
    public boolean devolver(Libro libro)
    {
        for (int i = 0; i < librosPrestados.length; i++) 
        {
            if (librosPrestados[i] == libro) 
            {
                librosPrestados[i] = null;
                System.out.println("El usuario " + nombre + " devolvió el libro \"" + libro.getTitulo() + "\".");
                return true;
            }
        }

        System.out.println("El usuario " + nombre + " no tiene prestado el libro \"" + libro.getTitulo() + "\".");
        return false;
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
