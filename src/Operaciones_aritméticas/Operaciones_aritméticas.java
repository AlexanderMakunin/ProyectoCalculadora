//Aqui se mostrara el apartado del submenu de operaciones aritmeticas
//(Este seguramente pa marcos o pobes)
package Operaciones_aritméticas;

import lib.IO;

import java.util.Scanner;

public class Operaciones_aritméticas {
    public static void main(String[] args) {
        operacionResta();
    }

    /**
     * Muestre el Submenú de Operaciones Aritméticas devolviendo la opción elejida
     * @return Devuelve la opción elejida por el usuario
     */
    public static int mostrarSubMenuOperacionesAritmeticas(){
        System.out.println("\n*****************************");
        System.out.println("** OPERACIONES ARITMÉTICAS **");
        System.out.println("*****************************");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto de la división");
        System.out.println("-----------------------------");
        System.out.println("0. Volver al menú principal");
        return IO.solicitarInt("Elija una opción",0,5);
    }

    /**
     * Pide dos numeros double, los cuales pueden ser negativos, y los suma, y cuando hace la operacion muestra por pantalla el num1 + num2 y el resultado final
     */
    public static void operacionSuma(){
        double num1 = IO.obtenerNumero("Introduzca el primer número");
        double num2 = IO.obtenerNumero("Introduzca el segundo numero");
        double suma = num1 + num2;
        System.out.printf("El resultado de la suma de %.6f + %.6f es de %.6f", num1,num2,suma);
    }

    /**
     * Pide dos numeros double, los cuales pueden ser negativos, y los resta, y cuando hace la operacion muestra por pantalla el minuendo - sustraendo y el resultado final
     */
    public static void operacionResta(){
        double minuendo = IO.obtenerNumero("Introduzca el minuendo de la resta");
        double sustraendo = IO.obtenerNumero("Introduzca el sustraendo de la resta");
        double resta = minuendo - sustraendo;
        System.out.printf("El resultado de la resta de %.6f - %.6f es de %.6f",minuendo,sustraendo,resta);
    }
}
