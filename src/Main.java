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
                /*case 2:
                    menuConversionesBase();
                    break;*/
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
                case 2:
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
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.err.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }

    
}
