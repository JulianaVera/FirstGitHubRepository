
package JavaIntro;

import java.util.Scanner;

public class Ex13 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de elementos");
        int element = leer.nextInt();
        
        for (int i = 0; i < element; i++) {
            if (i == 0 || i == (element-1)) {
                for (int j = 0; j < element; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }else {
                for (int j = 0; j < element; j++) {
                    if (j == 0 || j == (element-1)) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
           
        }   
            
    }
    
}

