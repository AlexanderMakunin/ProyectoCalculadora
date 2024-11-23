//Aqui se mostrara el apartado del submenu de operaciones aritmeticas
//(Este seguramente pa marcos o pobes)
package Operaciones_aritméticas;

import lib.IO;

public class Operaciones_aritméticas {
    public static void main(String[] args) {
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
}
