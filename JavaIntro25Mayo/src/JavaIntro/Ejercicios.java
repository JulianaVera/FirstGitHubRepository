package JavaIntro;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicios {
//De acá para abajo van los argumentos en los corchetes después de args
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /*Ejercicio 1
        System.out.println("Ingrese numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma da= "+suma);
        /*
 
        /*Ejercicio 5 
        System.out.println("Ingrese un número entero");
        int num1 = leer.nextInt();
        
        double raiz = Math.sqrt(num1);
        System.out.println("La raíz cuadrada es: "+raiz);
        */
        
        /*Ejercicio 6
        
        System.out.println("Ingrese un número entero");
        int num1 = leer.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("El número " + num1 + " es par.");
        } else {
            System.out.println("El número es impar");
        }
        */
        
        /*Ejercicio 7
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
        */
        
        /*Ejercicio 8
        int longitud;
        
        do {            
            System.out.println("Ingrese una frase de largo = 8");
            String frase = leer.nextLine();
            longitud = frase.length();
            if (longitud == 8) {
                System.out.println("Correcto!");
            }else{
                System.out.println("Incorrecto!!");
            }
        } while ( longitud != 8);
        */
        
        /*Ejercicio 9
        
        System.out.println("Ingrese una frase que empiece por A");
        String frase = leer.nextLine();
        String letra1 = frase.substring(0, 1);
        
        if (letra1.equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        */
        
        /*Ejercicio 10
        
        System.out.println("Ingrese un límite superior");
        int num1 = leer.nextInt();
        
        int suma = 0;
        
        do {
            System.out.println("Ingrese un número para sumar");
            int num2 = leer.nextInt();
            suma = suma + num2;
            if (suma >= num1) {
                System.out.println("Se superó el límite");
            }
        } while (suma <= num1);
        */
        
        /*Ejercicio 10*/
        
        int opcion;
        double resultado;
        String salida;
       
            System.out.println("Ingrese dos números");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
         do{    
            System.out.println("Ingrese una opción");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("La suma es = "+resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("La resta es = "+resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("La multiplicación es = "+resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("La división es = "+resultado);
                    break;
                case 5:
                    System.out.println("¿Está seguro de que desea salir del programa?(s/n)");
                    leer.nextLine();
                    salida = leer.nextLine();
                    if (salida.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo del programa");
                    } else{
                    opcion = 6;
                }
                    break;
                default:
                    System.out.println("Opción no válida");
            }    
        } while(opcion != 5);
}
}

