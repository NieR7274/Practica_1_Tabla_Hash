public class TablaHash {

    private int m = 7;

    private Nodo[] tabla;

    public TablaHash() {
        tabla = new Nodo[m];
    }

    private int funcionHash(int key) {
        return key % 7;
    }

    public void insertar(int key, String value) {

        int posicion = funcionHash(key);

        Nodo nuevo = new Nodo(key, value);

        if (tabla[posicion] == null) {
            tabla[posicion] = nuevo;
        } else {
            Nodo actual = tabla[posicion];

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {

        for (int i = 0; i < m; i++) {

            System.out.print(i + " -> ");

            Nodo actual = tabla[i];

            while (actual != null) {
                System.out.print("(" + actual.key + ", " + actual.value + ") -> ");
                actual = actual.siguiente;
            }

            System.out.println("[]");
        }
    }

    private class Nodo {

        int key;
        String value;
        Nodo siguiente;

        public Nodo(int key, String value) {
            this.key = key;
            this.value = value;
            this.siguiente = null;
        }
    }
}
