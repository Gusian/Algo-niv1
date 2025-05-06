import java.util.Scanner;

public class exercice19 {

    public static void main(String[]args) {

        int sec;

        int min;

        int heure;

        int secrest;

        int minrest;



        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien de secondes ?");

        sec=clavier.nextInt();

        if(sec>=60){

            secrest=sec%60;
            
            min=sec/60;

            if(min>=60){

                secrest=secrest%60;

                minrest=min%60;

                heure=min/60;

            }else{

                minrest=min;

                heure=0;

            }
        }else{

            heure=0;
            minrest=0;
            secrest=sec;
        }

        System.out.println();

        System.out.println(sec+" secondes correspond à "+heure+" heures, "+minrest+" minutes et "+secrest+" secondes");

        clavier.close();

    }

}

/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/


