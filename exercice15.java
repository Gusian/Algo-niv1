/*import java.math.BigDecimal;
import java.math.RoundingMode;*/
import java.util.Scanner;

public class exercice15 {

    public static void main(String[]args) {

       String devise;

       String cdevise;
       
        double arg;

        double carg;

        Scanner clavier = new Scanner(System.in);
        
        
        System.out.print("Quel est votre device ?");
        
        devise=clavier.next();

        
        System.out.print("Quel est votre montant ?");

        arg=clavier.nextDouble();

        
        System.out.print("Vous voulez la convertir en quelle devise ? (EUR/USD/GBP)");

        cdevise=clavier.next();


        if(devise.equals("EUR") && cdevise.equals("USD")){

            carg=arg*1.1422	;

        }else if(devise.equals("EUR")&&cdevise.equals("GBP")){

            carg=arg*0.8516	;

        }else if (devise.equals("USD")&&cdevise.equals("EUR")){

            carg=arg*0.8845 ;

        }else if (devise.equals("USD")&&cdevise.equals("GBP")){

            carg=arg*0.7534 ;

        }else if (devise.equals("GBP")&&cdevise.equals("EUR")){

            carg=arg*1.1746 ;

        }else if (devise.equals("GBP")&&cdevise.equals("USD")){

            carg=arg*1.3268 ;

        }else{

            System.out.print("Données invalides");
            carg=0;
        }

        carg=Math.round(carg*100);

        carg=carg/100;

        
        if(devise.equals("EUR")||devise.equals("USD")||devise.equals("GBP")){
        
            System.out.println("Votre montant de "+arg+devise+" vaut "+carg+cdevise);

        }else{

            System.out.println("");

        }
        clavier.close();
    }
}












/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/


