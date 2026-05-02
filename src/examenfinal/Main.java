
package examenfinal;


public class Main {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Cancion 1", 180, "Artista 1");
        Cancion cancion2 = new Cancion("Cancion 2", 200, "Artista 2");
        Cancion cancion3 = new Cancion("Cancion 3", 220, "Artista 3");

        Playlist playlist = new Playlist();

        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        playlist.mostrarPlaylist();
    }
}


