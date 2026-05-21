package sistemaDeBiblioteca;

public class Main 
{
    public static void main(String[] args) 
    {
        // Arreglos principales de la biblioteca
        Libro[] catalogoLibros = new Libro[5];
        Libro[] librosPrestados = new Libro[5];
        Usuario[] usuarios = new Usuario[5];

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca(catalogoLibros, librosPrestados, usuarios);

        // Crear libros
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro libro2 = new Libro("1984", "George Orwell");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro4 = new Libro("Fahrenheit 451", "Ray Bradbury");


        // Agregar libros al catálogo
        biblioteca.agregarLibroAlCatalogo(libro1);
        biblioteca.agregarLibroAlCatalogo(libro2);
        biblioteca.agregarLibroAlCatalogo(libro3);

        // Crear usuarios
        Usuario ana = new Usuario("Ana", 2);
        Usuario luis = new Usuario("Luis", 2);

        // Agregar usuarios a la biblioteca
        biblioteca.agregarUsuario(ana);
        biblioteca.agregarUsuario(luis);

        System.out.println();

        // Ana pide prestado libro1
        biblioteca.prestarLibro(ana, libro1);

        // Luis intenta pedir el mismo libro1
        biblioteca.prestarLibro(luis, libro1);

        System.out.println();

        // Ana devuelve libro1
        biblioteca.devolverLibro(ana, libro1);

        System.out.println();

        // Ahora Luis intenta pedir libro1 nuevamente
        biblioteca.prestarLibro(luis, libro1);

        // Luis pide otro libro
        biblioteca.prestarLibro(luis, libro2);

        // Luis intenta pedir un tercer libro, pero su límite es 2
        biblioteca.prestarLibro(luis, libro3);

        // Ana intenta pedir un libro que no está en el catálogo
        biblioteca.prestarLibro(ana, libro4);

        System.out.println();

        // Mostrar catálogo inicial
        biblioteca.mostrarCatalogo();
        System.out.println();

        // Mostrar estado final de la biblioteca
        biblioteca.mostrarEstado();
    }
}