import java.util.Scanner;

public class exercice16 {

    public static void main(String[]args) {
        
        float p;
        
        int age;

        int pd;

        String cb;

        float m;

        float pf;

        m=1;

        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner votre age : ");

        age=clavier.nextInt();

        System.out.print("Combien de place sont disponnible ? : ");

        pd=clavier.nextInt();

        System.out.print("Prenez vous une classe business ? (Y/N) : ");

        cb=clavier.next();

        System.out.print("Quel est le prix de votre vol ? : ");

        p=clavier.nextFloat();

        if(age<18){

            m -=0.2;

        }else if(age>=60){

            m -=0.4;

        }else{

            m +=0;

        }

        if(pd>60){

            m -=0.2;

        }else if(pd<20){

            m +=0.2;

        }else {

            m +=0;
        }

        if(cb.equals("Y")){

            m +=0.2;

        }else{

            m +=0;

        }

        m = Math.round(m*100);

        m /= 100;

        pf=p*m;

        System.out.println("reduction :"+m);

        if(m<1){
       
            System.out.println("Vous avez droit à une réduction : vous allez payer "+ Math.round(m*100)+"% du prix initial de votre billet");

         } else if(m>1){

            System.out.println("Vous avez une augmentation : vous aler payer "+ Math.round(m*100)+"% du prix initial de votre billet" );
        
        }else{

            System.out.println("Vous n'avez pas d'augmentation sur le cout de votre billet");
        }

        System.out.println("le prix de votre vol est de : "+pf+" euros !");

        clavier.close();

        



    }
}
        




/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/


