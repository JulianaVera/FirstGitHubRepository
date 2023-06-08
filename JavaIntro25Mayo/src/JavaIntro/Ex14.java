
package JavaIntro;

import java.util.Scanner;


public class Ex14 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        double value = 0;
        String moneda = "";
        
        System.out.println("Ingrese el valor a cambiar");
        value = leer.nextInt();
        System.out.println("Ingrese la moneda a la que va a hacer el cambio");
        moneda = leer.next();
        
        CalcularCambio(value, moneda);
    }
    
    public static void CalcularCambio(double value, String moneda){
        int i = 0;
        
        switch (moneda) {
            case "libra":
                i = 0;
                break;
            case "dolar":
                i = 1;
                break;
            case "yenes":
                i = 2;
                break;    
            default:
                System.out.println("Opción no válida");;
        }
        
        double vector [] = {0.86, 1.28611, 129.852};
        
        double cambio = vector[i] * value;
        System.out.println(value+" cambiado a "+moneda+" es: "+cambio);
        
    }
}
