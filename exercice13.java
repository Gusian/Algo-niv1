import java.util.Scanner;

public class exercice13 {

    public static void main(String[]args) {

        int c;
        
        float m;

        Scanner clavier = new Scanner(System.in);
        
        
        System.out.print("Donner une taille en centimètre ?");

        c=clavier.nextInt();
        
        m=c/100;

        System.out.print(c+" cm vaut "+m);

        clavier.close();
    }
}

        
        
        /* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/


