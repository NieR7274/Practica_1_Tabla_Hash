public class Main {

    public static void main(String[] args){

         TablaHash tabla = new TablaHash();


        System.out.println("= Prueba de tablas hash = \n");

        System.out.println("=Insertar=\n");
        tabla.insertar(18,"Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(23, "Elena");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");

        tabla.mostrar();

        System.out.println("\n=Buscar=\n");
        tabla.buscar(24);
        tabla.buscar(18);
        tabla.buscar(31);
        tabla.buscar(999);

    }
    
}
