package ElementosBasicos;

import java.util.Scanner;

public class EjemplosLeerPorteclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ahora ya podemos meter datos por teclado
        // Pero para poder utilizarlo después en el programa
        // Tenemos que guardalos en una variable
        // Las variables que guarda palabras o cadensa de texto se llaman String
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine(); // escribo el nombre en el teclado y
        // lo guardo en la variable nombre
        System.out.println("Hola, " + nombre);
        System.out.println("Introduce tus apellido");
        // Creo otra variable para guardar el apellido que va a entrar por teclado
        String apellidos = sc.nextLine();
        System.out.println("Hola, " + nombre + " " + apellidos);
        System.out.println("¿Cuántos años tienes: ");
        int edad = sc.nextInt();
        /*
        Este método nextInt() tiene un peligro: sí a  continuación pones un nextLine()
        se lo salta
        La manera de evitarlo es: cada vez que ya escribo nextInt(), sí sé que luego
        voy a poner nextLine(), escribo un nextLine() adicional, sin más,
        de esta manera "limpiamos" el sc.
         */
        sc.nextLine(); // esto es solo para evitar que salte
        System.out.println(" Vaya, pareces muy joven para tener " + edad + " años.");
        System.out.println("¿Tienes una mascota?");
        String mascota = sc.nextLine();
        System.out.println("Pues muy bien.");

        // Vamos a meter un dato con decimales
        System.out.println("¿Y cual es tu patrimonio?");
        double patrimonio = sc.nextDouble();
        System.out.println("¡" + patrimonio + "!");
        // Con los decimales:
        // Cuando los escribimos en el código fuente: se pone
        // Cuando metemos los datos por teclado: se pone ,
    }
}
