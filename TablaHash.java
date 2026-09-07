public class TablaHash {

    private int m = 7;

    private Nodo[] tabla;

    private int longitud = 0;

    public TablaHash() {
        tabla = new Nodo[m];
    }

    private int Hash(int key) {
        return key % 7;
    }

    public void insertar(int key, String value) {

        int posicion = Hash(key);

        Nodo nuevo = new Nodo(key, value);

        Nodo actual = tabla[posicion];

        while (actual != null){
            if(actual.key == key){
                actual.value = value;
                System.out.print("Actualizado: (" + actual.key + ", " + actual.value + ")\n");
                return;
            }
            actual = actual.siguiente;
        }

        if (tabla[posicion] == null) {
            tabla[posicion] = nuevo;
            longitud++;
            System.out.print("Insertado: (" + nuevo.key + ", " + nuevo.value + ")\n");
        } else {

            actual = tabla[posicion];

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
            longitud++;
            System.out.print("Insertado: (" + nuevo.key + ", " + nuevo.value + ")\n");
        }
    }

    public void imprimirTabla() {

        for (int i = 0; i < m; i++) {

            System.out.print(i + " ->");

            Nodo actual = tabla[i];

            while (actual != null) {
                System.out.print(" (" + actual.key + ", " + actual.value + ")");

                if (actual.siguiente != null) {
                    System.out.print(" ->");
                }
                actual = actual.siguiente;
            }

            System.out.println();
        }
    }

    public void buscar(int key) {

        int posicion = Hash(key);

        Nodo actual = tabla[posicion];

        while (actual != null){
            if(actual.key == key){
                System.out.print("buscar("+ key +") --> '" + actual.value + "'\n");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.print("buscar("+ key +") --> NOT_FOUND \n");
        
    }

    public void eliminar(int key){
        int posicion = Hash(key);

        Nodo actual = tabla[posicion];
        Nodo anterior = null;

        while (actual != null){
            if(actual.key == key){
                if (anterior == null){
                    tabla[posicion] = actual.siguiente;
                }

                else{
                    anterior.siguiente = actual.siguiente;
                }

                longitud-- ;
                System.out.println("Eliminado: (" + key + ")");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.print("Eliminar("+ key +") --> NOT_FOUND \n");        
    }

    public void factorCarga(){

        int elementos = longitud;
        double factorCarga = (double) elementos / m;
        System.out.println("Factor de carga: " + String.format("%.2f",factorCarga ) );

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
