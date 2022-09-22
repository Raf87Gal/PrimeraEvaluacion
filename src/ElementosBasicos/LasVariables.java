package ElementosBasicos;

public class LasVariables {
    public static void main(String[] args) {
        // Variables
        int a; // Declaro la variable a ( a partir de ahora hay un trocito de memoria que se llama a)
        // Por favor, las variables en minúscula
        a = 5;// y a continuación guardo en ella el valor 5
        System.out.println("La variable a vale " + a);
        // su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + a);

        // Reglas para nombrar variables
        //int 0a = 5; (peta)

        // Reglas para nombrar variables
        // No puede comenzar por ningún dígito
        //int 5c = 4; --> no compila
        // Puede contener cualquier letra o dígito
        int c58 = 2;
        // No puede contener ningún carácter especial (signos de puntuación,...)
        // a excepción de los caracteres _ y $
        int _variable = 3;
        int $otraVariable = 4;
        // No puede contener espacios
        //int otra variable; --> no compilo

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("============");
        System.out.println("Las variables se declaran poniendo 1ª el tipo de variable que es y 2ª el nombre que le damos a la variable");
        System.out.println("Variables para números enteros: Byte, short, int, long");
        System.out.println("byte");
        byte variableBytePos = 127; // es el número más grande que puedo guardar en una variable tipo byte
        byte variableByteNeg = -128; // es el número más pequeño que puedo guardar en una variable byte
        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableByteNeg = " + variableByteNeg);
        System.out.println("Números con decimales: float o double");
        double decimal = 3.14;
        double numero = 3;
        System.out.println(numero);
        float otroDecimal = 8.43f; // si declaras una variable de tipo float ponemos una f

        // Formas alternativas de declarar una variable (pag 11)
        String lenguaje = "java" ;
        String version = " 8 o superior";
        // esto también se puede hacer así:
        String lenguaje1 = "java", version1 = "10 o superior";
        int num1 = 5, num2 = 10; // declaro dos variables de tipo int en la misma línea
        // también podría hacer
        int num3; // aquí declara la variable sin asignar nada, coge el valor por defecto; en los números
        num3 = 6;
        num3 = num1; // aquñi guarda en num3 el valor 5
        System.out.println(num3);

        // Inferencia de tipos
        var variable = "Hola";
        var otravariable = 10;
        var var = "Toma";




    }
}
