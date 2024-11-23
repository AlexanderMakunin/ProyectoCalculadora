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
                /*case 1:
                    menuOperacionesAritmeticas();
                    break;
                case 2:
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
}
