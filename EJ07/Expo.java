/*Queremos gestionar la venta de entradas (no numeradas) de
* Expocoches Campanillas que tiene 3 zonas, la sala principal con
* 1000 entradas disponibles, la zona de compra-venta con 200
* entradas disponibles y la zona vip con 25 entradas disponibles.
* Hay que controlar que existen entradas antes de venderlas.
* La clase <code>Zona</code> con sus atributos y métodos se
* proporciona al alumno.
* <p>
* El menú del programa debe ser el que se muestra a continuación.
* Cuando elegimos la opción <code>2</code>, se nos debe preguntar
* para qué zona queremos las entradas y cuántas queremos.
* Lógicamente, el programa debe controlar que no se puedan vender
* más entradas de la cuenta.
* <p>
* <code>
* <pre>
* 1. Mostrar número de entradas libres
* 2. Vender entradas
* 3. Salir */
package EJ07;

import EJ07.Zona.Zona;

public class Expo {
    public static void main(String[] args) {
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opcion = 0;
        int opcion2 = 0;
        int n = 0;

        do{
            System.out.println("Expocoches Campanillas");
            System.out.println("1. Mostrar número de entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(System.console().readLine());

            if(opcion == 1){
                System.out.printf("\n\nEn la zona principal hay %d%n", principal.getEntradasPorVender());
                System.out.printf("En la zona de compra-venta hay %d%n ", compraVenta.getEntradasPorVender());
                System.out.printf("En la zona vip hay %d%n ", vip.getEntradasPorVender());
            }
            if(opcion == 2){
                System.out.println("\n\n1. Principal");
                System.out.println("2. Compra-venta");
                System.out.println("3. Vip");
                System.out.print("Elige la zona para la que quieres comprar las entradas: ");
                opcion2 = Integer.parseInt(System.console().readLine());
                System.out.print("¿Cuántas entradas quieres? ");
                n = Integer.parseInt(System.console().readLine());
                switch (opcion2) {
                    case 1:
                        principal.vender(n);
                        break;
                    case 2:
                        compraVenta.vender(n);
                        break;
                    case 3:
                        vip.vender(n);
                        break;
                    default:
                        break;
                }
            }

        }while(opcion < 3);
    }
}
