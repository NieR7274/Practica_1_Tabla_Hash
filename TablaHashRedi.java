public class TablaHashRedi {

    private int m = 7;

    private Nodo[] tabla;

    public TablaHashRedi() {
        tabla = new Nodo[m];
    }

    private int funcionHash(int key) {
        return key % 7;
    }

    public void insertar(int key, String value) {
        Nodo nuevo = new Nodo(key, value);

        for (int i = 0; i < m; i++){

            int posicion = funcionHash(key + i);

            if (tabla[posicion] == null ){

                tabla[posicion] = nuevo;
                return;
            }
            else if (tabla[posicion].key == key) {
                tabla[posicion].value = value;
                return;
            }

            System.out.println("Ya no se pueden insetar mas elemetos en la tabla.");

        }

        
    }

    public void mostrar() {

        for (int i = 0; i < m; i++) {

            System.out.println(i + " -> (" + tabla[i].key + ", " + tabla[i].value + ")");

        }
    }

    public void buscar(int key) {

        for (int i = 0; i < m; i++){

            int posicion = funcionHash(key + i);

            if (tabla[posicion] != null && tabla[posicion].key == key) {
                System.out.print("buscar("+ key +") --> '" + tabla[posicion].value + "'\n");
                return;
            }
        }

        System.out.print("buscar("+ key +") --> NOT_FOUND \n");
        
    }

    public void eliminar(int key){


        for (int i = 0; i < m; i++){

            int posicion = funcionHash(key + i);

            if (tabla[posicion] != null && tabla[posicion].key == key) {
                tabla[posicion] = null;
                System.out.print("eliminar("+ key +") --> OK \n");
                return;
            }
        }

        System.out.print("eliminar("+ key +") --> NOT_FOUND \n");


    }

    private class Nodo {

        int key;
        String value;

        public Nodo(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }

    
}
