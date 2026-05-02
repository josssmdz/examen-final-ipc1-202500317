
package examenfinal;


public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Cancion 1", 180, "Artista 1");
        Cancion cancion2 = new Cancion("Cancion 2", 200, "Artista 2");
        Cancion cancion3 = new Cancion("Cancion 3", 220, "Artista 3");

        cancion1.reproducir();
        cancion2.reproducir();
        cancion3.reproducir();
    }
}

