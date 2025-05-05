import java.util.Scanner;

public class exercice17 {

    public static void main(String[]args) {

        int carb;

        double pc;

        int dist;

        double prix;

        Scanner clavier = new Scanner(System.in);

        System.out.print("Carburant par id : \nGazol (B7) = 0\nSans Plomb 95 = 1\nSans Plomb 98 (E5) = 2");

        carb=clavier.nextInt();

        if(carb==0){

            System.out.println("Vous avez choisi : Gazol");
            pc=0.08613;

        }else if(carb==1){

            System.out.println("Vous avez choisi : Sans Plomb 95");
            pc=0.109915;

        }else if(carb==2){

            System.out.println("Vous avez choisi : Sans Plomb 98");
            pc=0.115245;

        }else{

            System.out.println("Carburant invalide !");
            pc=0;

        }
            if(pc!=0){
           
                System.out.println("Quel est la distance à parcourir (en km) ?");
 
            dist=clavier.nextInt();

            }else{

                dist=0;
                System.out.print("");
            }

            prix=pc*dist;

            prix=Math.round(prix*100);

            prix=prix/100;

            if (pc!=0){

                System.out.println("Pour "+dist+" km vous allez dépenser "+prix+" euros.");

                clavier.close();

            }

    }
}




/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/


