import java.util.Scanner;

public class exercice4 {
    public static void main(String[]args) {
        int a;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        a=clavier.nextInt();
        String m;
        if(a%2<=0) {
            m="le resultat est paire";
        }else{
        m="le resultat est impaire";
        }
        System.out.println(m);
            clavier.close();         
    }
}







/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/