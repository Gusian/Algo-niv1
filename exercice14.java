import java.util.Scanner;

public class exercice14 {

    public static void main(String[]args) {
        
        Boolean A;
        
        Boolean B;

        Boolean C;

        Boolean ea;

        Scanner clavier = new Scanner(System.in);
        
        System.out.print("Donner la valeur de A :");
        A=clavier.nextBoolean();
        
        System.out.print("Donner la valeur de B :");
        B=clavier.nextBoolean();
        
        System.out.print("Donner la valeur de C :");
        C=clavier.nextBoolean();

        ea=A||B&&!C;
        System.out.print("Résultat : "+ea);

        clavier.close();
    }
}






/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/


