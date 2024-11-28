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
     * @param numDecimal un numero decimal
     * @return el numero en binario
     */
    public static int decimalBinario(int numDecimal) {
        StringBuilder sb = new StringBuilder();
        int resto;
        if (numDecimal == 0) {
            return 0;
        }
        while (numDecimal > 0) {
            resto = numDecimal % 2;
            sb.append(resto);
            numDecimal /= 2;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
    /**
     * Método para pasar de decimal a hexadecimal
     * @param numDecimal un número decimal
     * @return el número en hexadecimal
     */
    public static String decimalHexadecimal(int numDecimal) {
        StringBuilder sb = new StringBuilder();
        int resto;
        if (numDecimal == 0) {
            return "0";
        }
        char[] caracteresHexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (numDecimal > 0) {
            resto = numDecimal % 16;
            sb.append(caracteresHexadecimal[resto]);
            numDecimal /= 16;
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
     * @param numBinario un numero en binario
     * @return el número convertido a hexadecimal
     */
    public static String binarioHexadecimal(String numBinario) {
        int decimal = binarioDecimal(numBinario);
        return decimalHexadecimal(decimal);
    }

    /**
     * Método que convierte un número hexadecimal a uno binario
     * @param num un número hexadecimal
     * @return el número en binario
     */
    public static int hexadecimalBinario(String num) {
        int decimal = hexadecimalDecimal(num);
        return decimalBinario(decimal);
    }

    /**
     * Método que pasa un número de hexadecimal a decimal
     * @param num un string de un número hexadecimal
     * @return el número en decimal
     */
    public static int hexadecimalDecimal(String num) {
        boolean valido = true;
        int longitud = num.length();
        char digito;
        int numDecimal = 0;

        for (int i = 0; i < longitud; i++) {
            digito = num.charAt(longitud-1-i);
            if (Character.isLetter(digito)) {
                int correspondenciaLetra  = switch (digito) {
                    case 'A','a' -> 10;
                    case 'B','b' -> 11;
                    case 'C','c' -> 12;
                    case 'D','d' -> 13;
                    case 'E','e' -> 14;
                    case 'F','f' -> 15;
                    default -> 0;
                };
                if (correspondenciaLetra==0) {
                    valido = false;
                }
                numDecimal += (correspondenciaLetra * (int) Math.pow(16,i));
            }else {
                numDecimal += (Character.getNumericValue(digito) * (int) Math.pow(16,i));
            }
        }
        return valido ? numDecimal : -1;
    }
    public static void main(String[] args) {
        //Pruebas

        int choice;
        do {
            choice = subMenuConversionesBase();
            switch (choice) {
                case 1 -> {
                    int decimal = IO.solicitarInt("Ingrese un número decimal y te lo devuelvo en binario:", 0);
                    int decimalBinario = decimalBinario(decimal);
                    System.out.println(decimalBinario);
                }
                case 2 -> {
                    int decimal = IO.solicitarInt("Ingrese un número decimal y te lo devuelvo a hexadecimal:",0);
                    String deximalHexadecimal = decimalHexadecimal(decimal);
                    System.out.println(deximalHexadecimal);
                }
                case 3 -> {
                    String binario = IO.solicitarString("Ingrese un número en binario y te lo devuelvo en decimal:",0,100000000);
                    int binarioDecimal = binarioDecimal(binario);
                    System.out.println(binarioDecimal);
                }
                case 4 -> {
                    String binario = IO.solicitarString("Ingrese un número en binario y te lo devuelvo en hexadecimal:",0,10000000);
                    String binarioHexadecimal = binarioHexadecimal(binario);
                    System.out.println(binarioHexadecimal);
                }
                case 5 -> {
                    String hexadecimal = IO.solicitarString("Ingrese un número en hexadecimal y te lo devuelvo en binario:",0,100000);
                    int hexadecimalBinario = hexadecimalBinario(hexadecimal);
                    System.out.println(hexadecimalBinario);
                }
                case 6 -> {
                    String hexadecimal = IO.solicitarString("Ingrese un número en hexadecimal y te lo devuelvo en decimal:",0,100000);
                    int hexadecimalDecimal = hexadecimalDecimal(hexadecimal);
                    System.out.println(hexadecimalDecimal);
                }
                case 0 -> {

                }
            }

        } while (choice != 0);
    }
}
