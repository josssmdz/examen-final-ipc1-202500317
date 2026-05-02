
 package examenfinal;

public class Playlist {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
        this.tamanio = 0;
    }

    public void agregarCancion(Cancion cancion) {
        NodoDoble nuevo = new NodoDoble(cancion);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }

        tamanio++;
    }

    public void mostrarPlaylist() {
        if (cabeza == null) {
            System.out.println("La playlist esta vacia.");
            return;
        }

        System.out.println("Playlist:");
        NodoDoble temporal = cabeza;
        int contador = 1;

        while (temporal != null) {
            System.out.println(contador + ". " + temporal.getDato());
            temporal = temporal.getSiguiente();
            contador++;
        }
    }

    public int getTamanio() {
        return tamanio;
    }
}

