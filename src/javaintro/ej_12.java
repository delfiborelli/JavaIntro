/*
 * 12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamano;
        int contadorC = 0;
        int contadorI = 0;
        String cadena, cInicial, cFinal;
        do {
            System.out.println("Ingrese una cadena de maximo 5 caracteres, ademas no debe estar vacio.");
            cadena = sc.nextLine();
            tamano = cadena.length();

            while (tamano <= 5 && tamano > 1 && !cadena.equalsIgnoreCase("&&&&&")) {
                cInicial = cadena.substring(0, 1);
                //holas
                cFinal = cadena.substring(tamano - 1, tamano);
                if (cInicial.equalsIgnoreCase("x") && cFinal.equalsIgnoreCase("o")) {
                    contadorC++;
                } else {
                    contadorI++;
                }
                System.out.println("ingrese otra cadena");
                cadena = sc.nextLine();
                tamano = cadena.length();
            }

        } while (tamano > 5 || cadena.equals(""));

        System.out.println("==============>Saliendo");
        System.out.println("La cantidad de cadenas correctas es: " + contadorC);
        System.out.println("La cantidad de cadenas incorrectas es: " + contadorI);
    }
}
