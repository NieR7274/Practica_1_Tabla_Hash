# Practica 1

Practica sobre tablas hash.

* Equipo:

  * Ángel Aaron López Cruz
  * Gabriel Lugo Rosete

1. lenguaje utilizado: Java.

2. instrucciones para ejecutar el programa:

   * Abrir una terminal en la carpeta donde se encuentran los archivos .java.
   * Compilar usando `javac *.java`
   * Ejecutar el Main con el comando `java Main`

3. explicación de cómo ejecutar los casos de prueba:

   * Usar el menú para elegir la tabla que se desea probar.
   * La opción 1 prueba la tabla hash con encadenamiento.
   * La opción 2 prueba la tabla hash con sondeo lineal.

4. explicación de la función hash:

   * Se utiliza la función `h(k) = k mod 7`, donde k es la llave y 7 es el tamaño de la tabla.
   * La función determina la posición inicial donde se intentará guardar cada llave.

5. explicación del manejo de colisiones:

   * Para la tabla hash con encadenamiento, los elementos que tienen la misma posición se almacenan en una lista enlazada.
   * Para la tabla hash con sondeo lineal, cuando una posición está ocupada se revisa la siguiente posición disponible.

6. explicación de qué ocurre cuando dos llaves producen el mismo hash:

   * Si dos llaves producen la misma posición, ocurre una colisión. En la primera tabla se almacenan ambas llaves en la misma posición mediante una lista enlazada. En la segunda tabla se busca otra posición utilizando sondeo lineal.

* ¿Por qué tener una colisión no significa que la tabla hash esté implementada incorrectamente?

  * Porque las colisiones son normales cuando diferentes llaves producen la misma posición. Una tabla hash debe utilizar un método para resolverlas, como el encadenamiento o el sondeo lineal.
