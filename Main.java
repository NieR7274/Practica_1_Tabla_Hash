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

        System.out.println("\n= Insertar =");
        tabla.insertar(18, "Ana");
        tabla.insertar(10, "Luis");
        tabla.insertar(23, "Elena");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");

        tabla.insertar(24, "Ana Maria");

        tabla.mostrar();

        System.out.println("\n= Buscar =");
        tabla.buscar(24);
        tabla.buscar(18);
        tabla.buscar(31);
        tabla.buscar(999);

        System.out.println("\n= Eliminar =");
        tabla.eliminar(24);
        tabla.eliminar(999);
        tabla.eliminar(24);

        System.out.println("\n= Tabla despues de eliminar =");
        tabla.mostrar();
    }

    public static void probarTablaDos() {

        TablaHashRedi tabla = new TablaHashRedi();

        System.out.println("\n=== TABLA 2: SONDEO LINEAL ===");

        System.out.println("\n= Insertar =");

        tabla.insertar(10, "Luis");
        tabla.insertar(24, "Maria");
        tabla.insertar(31, "Carlos");
        tabla.insertar(18, "Ana");

        tabla.insertar(24, "Ana Maria");

        tabla.mostrar();

        System.out.println("\n= Buscar =");
        tabla.buscar(24);
        tabla.buscar(31);
        tabla.buscar(999);

        System.out.println("\n= Eliminar =");
        tabla.eliminar(24);
        tabla.eliminar(999);

        System.out.println("\n= Tabla despues de eliminar =");
        tabla.mostrar();
    }
}