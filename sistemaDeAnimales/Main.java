package sistemaDeAnimales;

public class Main {
    public static void main(String[] args) 
    {

        Animal animales[] = new Animal[3];
        animales[0] = new Perro("Firulais", 3, "Labrador");
        animales[1] = new Gato("Michi", 2, "Siames");
        animales[2] = new Pajaro("Piolin", 1, "Canario");

        for (Animal animal : animales) 
        {
            System.out.println();
            System.out.println("El animal se llama " + animal.getNombre() + " y tiene " + animal.getEdad() + " años. Hace el sonido: ");
            animal.hacerSonido();
        }
    }
}
