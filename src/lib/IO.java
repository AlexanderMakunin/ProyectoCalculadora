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
    public static boolean esNumero(String entrada){
        if (entrada == null || entrada.isEmpty()){
            return false;
        }
        for (char c : entrada.toCharArray()){
            if (!Character.isDigit(c) && c !='.' && c !='-' && c !='+' ){
                return false;
            }
        }
        return true;
    }
    /*
    public static String formatearResultado(double numero1, double numero2, double resultado){
        int decimales1 = contarDecimales(numero1);
        int decimales2 = contarDecimales(numero2);
        int decimalesMax = decimales1 > decimales2 ? decimales1 : decimales2;


    }*/

    /**
     * Cuenta a ver si el numero introducido tiene decimales o no los tiene
     * @param numero Es el numero introducido por el usuario
     * @return Devuelve la cantidad de deciamles que tenga el numero, y en el caso de que no tenga, pues devuelve 0 decimales
     */
    public static int contarDecimales(double numero){
        String[] partes = Double.toString(numero).split("\\n");
        if (partes.length == 2) {
            return partes[1].length();
        }
        return 0;
    }
}

