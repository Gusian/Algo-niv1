import java.util.Scanner;

public class exo1 { 
    

    public static void main(String[]args) {
        int a ;
        int b ;
        int resultat ; 
      
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        a=clavier.nextInt();
        System.out.print("Entrer un second nombre");
        b=clavier.nextInt();


        resultat=a+b ;
        System.out.println("resultat vaut "+resultat);

            clavier.close();
            }    
    }
    
    /* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/
