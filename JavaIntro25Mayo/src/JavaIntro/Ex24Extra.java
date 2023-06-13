/*Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...*/

package JavaIntro;

import java.util.Scanner;


public class Ex24Extra {

   
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la posición de fibonacci");
        int Fibo = leer.nextInt();
        int n = Fibonacci(Fibo);
        
    }
    
    public static int Fibonacci(int Fibo){
        int num1 = 1;
        int num2 = 1;
        int suma = 1;
        int n = 0;
        
        
        if (Fibo == 1) {
            n = 1;
        } else{
            System.out.print(num1+ "|"+ num2);
            for (int i = 2; i < Fibo; i++) {
                suma = num1 + num2;
                num1 = num2;
                num2 = suma;
                System.out.print("|" + suma + "");
            }
            System.out.println("");
        }
            
        return n;
    }
    
}
