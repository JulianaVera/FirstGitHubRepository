
package JavaIntro;

import java.util.Scanner;


public class Ex19 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        int dim = leer.nextInt();
        int [][] matriz = new int [dim][dim];
        LlenarMatriz(matriz);
        int [][] matrizTraspuesta = Traspuesta(matriz,dim);
        Antisimetrica(matriz,matrizTraspuesta);
    }
    
    public static int[][] LlenarMatriz(int[][] matriz){
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int num = (int)(Math.random()*3);
                matriz [i][j] = num;
                System.out.print(" " + matriz [i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("_______________");
        return matriz;
    }
    
    public static int [][] Traspuesta(int[][] matriz, int dim){
        int[][] matrizTraspuesta = new int [dim][dim];
        
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
    
    public static boolean Antisimetrica(int [][] matriz,int[][] matrizTraspuesta){
        boolean antisimetric = true;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != (matrizTraspuesta[i][j]*-1)){
                    antisimetric = false;
                            break;
                }
                if (!antisimetric) {
                    break;
                }
            }
            }
            if (antisimetric) {
                System.out.println("La matriz es antisimétrica");
            } else{
                System.out.println("La matriz NO es antisimétrica");
        }
        return antisimetric;
    }
    
}
