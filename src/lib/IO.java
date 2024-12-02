//Si quereis añadir una wea o lo que sea aqui lo teneis, y no metais codigo basura gracias
package lib;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IO {
    /**
     * Para leer el texto
     */
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Solicita un texto y valida su longitud este comprendida entre lMin y lMax
     *
     * @param msj  Mensaje que se mostrará la usuario
     * @param lMin Minimo de carácteres
     * @param lMax Máximo de carácteres
     * @return Texto leido validado
     */
    public static String solicitarString(String msj, int lMin, int lMax) {
        String res;
        boolean check = true;
        do {
            if (!check) {
                System.err.println("Longitud incorrecta, inténtalo otra vez");
            }
            System.out.println(msj);
            res = scanner.nextLine();
            check = res.length() >= lMin && res.length() <= lMax;

        } while (!check);
        return res;
    }

    /**
     * Solicita un texto y valida su longitud este comprendida entre nMin y nMax, te devuelve el numero puesto
     *
     * @param msj  El mensaje con el que se solicita el número
     * @param nMin Número mínimo permitido
     * @param nMax Número máximo permitido
     * @return devuelve el número introducido
     */
    public static int solicitarInt(String msj, int nMin, int nMax) {
        int num;
        boolean check = true;
        do {
            if (!check) {
                System.err.println("Número introducido incorrecto, intentalo de nuevo.");
            }
            System.out.println(msj);
            num = Integer.parseInt(scanner.nextLine());
            check = num >= nMin && num <= nMax;
        } while (!check);

        return num;
    }

    /**
     * Solicita un texto y valida su longitud que no sea menor al numero nMin, devuelve el numero puesto
     *
     * @param msj El mensaje con el que se solicita el número
     * @param nMin Número mínimo permitido
     * @return devuelve el número introducido
     */
    public static int solicitarInt(String msj, int nMin) {
        int num;
        boolean check = true;
        do {
            if (!check) {
                System.err.println("Número introducido incorrecto, intentalo de nuevo.");
            }
            System.out.println(msj);
            num = Integer.parseInt(scanner.nextLine());
            check = num >= nMin;
        } while (!check);

        return num;
    }

    /**
     * Solicita un numero booleano al usuario y comprueba de que sea un booleano
     * @param mensaje Es el mensaje donde pondremos lo que deberá de introducir el usuario
     * @return Devuelve el numero verificado y todo
     */
    public static double obtenerNumero(String mensaje){
        String entrada = "";
        double numero = 0;
        boolean validacion = false;
        while (!validacion){
            System.out.println(mensaje);
            entrada = scanner.nextLine();
            if (esNumero(entrada)){
                numero = Double.parseDouble(entrada);
                validacion = true;
            }
            else {
                System.out.println("No valido, porfavor introduzca un número");
            }
        }
        return numero;
    }

    /**
     * Booleano que te dice si el String introducido es un numero o cualquier otra cosa
     * @param entrada Es el string el cual queremos saber si es un numero
     * @return Devolvera true en el caso de que se un numero, o false en el caso de que no
     */
    public static boolean esNumero(String entrada) {
        if (entrada == null || entrada.isEmpty()) {
            return false;
        }

        String patron = "^[+-]?\\d*(\\.\\d+)?$";

        return entrada.matches(patron);
    }

    /**
     * Formatea el numero del resultado de la operacion de 2 numeros para sacar un String con los decimales justos y necesarios a los que corresponderia
     * @param numero1 El primer numero introducido
     * @param numero2 El segundo numero introducido
     * @param resultado El resultado de la operacion de los numeros anteriores
     * @return Devuelve un String con los decimales justos de el resultado
     */
    public static String formatearResultado(double numero1, double numero2, double resultado){
        int decimales1 = contarDecimales(numero1);
        int decimales2 = contarDecimales(numero2);
        int maxDecimales = decimales1 > decimales2 ? decimales1 : decimales2;
        String formato = "%." + maxDecimales + "f";
        return String.format(formato, resultado);
    }

    /**
     * Cuenta los decimales que tiene cada uno, en el caso de que no haya decimales sacará un 0, si hay decimales, sacará el numero de decimales
     * @param numero Es el numero que queremos contar los decimales
     * @return Devuelve la cantidad de decimales
     */
    public static int contarDecimales(double numero){
        String textoNumero = Double.toString(numero);
        int puntoIndex = textoNumero.indexOf('.');
        if (puntoIndex == -1) {
            return 0;
        } else {
            return textoNumero.length() - puntoIndex - 1;
        }
    }

    /**
     * Formatea el resultado principaklmente para la multiplicacion, para cuando se incrementan la cantidad de decimales salgan todos los decimales justos
     * @param resultado Es el resultado de la operacion
     * @return Devuelve el resultado con los decimales justos
     */
    public static String formatearResultado(double resultado) {
        String resultadoStr = Double.toString(resultado);
        int puntoIndex = resultadoStr.indexOf('.');
        if (puntoIndex == -1) {
            return resultadoStr;
        }
        int ultimoIndiceNoZero = resultadoStr.length() - 1;
        while (ultimoIndiceNoZero > puntoIndex && resultadoStr.charAt(ultimoIndiceNoZero) == '0') {
            ultimoIndiceNoZero--;
        }
        if (ultimoIndiceNoZero == puntoIndex) {
            return resultadoStr.substring(0, puntoIndex);
        }
        return resultadoStr.substring(0, ultimoIndiceNoZero + 1);
    }
}

