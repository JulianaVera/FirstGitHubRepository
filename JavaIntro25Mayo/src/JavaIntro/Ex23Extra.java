/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.*/


package JavaIntro;

import java.util.Scanner;


public class Ex23Extra {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int palabras = 0;
        String word;
        String [] vectorWord = new String [5];
        
        
        while( palabras < 5 ){
            System.out.println("Ingrese una palabra de mínimo 3 y hasta 5 caracteres");
            word = leer.next();
            if (word.length() < 6 && word.length() > 2 ) {     
                if (word.length() == 3) {
                    word = word +" "+" ";
                } else if(word.length() == 4) {
                    word = word +" ";
                }
                vectorWord[palabras] = word;
                palabras++ ;
            }
        }
        
        FillAlphabetSoup(vectorWord);
 
    }
    
    public static boolean FillAlphabetSoup(String [] vectorWord){
        String [][] alphabetSoup = new String [20][20];
        
        for (int i = 0; i < vectorWord.length; i++) {
            int rand = (int) Math.round(Math.random()*19);
            for (int j = 0; j < vectorWord.length; j++) {

                alphabetSoup[rand][j] = vectorWord[i].substring(j, j+1);
            }
        }
        
        
        for (int i = 0; i < alphabetSoup.length; i++) {
            for (int j = 0; j < alphabetSoup[0].length; j++) {
                String letter = alphabetSoup[i][j];
                if (alphabetSoup[i][j] == null || alphabetSoup[i][j].equals(" ")) {
                    int rand = (int) Math.round(Math.random()*9);
                    String llenarMatriz = String.valueOf(rand);
                    alphabetSoup[i][j] = llenarMatriz;
                }
            }
        }
        
        WriteStringMatrix(alphabetSoup);
        return true;
        
    }
    
    public static void WriteStringMatrix(String[][] alphabetSoup){
        
        for (int i = 0; i < alphabetSoup.length; i++) {
            for (int j = 0; j < alphabetSoup[0].length; j++) {
                System.out.print(alphabetSoup[i][j]+ "");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void WriteMatrix(int[][] alphabetSoupNum){
        
        for (int i = 0; i < alphabetSoupNum.length; i++) {
            for (int j = 0; j < alphabetSoupNum[0].length; j++) {
                System.out.print(alphabetSoupNum[i][j]+ "");
            }
            System.out.println(" ");
        }
        
    }
    
}
