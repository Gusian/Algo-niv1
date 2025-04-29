import java.util.Scanner;

public class exercice5 {
    public static void main(String[]args) {
        int a;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        a=clavier.nextInt();
        int b;
        System.out.print("Entrer un second nombre : ");
        b=clavier.nextInt();
        int c;
        System.out.print("Entrer un troisième nombre : ");
        c=clavier.nextInt();
        int e;
        e=a*b/c;
        System.out.println("l'équation est "+a+"x"+b+"/"+c);
        System.out.println("le résultat est "+e);
        String r;
        if(e<10) {
            r="inférieur à 10";
        } else if(e==410){
            r="égal à 10";
        }else{
            r="supérieur à 10";
        }
        System.out.println(r);
            clavier.close();         
    }
}




/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/