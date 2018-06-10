/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
*Tomado de 
*https://www.lawebdelprogramador.com/codigo/Java/2666-Metodo-de-ordenacion-de-Burbuja.html
*/

package burbuja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author i5
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*Leemos del teclado*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        /*Pedimos el tamaño del array*/
        System.out.print("\nIngrese el número de datos a ingresar :");
        int tam = Integer.parseInt(in.readLine());
        
        /*Creamos y Lleamos el arreglo*/
        int arr[] = new int[tam];
        System.out.println();
        int j=0;
        for(int i=0; i<arr.length; i++){
            j+=1;
            System.out.println("Elemento "+j+" : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        algoritmoBurbuja(arr);
    }
    
    static void algoritmoBurbuja(int array[]){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] < array[j + 1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+"\n");
        }
    }
}
