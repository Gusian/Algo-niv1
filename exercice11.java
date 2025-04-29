import java.util.Scanner;

public class exercice11 {
    public static void main(String[]args) {
        int arg;
        arg=3000;
        int rarg;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Bonjour, vous avez "+arg+" euros: Combien voulez vous retirer ?");
        rarg=clavier.nextInt();
        String m;
        if(arg<rarg){
            m="l'argent a bien été retiré de votre compte";
        }else{
            m="fond insuffisant !";
            System.out.print(m);
            clavier.close();
        }
    }
}


/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/


