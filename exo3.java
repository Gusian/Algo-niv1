import java.util.Scanner;

public class exo3 {
    public static void main(String[]args) {
        int a ;
        int b;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        a=clavier.nextInt();
        System.out.print("Entrer un second nombre");
        b=clavier.nextInt();
        int r;
        r=a+b;
            System.out.println("Le resultat est "+r);
        String m;
        if(r%2<=0) {
            m="le resultat est paire";
        }else{
        m="le resultat est impaire";
        }
            System.out.println(m);
            clavier.close();         


    }
}



/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = x
 * b = y
 * 
 * resultat = a + b
 * 
 * resultat = z
 * 
 * resultat est impaire/pair
 * 
 * 
 * 
*/