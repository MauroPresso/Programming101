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
    *    @brief Método para agregar un libro a un usuario y a la biblioteca. 
    *           Verifica si hay espacio disponible en el arreglo de libros prestados antes de agregar el nuevo libro.
    *    @param usuario El usuario al que se le desea prestar el libro.
    *    @param libro El libro que se desea prestar al usuario.
    */
    public void agregarLibro(Usuario usuario, Libro libro) 
    {
        for (int i = 0; i < librosPrestados.length; i++) 
        {
            if (librosPrestados[i] == null) 
            {
                if (usuario.prestar(libro)) // Intenta agregar el libro al usuario. Si el usuario tiene espacio para más libros, se agrega el libro a la biblioteca.
                {
                    librosPrestados[i] = libro; // Agrega el libro al arreglo de libros prestados de la biblioteca.
                }
                return;
            }
        }
        System.out.println("No se pudo prestar el libro " + libro.getTitulo() + " a " + usuario.getNombre() + ". La biblioteca no tiene más espacio para libros prestados.");
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
