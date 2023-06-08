
package JavaIntro;

import java.util.Scanner;


public class Ex18 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [4][4];
        LlenarMatriz(matriz);
        Traspuesta(matriz);
    }
    
    /*public static int[][] LlenarMatriz(int[][] matriz){
        
        for (int[] fila:matriz) {
            for (int elemento: fila) {
                int num = (int)(Math.random()*10+1);
                elemento = num;
                System.out.print(" " + elemento);
            }
            System.out.println(" ");
        }
        return matriz;
    }*/
    
    public static int[][] LlenarMatriz(int[][] matriz){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int num = (int)(Math.random()*10);
                matriz [i][j] = num;
                System.out.print(" " + matriz [i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("_______________");
        return matriz;
    }
    
    public static int [][] Traspuesta(int[][] matriz){
        int[][] matrizTraspuesta = new int [4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTraspuesta [j][i] = matriz [i][j];
            }
        }
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta[0].length; j++) {
                System.out.print("" + matrizTraspuesta [i][j]);
            }
            System.out.println(" ");
        }
        return matrizTraspuesta;
    }
   
}
