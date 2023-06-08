package JavaIntro;
//Acá si importa el Scanner
import java.util.Scanner;

public class JavaIntroGuia {
//De acá para abajo van los argumentos en los corchetes después de args
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*
        String nombre = "Juliana";
        int num1 = 32;
        double decimales = 3.55;

        double suma = num1 + decimales;
        System.out.println(suma);
        
        int edad = 32;
        System.out.println("La edad de " + nombre + " es "+edad);
        System.out.println("Ingresa tu lo que sea int");
        double loquesea = leer.nextDouble();
       
        System.out.println("Ingrese el valor 1 (Verdadero o falso)");
        boolean var1 = leer.nextBoolean();
        System.out.println("Ingrese el genero");
        char gender = leer.next().charAt(0);
        
        System.out.println("Loquesea" + gender);
*/
        /*
        System.out.println("Ingrese el numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el numero 2");
        int num2 = leer.nextInt();
        
        if(num1 > 25  && num2 > 25) {
            System.out.println("Ambos números son mayores que 25");
        }else if(num2 > 25 && num1 < 25){
            System.out.println("El numero 2 es mayor que 25");
        }else if(num1 > 25 && num2 < 25){
            System.out.println("El numero 1 es mayor que 25");
        }else{
            System.out.println("Los n23úmeros son menores que 25");
            }*/
        
        /*
        System.out.println("Ingrese la opción para el tipo de motor");
        int opcion1 = leer.nextInt();
        switch (opcion1) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormingón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                throw new AssertionError();
        }
        */
    
        /*
        System.out.println("Ingrese la nota");
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese la nota");
            nota = leer.nextInt();
        }
         */
        /*
        int num1;
        int suma = 0;
        int i = 0;
        do {            
            System.out.println("Ingrese el numero");
            num1 = leer.nextInt();
            if (num1 == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            }
            suma = suma + num1;
            i++;
            if (i == 20) {
                System.out.println("La suma de los números es " + suma);
            }
        } while (i < 20);
        */
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número entre el 0 y el 20");
            int num1 = leer.nextInt();
            System.out.print(num1);
            for (int j = 0; j < num1; j++) {
                System.out.print("*");
            }
        }
        */
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String frase2 = fraseCambiada(frase);
        System.out.println("La nueva frase es" + frase2);
    }
    
    public static String fraseCambiada (String frase){
        String fraseNueva = "";
        
        for (int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(i, i+1);
            letra = letra.toLowerCase();
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
        fraseNueva += letra;
        }
        return fraseNueva;
    }
}
