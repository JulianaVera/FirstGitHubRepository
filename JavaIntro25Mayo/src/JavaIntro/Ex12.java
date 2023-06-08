package JavaIntro;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ex12 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String texto;
        Boolean codigovalido, codigoFinal = false;
        double contador = 0, contador2 = 0;
        
        
        do{
            texto = VerifyLenght();
            codigovalido = VerifyText(texto);
            codigoFinal = VerifyLastText(texto);
            if (codigovalido = true) {
            contador++;
            }else{
                contador2++;
            }
        }while(codigoFinal == false);
        
        System.out.println("cantidad de lecturas correctas = "+contador);
        System.out.println("cantidad de lecturas incorrectas = "+contador2);
    }

    public static String VerifyLenght(){
        Scanner leer = new Scanner(System.in);
        String texto;
        
        do{
            System.out.println("Ingrese un código de 5 caracteres");
            texto = leer.next();
        }while (texto.length() != 5 );
        
        return texto;
    }
    
    public static Boolean VerifyText(String texto){
        Boolean codigovalido = false;
                
        for (int i = 0; i < 5; i++) {
        String letra = texto.substring(i, i+1);
        switch (i) {
            case 0:
                if (letra.equals("X")) {
                    codigovalido = true;
                }else{
                    i = 5;
                }
                break;
            case 4:
                if (letra.equals("O")) {
                    codigovalido = true;
                }else{
                    codigovalido = false;
                }
                break;
        }
        }
        if (codigovalido == true) {
                System.out.println("Código válido");
            } else{
                System.out.println("Código INVALIDO");
            }
        return codigovalido;
    }
    

    public static Boolean VerifyLastText(String texto){
        Boolean codigoFinal = false;
        
        if (texto.equals("&&&&&")) {
            codigoFinal = true;
            System.out.println("Saliendo del programa");
        }else{
            codigoFinal = false;
        }
        return codigoFinal;
    }
}


/*
package intro_java_ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        String FDE = "&&&&&", input;
        int secuenciasCorrectas=0, secuenciasIncorrectas=0;
        Scanner leer = new Scanner(System.in);
        
        while(true){
            System.out.print("Ingrese una cadena de caracteres: ");
            input = leer.nextLine();
            if(input.equals(FDE)){
                System.out.println("Fin de linea");
                break;
            }else if(isValidInput(input)){
                System.out.println("Secuencia Correcta");
                secuenciasCorrectas++;
            }else{
                System.out.println("Secuencia Invalida");
                secuenciasIncorrectas++;
            }
        }
        System.out.println("Numero de secuencias correctas: " + secuenciasCorrectas);
        System.out.println("Numero de secuencias incorrectas: " + secuenciasIncorrectas);
    }
    
    private static boolean isValidInput(String input){
        return input.matches("X.{3}O"); // "el .{n} indica que los proximos 3 caracteres pueden ser cualquiera"
    }
}*/ 
