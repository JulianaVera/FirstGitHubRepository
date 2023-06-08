/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/


package JavaIntro;

import java.util.Scanner;


public class Ex20 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        LlenarMatriz(matriz);
        EscribirMatriz(matriz);
        VerificarMagico(matriz);
    }
    
    public static int[][] LlenarMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.println("Ingrese el valor");
            matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
        }
        
        return matriz;
    }
    
    public static void EscribirMatriz(int[][] matriz){
        
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("" + matriz [i][j]);
            }
            System.out.println(" ");
        }
    }
    
    public static boolean VerificarMagico(int[][] matriz){
        boolean magico = true;

        int [] producto = new int [matriz.length*2+2];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                producto[i] += matriz[i][j];
                producto[i+matriz.length] += matriz[j][i];
            }
            producto[matriz.length-2] += matriz[i][i];
            producto[matriz.length-1] += matriz[i][matriz.length-1-i];
        }
        
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] != producto[0]) {
               magico = false;
               break;
            }
            
        if (magico) {
            System.out.println("La matriz es mágica"); 
        }else
                System.out.println("NO ES MAGICO");
        }
        
        return magico;
    }

}
