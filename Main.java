public class Main {

    public static void main(String[] args){

         TablaHash tabla = new TablaHash();


        System.out.println("= Prueba de tablas hash = \n");

        System.out.println("= Prueba 1: Tabla vacía =");
        System.out.println();
        tabla.mostrar();
        System.out.println();
        tabla.buscar(10);

        System.out.println("\n= Prueba 2:Inserción básica =\n");
        tabla.insertar(18,"Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(23, "Elena");
        System.out.println("");
        tabla.mostrar();

        System.out.println("\n=Buscar=\n");
        tabla.buscar(18);
        tabla.buscar(10);
        tabla.buscar(23);

        System.out.println("\n= Prueba 3: Colisiones =\n");
        tabla.insertar(24,"Maria");
        tabla.insertar(31, "Carlos");  
        System.out.println("");
        
        tabla.mostrar();

        System.out.println("");
        tabla.buscar(10);
        tabla.buscar(24);
        tabla.buscar(31);

        System.out.println("\n= Prueba 4: Eliminación con colisión =\n");
        tabla.eliminar(24);
        
        System.out.println();
        tabla.mostrar();

        System.out.println("");
        tabla.buscar(24);
        tabla.buscar(10);
        tabla.buscar(31);

        System.out.println("\n= Prueba 5: Llave inexistente =\n");      
        tabla.eliminar(999);
        System.out.println();
        tabla.mostrar();

        System.out.println("\n= Prueba 6: Actualización de una llave existente\n");
        tabla.insertar(18,"Ana");
        tabla.insertar(18,"Ana Maria");
        System.out.println();

        tabla.mostrar();
        System.out.println();
        tabla.buscar(18);

        System.out.println("\n= Ejecución Final =\n");

        tabla.eliminar(23);
        tabla.eliminar(10);
        tabla.eliminar(31);
        tabla.eliminar(18);
        System.out.println();

        tabla.insertar(18,"Ana");
        tabla.insertar(10,"Luis");
        tabla.insertar(24,"Maria");
        tabla.insertar(31,"Carlos");

        tabla.mostrar();
        System.out.println();
        tabla.buscar(24);
        tabla.buscar(99);
        System.out.println();
        tabla.eliminar(24);
        System.out.println();
        tabla.mostrar();

        System.out.println();
        tabla.buscar(24);
        tabla.buscar(31);
    }
    
}
