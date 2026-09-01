public class Main {

    public static void main(String[] args){

         TablaHash tabla = new TablaHash();


        System.out.println("= Prueba de tablas ahash = ");

        for (int i = 0; i < 7; i ++){

            int valor;

            System.out.println("Ingrse un valor para la clve " + (i + 1) + ":");

            valor = Integer.parseInt(System.console().readLine());

            tabla.insertar(i, String.valueOf(valor));


        }

        tabla.mostrar();



    }
    
}
