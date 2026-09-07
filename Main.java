import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n= PRUEBA DE TABLAS HASH =");
            System.out.println("1. Probar Tabla 1 (Encadenamiento)");
            System.out.println("2. Probar Tabla 2 (Sondeo lineal)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    probarTablaUno();
                    break;

                case 2:
                    probarTablaDos();
                    break;

                case 3:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);

        scanner.close();
    }

    public static void probarTablaUno() {

        TablaHash tabla = new TablaHash();

        System.out.println("\n=== TABLA 1: ENCADENAMIENTO ===");

        System.out.println("\n= Prueba 1: Tabla vacia =");
        System.out.println();
        tabla.mostrar();
        System.out.println();
        tabla.buscar(10);

        System.out.println("\n= Prueba 2: Insercion basica =\n");
        tabla.insertar(18, "Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(23, "Elena");
        System.out.println("");
        tabla.mostrar();

        System.out.println("\n= Buscar =\n");
        tabla.buscar(18);
        tabla.buscar(10);
        tabla.buscar(23);

        System.out.println("\n= Prueba 3: Colisiones =");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");

        tabla.mostrar();

        System.out.println("");
        tabla.buscar(10);
        tabla.buscar(24);
        tabla.buscar(31);

        System.out.println("\n= Prueba 4: Eliminacion con colision =\n");
        tabla.eliminar(24);

        System.out.println();
        tabla.mostrar();

        System.out.println();
        tabla.buscar(24);
        tabla.buscar(10);
        tabla.buscar(31);

        System.out.println("\n= Prueba 5: Llave inexistente =\n");
        tabla.eliminar(999);

        System.out.println();
        tabla.mostrar();

        System.out.println("\n= Prueba 6: Actualizacion de una llave existente =\n");
        tabla.insertar(18, "Ana");
        tabla.insertar(18, "Ana Maria");

        tabla.mostrar();

        System.out.println();
        tabla.buscar(18);

        System.out.println("\n= Ejecucion Final =\n");

        tabla.eliminar(23);
        tabla.eliminar(10);
        tabla.eliminar(31);
        tabla.eliminar(18);

        System.out.println();

        tabla.insertar(18, "Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");

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

        System.out.println("\n= Factor de carga =\n");

        //agrrgar factor de carga
        // tabla.factorCarga();

    }

    public static void probarTablaDos() {

        TablaHashRedi tabla = new TablaHashRedi();

        System.out.println("\n=== TABLA 2: SONDEO LINEAL ===");

        System.out.println("\n= Prueba 1: Tabla vacia =");
        System.out.println();
        tabla.imprimirTabla();
        System.out.println();
        tabla.buscar(10);

        System.out.println("\n= Prueba 2: Insercion basica =\n");
        tabla.insertar(18, "Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(23, "Elena");

        tabla.imprimirTabla();

        System.out.println("\n= Buscar =\n");
        tabla.buscar(18);
        tabla.buscar(10);
        tabla.buscar(23);

        System.out.println("\n= Prueba 3: Colisiones =");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");

        tabla.imprimirTabla();

        tabla.buscar(10);
        tabla.buscar(24);
        tabla.buscar(31);

        System.out.println("\n= Prueba 4: Eliminacion con colision =\n");
        tabla.eliminar(24);

        System.out.println();
        tabla.imprimirTabla();

        System.out.println();
        tabla.buscar(24);
        tabla.buscar(10);
        tabla.buscar(31);

        System.out.println("\n= Prueba 5: Llave inexistente =\n");
        tabla.eliminar(999);

        System.out.println();
        tabla.imprimirTabla();

        System.out.println("\n= Prueba 6: Actualizacion de una llave existente =\n");
        tabla.insertar(18, "Ana");
        tabla.insertar(18, "Ana Maria");

        tabla.imprimirTabla();

        System.out.println();
        tabla.buscar(18);

        System.out.println("\n= Ejecucion Final =\n");

        tabla.eliminar(23);
        tabla.eliminar(10);
        tabla.eliminar(31);
        tabla.eliminar(18);

        System.out.println();

        tabla.insertar(18, "Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");

        tabla.imprimirTabla();

        System.out.println();
        tabla.buscar(24);
        tabla.buscar(99);

        System.out.println();
        tabla.eliminar(24);

        System.out.println();
        tabla.imprimirTabla();

        System.out.println();
        tabla.buscar(24);
        tabla.buscar(31);

        System.out.println("\n= Factor de carga =\n");

        tabla.factorCarga();

    }
}
