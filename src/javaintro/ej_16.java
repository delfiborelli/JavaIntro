/*
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaintro;

import java.util.Scanner;

/**
 *
 * @author delfi
 */
public class ej_16 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("LLENAR VECTOR N ALEATORIAMENTE");
        System.out.println("");
        System.out.println("Por favor indique de que tamaño será el vector:");
        int tam=leer.nextInt();
        int[] vector = new int[tam];
        for (int i = 0; i<tam ; i++) {
            vector[i]=(int) (Math.random()*10);
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("Por favor indique que número del 1 al 9 desea buscar: "); 
        int num=leer.nextInt();
        String posiciones="";
        int cont=0;
        for (int i = 0; i<tam ; i++) {
            
            if (vector[i]==num) {
                posiciones=posiciones+"["+i+"]";
                
                cont++;
            }
         
        }
        if (cont>1) {
           System.out.println("El número buscado se encuentra en las posiciones :"+posiciones); 
        }else if (cont==1){     
            System.out.println("El número buscado se encuentra en la pocición:"+posiciones);
        }else{
           System.out.println("El número no se encuentra dentro del vector."); 
        }
        
    }
}
