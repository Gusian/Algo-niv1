import java.util.Scanner;

public class exercice2 {
    public static void main(String[]args) {
        int a;
        int b;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        a=clavier.nextInt();
        System.out.print("Entrer un second nombre");
        b=clavier.nextInt();

        int s;
        s=a-b;
        String m;
       if (s<0) {
            m= "inférieur à 0"; 
       }else{
            m= "supérieur ou égal à 0";
       }
        System.out.println("le résultat est "+s);System.out.println(m);
            
        clavier.close();
            

    }
}






/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */