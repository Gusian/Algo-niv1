import java.util.Scanner;

public class exercice6 {
    public static void main(String[]args) {
        String p;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer votre prénom : ");
        p=clavier.next();
        int a;
        System.out.print("Entrer votre âge : ");
        a=clavier.nextInt();
        System.out.println("Je m'appelle "+p+" j'ai "+a+ " ans.");
        clavier.close();         

    }
}



/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/