
package JavaIntro;

import java.util.Scanner;


public class Ex16 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int size = leer.nextInt();
        int [] vector = new int[size];
        FillVector(vector, size);
        System.out.println("Qué número desea buscar?");
        int num = leer.nextInt();
        FindNumber(vector, num);
        
    }
    
    public static int[] FillVector(int[] vector, int size){
        String aux = "";
        
        for (int i = 0; i < vector.length; i++) {
            int numero = (int)(Math.random()*10+1);
            vector[i] = numero;
        }
        
        for (int elemento: vector) {
            System.out.println(elemento + " ");
        }
        
        return vector;
    }
    
    public static int FindNumber(int[] vector, int num){
        int contador = 0;
        /*for (int elemento: vector) {
            if (elemento == num) {
                contador++ ;
            }
        }*/
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                contador++ ;
                System.out.println("Número encontrado en la posición "+i);
            }
        }
        System.out.println("Se encontró el número " + contador + " veces.");
        return contador;
    }
}
