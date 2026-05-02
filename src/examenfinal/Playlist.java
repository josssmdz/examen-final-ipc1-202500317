
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

    public Cancion siguiente() {
        if (actual == null || actual.getSiguiente() == null) {
            System.out.println("No hay siguiente cancion.");
            return null;
        }

        actual = actual.getSiguiente();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public Cancion anterior() {
        if (actual == null || actual.getAnterior() == null) {
            System.out.println("No hay cancion anterior.");
            return null;
        }

        actual = actual.getAnterior();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public void eliminarActual() {
        if (actual == null) {
            System.out.println("No hay cancion actual para eliminar.");
            return;
        }

        System.out.println("Eliminando: " + actual.getDato());

        if (cabeza == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (actual == cabeza) {
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            actual = cabeza;
        } else if (actual == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            actual = cola;
        } else {
            NodoDoble nodoAnterior = actual.getAnterior();
            NodoDoble nodoSiguiente = actual.getSiguiente();

            nodoAnterior.setSiguiente(nodoSiguiente);
            nodoSiguiente.setAnterior(nodoAnterior);

            actual = nodoSiguiente;
        }

        tamanio--;
    }

    public int getTamanio() {
        return tamanio;
    }
}


