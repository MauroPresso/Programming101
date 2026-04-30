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
            if (animal instanceof Perro) 
            {
                Perro perro = (Perro) animal;
                System.out.println("El perro se llama " + perro.getNombre() + " , tiene " + perro.getEdad() + " años, su raza es " + perro.getRaza() + "y hace el sonido: ");
                perro.hacerSonido();
            } 
            else if (animal instanceof Gato) 
            {
                Gato gato = (Gato) animal;
                System.out.println("El gato se llama " + gato.getNombre() + " , tiene " + gato.getEdad() + " años, su raza es " + gato.getRaza() + "y hace el sonido: ");
                gato.hacerSonido();
            } 
            else if (animal instanceof Pajaro) 
            {
                Pajaro pajaro = (Pajaro) animal;
                System.out.println("El pájaro se llama " + pajaro.getNombre() + " y tiene " + pajaro.getEdad() + " años. Su tipo es " + pajaro.getTipo() + " y hace el sonido: ");
                pajaro.hacerSonido();
            }
        }
    }
}
