package JavaIntro;

import java.util.Scanner;

import java.util.Scanner;

public class JavaIntroGuiaParte2 {
//De acá para abajo van los argumentos en los corchetes después de args
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el número 2");
        int num2 = leer.nextInt();
        sonMultiplos(num1, num2);
    }


public static void sonMultiplos(int num1, int num2){
    if (num1 % num2 == 0) {
        System.out.println(num1+" es divisible entre "+num2);
    } else{
       System.out.println("No es divisible");
    }
}
}