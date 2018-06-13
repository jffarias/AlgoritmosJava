/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoseleccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author i5
 * Ayuda
 * Algoritmos de ordenación – 2. Selección
 * https://www.youtube.com/watch?v=ZMO3Fow05tg
 * https://www.ecured.cu/Algoritmo_de_ordenamiento_por_selecci%C3%B3n
 * Time:
 * BUILD SUCCESSFUL (total time: 27 seconds)
 */
public class AlgoritmoSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
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
        algoritmoSeleccion(arr);
    }
    
    static void algoritmoSeleccion(int array[]){
        for(int i=0; i<array.length-1; i++){
            //Guardamos el minimo
            int min = i;
            //Recorremos el arreglo apartir del segundo elemento
            for(int j=i+1; j<array.length; j++){
                //Si el minimo actual es mayor que el
                //numero siguiente, cambiamos posicion
                if(array[j] < array[min]){
                 min = j;   
                }
            }
            //Si 
            if(i != min){
                //Usamos una variable auxiliar para
                //almacenar temporalmente el min actual
                int aux = array[i];
                array[i] = array[min];
                array[min] = aux;
            }
        }
        
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+"\n");
        }
    }
}
