import java.util.Scanner;

public class exercice12 {
    public static void main(String[]args) {
        float p;
        
        int r;
        
        float s;

        Scanner clavier = new Scanner(System.in);
        
        
        System.out.print("Votre prix ? ");
        
        p=clavier.nextFloat();

       
        System.out.print("Votre réduction (en pourcentage %) ?");

        r=clavier.nextInt();

        s=p-(p*r/100);

       
        System.out.print("Prix après réduction de "+r+"% :");
        
        System.out.print(s+" euros");
        
        clavier.close();
    }
}




/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/


