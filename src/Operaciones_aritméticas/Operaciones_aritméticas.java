//Aqui se mostrara el apartado del submenu de operaciones aritmeticas
//(Este seguramente pa marcos o pobes)
package Operaciones_aritméticas;

import lib.IO;

import java.util.Scanner;

public class Operaciones_aritméticas {
    public static void main(String[] args) {
        operacionDivision();
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
     * Pide dos numeros double, los cuales pueden ser negativos, y los suma, y cuando hace la operacion muestra por pantalla el num1 + num2 y el resultado final formateado para los decimales justos
     */
    public static void operacionSuma(){
        double num1 = IO.obtenerNumero("Introduzca el primer número");
        double num2 = IO.obtenerNumero("Introduzca el segundo numero");
        int decimales1 = IO.contarDecimales(num1);
        int decimales2 = IO.contarDecimales(num2);
        double suma = num1 + num2;
        String resultado = IO.formatearResultado(num1,num2,suma);
        System.out.printf("El resultado de la suma de %."+decimales1+ "f + %."+ decimales2+"f es de %s", num1,num2,resultado);
    }

    /**
     * Pide dos numeros double, los cuales pueden ser negativos, y los resta, y cuando hace la operacion muestra por pantalla el minuendo - sustraendo y el resultado final formateado para los decimales justos
     */
    public static void operacionResta(){
        double minuendo = IO.obtenerNumero("Introduzca el minuendo de la resta");
        double sustraendo = IO.obtenerNumero("Introduzca el sustraendo de la resta");
        int decimales1 = IO.contarDecimales(minuendo);
        int decimales2 = IO.contarDecimales(sustraendo);
        double resta = minuendo - sustraendo;
        String resultado = IO.formatearResultado(minuendo,sustraendo,resta);
        System.out.printf("El resultado de la resta de %."+decimales1+ "f - %."+ decimales2+"f es de %s",minuendo,sustraendo,resultado);
    }

    /**
     * Pide dos numeros double, los cuales pueden ser negativos, y los multiplica, y cuando hace la operacion muestra por pantalla el multiplicando * multiplicador y el resultado final formateado para los decimales justos
     */
    public static void operacionMultiplicacion(){
        double multiplicando = IO.obtenerNumero("Introduzca el multiplicando");
        double multiplicador = IO.obtenerNumero("Introduzca el multiplicador");
        int decimales1 = IO.contarDecimales(multiplicando);
        int decimales2 = IO.contarDecimales(multiplicador);
        double multiplicacion = multiplicando * multiplicador;
        String resultado = IO.formatearResultado(multiplicacion);
        System.out.printf("El resultado de la multiplicacion de %."+decimales1+"f * %."+decimales2+"f es de %s",multiplicando,multiplicador,resultado);
    }

    /**
     * Pide dos numeros double, los cuales pueden ser negativos, y los divide, y cuando hace la operacion muestra por pantalla el dividiendo / divisor y el resultado final formateado para los decimales justos
     */
    public static void operacionDivision(){
        double dividiendo = IO.obtenerNumero("Introduzca el dividiendo");
        double divisor = IO.obtenerNumero("Introduzca el divisor");
        int decimales1 = IO.contarDecimales(dividiendo);
        int decimales2 = IO.contarDecimales(divisor);
        double division = dividiendo / divisor;
        String resultado = IO.formatearResultado(division);
        System.out.printf("El resultado de la division de %."+decimales1+"f / %."+decimales2+"f es de %s",dividiendo,divisor,resultado);
    }

}
