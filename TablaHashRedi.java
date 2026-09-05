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
        
        int posicion = buscar(key);

        if (posicion != -1) {
            
            tabla[posicion].value = value;
            return;
        }

        for (int i = 0; i < m; i++){

             posicion = (funcionHash(key) + i) % m;

            
            if (tabla[posicion] == null || tabla[posicion].deleted) {
                tabla[posicion] = nuevo;
                return;
            }

        }
            System.out.println("Ya no se pueden insetar mas elemetos en la tabla.");

        
    }

    public void mostrar() {

        for (int i = 0; i < m; i++) {

            if (tabla[i] != null && !tabla[i].deleted) {
                System.out.println(i + " -> (" + tabla[i].key + ", " + tabla[i].value + ")");
            }
            else {
                System.out.println(i + " -> null");
            }

        }
    }

    public int buscar(int key) {

        for (int i = 0; i < m; i++){

            int posicion = (funcionHash(key) + i) % m;

            if (tabla[posicion] == null) {
                System.out.print("buscar("+ key +") --> NOT_FOUND \n");
                return -1 ;
            }
            else if (!tabla[posicion].deleted && tabla[posicion].key == key) {
                System.out.print("buscar("+ key +") --> '" + tabla[posicion].value + "'\n");
                return posicion;
            }
            
        }

        return -1 ;
    }

    public void eliminar(int key){


        for (int i = 0; i < m; i++){

            int posicion = (funcionHash(key) + i) % m;

            if (tabla[posicion] == null) {
                 System.out.print("eliminar("+ key +") --> NOT_FOUND \n");
                return;
            }

            if (!tabla[posicion].deleted && tabla[posicion].key == key) {
                tabla[posicion] = new Nodo();
                System.out.print("eliminar("+ key +") --> OK \n");
                return;
            }
        }

        System.out.print("eliminar("+ key +") --> NOT_FOUND \n");

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

        public Nodo(){

            this.key = -1;
            this.value = null;
            this.deleted = true;
        }

    }

    
}
