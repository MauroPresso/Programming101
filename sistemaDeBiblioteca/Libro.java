package sistemaDeBiblioteca;

public class Libro 
{
    private String titulo;
    private String autor;
    private EstadoLibro estado;

    /*!
     * @brief Constructor de la clase Libro.
     * 
     *        Crea un libro con título y autor.
     *        Al crearse, el libro queda automáticamente disponible.
     * 
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     */
    public Libro(String titulo, String autor) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = EstadoLibro.DISPONIBLE;
    }

    /*!
     * @brief Obtiene el título del libro.
     * 
     * @return Título del libro.
     */
    public String getTitulo() 
    {
        return titulo;
    }

    /*!
     * @brief Obtiene el autor del libro.
     * 
     * @return Autor del libro.
     */
    public String getAutor() 
    {
        return autor;
    }

    /*!
     * @brief Obtiene el estado actual del libro.
     * 
     * @return Estado actual del libro: DISPONIBLE o PRESTADO.
     */
    public EstadoLibro getEstado()
    {
        return estado;
    }

    /*!
     * @brief Marca el libro como prestado.
     */
    public void marcarComoPrestado()
    {
        this.estado = EstadoLibro.PRESTADO;
    }

    /*!
     * @brief Marca el libro como disponible.
     */
    public void marcarComoDisponible()
    {
        this.estado = EstadoLibro.DISPONIBLE;
    }

    /*!
     * @brief Muestra por consola la información del libro.
     */
    public void mostrarInfo() 
    {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Estado: " + estado);
    }
}