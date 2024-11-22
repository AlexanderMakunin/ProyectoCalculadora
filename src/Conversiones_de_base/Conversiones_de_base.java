//Aqui se mostrara el apartado del submenu de conversiones
//(seguramente pa levi o pobes)
package Conversiones_de_base;

import lib.IO;

public class Conversiones_de_base {
    /**
     * Método que imprime un SubMenú para las conversiones a base
     * @return la elección escogida
     */
    public static int subMenuConversionesBase() {
        System.out.println("**************************");
        System.out.println("** CONVERSIONES DE BASE **");
        System.out.println("**************************");
        System.out.println("1. De decimal a binario");
        System.out.println("2. De decimal a hexadecimal");
        System.out.println("3. De binario a decimal");
        System.out.println("4. De binario a hexadecimal");
        System.out.println("5. De hexadecimal a binario");
        System.out.println("6. De hexadecimal a decimal");
        System.out.println("---------------------------");
        System.out.println("0. Volver al menu principal");
        return IO.solicitarInt("Elija una opción: ",0,6);
    }

    /**
     * Método para pasar de decimal a binario
     * @param num un numero decimal
     * @return el numero en binario
     */
    public static int decimalBinario(int num) {
        StringBuilder sb = new StringBuilder();
        int resto;
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            resto = num % 2;
            sb.append(resto);
            num /= 2;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    /**
     * Método para pasar de decimal a hexadecimal
     * @param num un número decimal
     * @return el número en hexadecimal
     */
    public static String decimalHexadecimal(int num) {
        StringBuilder sb = new StringBuilder();
        int resto;
        if (num == 0) {
            return "0";
        }
        char[] caracteresHexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (num > 0) {
            resto = num % 16;
            sb.append(caracteresHexadecimal[resto]);
            num /= 16;
        }
        return sb.reverse().toString();

    }

    /**
     * Método para pasar de un número binario a un decumal
     * @param numBinario un número(string) en binario
     * @return el numero en decimal
     */
    public static int binarioDecimal(String numBinario) {
        int numDecimal = 0;
        String digit;
        boolean valido = true;
        int longitud = numBinario.length();

        for (int i = 0; i < longitud; i++) {
            digit = String.valueOf(numBinario.charAt(longitud-1-i));
            if (digit.equals("1")) {
                numDecimal += (int) Math.pow(2,i);
            }else if (!digit.equals("0")) {
                valido = false;
                System.out.println("Número no valido.");
            }
        }
        return valido ? numDecimal : 0;

    }
    /**
     * Método para convertir un número de binario a hexadecimal
     * @param num un numero en binario
     * @return el número convertido a hexadecimal
     */
    public static int binarioHexadecimal(int num) {
        return 0;
    }
    public static int hexadecimalBinario(int num) {
        return 0;
    }
    public static int hexadecimalDecimal(int num) {
        return 0;
    }
    public static void main(String[] args) {
        //Pruebas
        int binarioDecimal = binarioDecimal("1010131");
        System.out.println(binarioDecimal);
    }
}
