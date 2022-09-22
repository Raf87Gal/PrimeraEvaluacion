package ElementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        int experiencia = sc.nextInt();
        sc.nextLine();
        String preferenciaCocina = sc.nextLine();

        System.out.println("El formulario de " + nombre + " , de " + edad + " años y " + experiencia + " de experiencia , está completo. Nos comunicaremos con usted" + " si necesitamos a alguien que cocine comida " + preferenciaCocina + ".");
    }
}
