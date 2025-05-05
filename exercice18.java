import java.util.Scanner;

public class exercice18 {

    public static void main(String[]args) {

      float pret;

      String cdi;
      
      float app;

      String prop;

      float pprop;

      Scanner clavier = new Scanner(System.in);

      System.out.println("Quel est le montant de votre prêt ?");

      pret=clavier.nextInt();

      System.out.println("Etes vous en CDI ?");
      
      cdi=clavier.next();

      System.out.println("Combien avez vous d'apport ?");

      app=clavier.nextInt();

      if(cdi.equals("oui")&&pret<=app*4){

         System.out.println("Vous pouvez obtenir un prêt !"); 

         prop="non";
         pprop=0;


      }else if(pret<=app*4){

         System.out.println("Possédez vous une autre propriété ?");
      }
   }
}

      




     







/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
    * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'abord ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/


