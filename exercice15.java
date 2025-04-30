import java.util.Scanner;

public class exercice15 {

    public static void main(String[]args) {

       String devise;

       String cdevise;
       
        float arg;

        float carg;


        Scanner clavier = new Scanner(System.in);
        
        
        System.out.print("Quel est votre monnaie ?");
        
        devise=clavier.next();

        
        System.out.print("Quel est votre montant ?");

        arg=clavier.nextDouble();

        
        System.out.print("Vous voulez la convertir en quelle devise ?");

        cdevise=clavier.next();


        if(devise="EUR"&&cdevise=USD){

            carg=arg*1,1422	;

        }else if(devise="EUR"&&cdevise="GBP"{

            carg=


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


