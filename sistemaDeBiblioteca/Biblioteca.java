package sistemaDeBiblioteca;

public class Biblioteca 
{
    private Libro[] librosPrestados;
    private Usuario[] usuarios;

    public Biblioteca(Libro[] librosPrestados, Usuario[] usuarios) 
    {
        this.librosPrestados = librosPrestados;
        this.usuarios = usuarios;
    }

    /*!
     *    @brief Método para agregar un usuario a la biblioteca. 
     *           Verifica si hay espacio disponible en el arreglo de usuarios antes de agregar el nuevo usuario.
     *    @param usuario El usuario que se desea agregar a la biblioteca.
     */
    public void agregarUsuario(Usuario usuario) 
    {
        for (int i = 0; i < usuarios.length; i++) 
        {
            if (usuarios[i] == null) 
            {
                usuarios[i] = usuario; // Agrega el usuario al arreglo de usuarios de la biblioteca.
                System.out.println("Usuario " + usuario.getNombre() + " agregado a la biblioteca.");
                return;
            }
        }
        System.out.println("No se pudo agregar el usuario " + usuario.getNombre() + ". La biblioteca está llena.");
    }   

    /*!
     * @brief Método para prestar un libro a un usuario.
     * 
     *        Primero verifica si el libro está disponible.
     *        Luego verifica si hay espacio en el arreglo de libros prestados de la biblioteca.
     *        Si el usuario puede recibir el libro, se registra el préstamo y el libro cambia su estado a PRESTADO.
     * 
     * @param usuario Usuario al que se le desea prestar el libro.
     * @param libro Libro que se desea prestar.
     */
    public void prestarLibro(Usuario usuario, Libro libro) 
    {
        if (libro.getEstado() == EstadoLibro.PRESTADO) 
        {
            System.out.println("No se puede prestar el libro \"" + libro.getTitulo() + "\" porque ya está prestado.");
            return;
        }

        for (int i = 0; i < librosPrestados.length; i++) 
        {
            if (librosPrestados[i] == null) 
            {
                if (usuario.prestar(libro)) 
                {
                    librosPrestados[i] = libro;
                    libro.marcarComoPrestado();

                    System.out.println("La biblioteca registró el préstamo del libro \"" + libro.getTitulo() + "\".");
                }

                return;
            }
        }

        System.out.println("No se pudo prestar el libro \"" + libro.getTitulo() + "\". La biblioteca no tiene más espacio para registrar préstamos.");
    }
    
    /*!
     * @brief Método para devolver un libro prestado por un usuario.
     * 
     *        Primero solicita al usuario que devuelva el libro.
     *        Si la devolución fue correcta, elimina el libro del arreglo de libros prestados
     *        de la biblioteca y cambia su estado a DISPONIBLE.
     * 
     * @param usuario Usuario que devuelve el libro.
     * @param libro Libro que se desea devolver.
     */
    public void devolverLibro(Usuario usuario, Libro libro)
    {
        if (usuario.devolver(libro))
        {
            for (int i = 0; i < librosPrestados.length; i++) 
            {
                if (librosPrestados[i] == libro) 
                {
                    librosPrestados[i] = null;
                    libro.marcarComoDisponible();

                    System.out.println("El libro \"" + libro.getTitulo() + "\" quedó disponible nuevamente en la biblioteca.");
                    return;
                }
            }
        }
    }

    /*!
     *    @brief Método para mostrar el estado actual de la biblioteca, incluyendo los libros prestados y los usuarios registrados.
     */
    public void mostrarEstado()
    {
        System.out.println("Libros Prestados:");
        boolean libroPrestado = false;
        for (Libro libro : librosPrestados) 
        {
            if (libro != null) 
            {
                libroPrestado = true;
                libro.mostrarInfo();
                System.out.println();
            }
        }
        if (!libroPrestado) 
        {
            System.out.println("No hay libros prestados.");
        }

        
        System.out.println("Usuarios:");
        boolean usuarioRegistrado = false;
        for (Usuario usuario : usuarios) 
        {
            if (usuario != null) 
            {
                usuarioRegistrado = true;
                System.out.println(usuario.getNombre());
                usuario.mostrarLibros();
                System.out.println();
            }
        }
        if (!usuarioRegistrado) 
        {
            System.out.println("No hay usuarios registrados.");
        }
    } 
    
}
