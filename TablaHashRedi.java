public class TablaHashRedi {

    private int m = 7;

    private Nodo[] tabla;

    public TablaHashRedi() {
        tabla = new Nodo[m];
    }

    private int hash(int key) {
        return key % 7;
    }

    public void insertar(int key, String value) {

        Nodo nuevo = new Nodo(key, value);

        int posicion = buscarPosicion(key);

        if (posicion != -1) {
            tabla[posicion].value = value;
            return;
        }

        for (int i = 0; i < m; i++) {

            posicion = (hash(key) + i) % m;

            if (tabla[posicion] == null || tabla[posicion].deleted) {
                tabla[posicion] = nuevo;
                return;
            }
        }

        System.out.println("Ya no se pueden insertar mas elementos en la tabla.");
    }

    public void imprimirTabla() {

        for (int i = 0; i < m; i++) {

            if (tabla[i] != null && !tabla[i].deleted) {
                System.out.println(i + " -> (" + tabla[i].key + ", " + tabla[i].value + ")");
            } else {
                System.out.println(i + " -> null");
            }
        }
    }

    private int buscarPosicion(int key) {

        for (int i = 0; i < m; i++) {

            int posicion = (hash(key) + i) % m;

            if (tabla[posicion] == null) {
                return -1;
            }

            if (!tabla[posicion].deleted && tabla[posicion].key == key) {
                return posicion;
            }
        }

        return -1;
    }

    public void buscar(int key) {

        int posicion = buscarPosicion(key);

        if (posicion != -1) {
            System.out.println("buscar(" + key + ") --> '" + tabla[posicion].value + "'");
        } else {
            System.out.println("buscar(" + key + ") --> NOT_FOUND");
        }
    }

    public void eliminar(int key) {

        for (int i = 0; i < m; i++) {

            int posicion = (hash(key) + i) % m;

            if (tabla[posicion] == null) {
                System.out.println("eliminar(" + key + ") --> NOT_FOUND");
                return;
            }

            if (!tabla[posicion].deleted && tabla[posicion].key == key) {
                tabla[posicion] = new Nodo();
                System.out.println("eliminar(" + key + ") --> OK");
                return;
            }
        }

        System.out.println("eliminar(" + key + ") --> NOT_FOUND");
    }


    public void factorCarga(){

        int elementos = longitud();
        double factorCarga = (double) elementos / m;
        System.out.println("Factor de carga: " + String.format("%.2f",factorCarga ) );

    }

    public int longitud(){

        int count = 0;

        for (int i = 0; i < m; i++) {

            if (tabla[i] != null && !tabla[i].deleted) {
                count++;
            }

        }
        return count;

    }

    private class Nodo {

        int key;
        String value;
        boolean deleted;

        public Nodo(int key, String value) {
            this.key = key;
            this.value = value;
            this.deleted = false;
        }

        public Nodo() {
            this.key = -1;
            this.value = null;
            this.deleted = true;
        }
    }
}