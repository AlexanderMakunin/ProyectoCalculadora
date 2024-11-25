//Este sera el apartado principal
//(Que haga algo el pobes)
//Lo voy a separar en 5 partes para tener una buena organizacion

import lib.IO;
import Operaciones_aritméticas.Operaciones_aritméticas;
import Conversiones_de_base.Conversiones_de_base;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = IO.solicitarInt("Elija una opción: ", 0, 2);
            switch (opcion) {
                case 1:
                    menuOperacionesAritmeticas();
                    break;
                    //Como ya funciona el submenu de converiosnes base pues descomento eso para que sea funcional.
                case 2:
                    menuConversionesBase();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.err.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }


    public static void mostrarMenuPrincipal() {
        System.out.println("*****************");
        System.out.println("** CALCULADORA **");
        System.out.println("*****************");
        System.out.println("1. Operaciones aritméticas");
        System.out.println("2. Conversiones de base");
        System.out.println("0. Salir del programa");
    }
    //Incorporacion del metodo que llema a la libreria de las operaciones aritmeticas contodas las opciones de calculo
    public static void menuOperacionesAritmeticas() {
        int opcion;
        do {
            opcion = Operaciones_aritméticas.mostrarSubMenuOperacionesAritmeticas();
            switch (opcion) {
                case 1:
                    Operaciones_aritméticas.operacionSuma();
                    break;
                    //comento esto mientras marcos hace los otros metodos para las otras operaciones
                /*case 2:
                    Operaciones_aritméticas.operacionResta();
                    break;
                case 3:
                    Operaciones_aritméticas.operacionMultiplicacion();
                    break;
                case 4:
                    Operaciones_aritméticas.operacionDivision();
                    break;
                case 5:
                    Operaciones_aritméticas.operacionRestoDivision();
                    break;*/
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.err.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
//Implementacion para que funcioene el submenu de las conversiones, he sugerido un cambio en la libreria IO, para que la validacion de datos sea Perfecta, veremos a ver si se añade o no.
    public static void menuConversionesBase() {
        int opcion;
        do {
            opcion = Conversiones_de_base.subMenuConversionesBase();
            switch (opcion) {
                case 1:
                    int decimal = IO.solicitarInt("Ingrese un número decimal y te lo devuelvo en binario:", 0, 1000);
                    int decimalBinario = Conversiones_de_base.decimalBinario(decimal);
                    System.out.println("Resultado en binario: " + decimalBinario);
                    break;
                case 2:
                    int decimalHex = IO.solicitarInt("Ingrese un número decimal y te lo devuelvo en hexadecimal:", 0, 1000);
                    String hexResult = Conversiones_de_base.decimalHexadecimal(decimalHex);
                    System.out.println("Resultado en hexadecimal: " + hexResult);
                    break;
                case 3:
                    String binario = IO.solicitarString("Ingrese un número en binario y te lo devuelvo en decimal:", 1, 32);
                    int binarioDecimal = Conversiones_de_base.binarioDecimal(binario);
                    System.out.println("Resultado en decimal: " + binarioDecimal);
                    break;
                case 4:
                    String binToHex = IO.solicitarString("Ingrese un número en binario y te lo devuelvo en hexadecimal:", 1, 32);
                    String binHexResult = Conversiones_de_base.binarioHexadecimal(binToHex);
                    System.out.println("Resultado en hexadecimal: " + binHexResult);
                    break;
                case 5:
                    String hexToBin = IO.solicitarString("Ingrese un número en hexadecimal y te lo devuelvo en binario:", 1, 8);
                    int hexBinResult = Conversiones_de_base.hexadecimalBinario(hexToBin);
                    System.out.println("Resultado en binario: " + hexBinResult);
                    break;
                case 6:
                    String hexToDec = IO.solicitarString("Ingrese un número en hexadecimal y te lo devuelvo en decimal:", 1, 8);
                    int hexDecResult = Conversiones_de_base.hexadecimalDecimal(hexToDec);
                    System.out.println("Resultado en decimal: " + hexDecResult);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
