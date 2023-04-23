/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_11 {
    public static void main(String[] args) {
         Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese dos números enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("");
        
        int opcion;
        String confirmacion="";
        
        do {
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.print("Elija opción: ");
        
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma de los números es: "+(num1+num2));
                break;
            case 2:
                System.out.println("La resta entre los números es: "+(num1-num2));
                break;
            case 3:
                System.out.println("El producto de los números es: "+(num1*num2));
                break;
                case 4:
                System.out.println("La división entre los números es: "+(num1/num2));
                break;
                case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("S")){
                    System.out.println("(saliendo del programa...)");
                }else if (respuesta.equalsIgnoreCase("N")){
                    confirmacion = "N";
                }
                break;
                
            default: System.out.println("Opción no válida");
                break;
        }
        
    }     while (opcion != 5 || confirmacion.equalsIgnoreCase("N"));
        }
}
