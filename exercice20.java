import java.util.Scanner;

public class exercice20 {

    public static void main(String[]args) {

        int ji;
        int ve;
        int vb;

        Scanner clavier = new Scanner(System.in);

            System.out.println("Combien de gens on voté pour Joseline Inutile ?");

            ji=clavier.nextInt();

            
            System.out.println("Combien de gens on voté pour Vincent Escreau ?");

            ve=clavier.nextInt();

            vb=150000-(ji+ve);

            if(vb>=0){

                ji=ji*100/(150000-vb);

                ve=ve*100/(150000-vb);

                System.out.println("Vous avez "+vb+" d'abstentions, ils seront comptés nuls.");

                if(ve>=60){

                    System.out.println("Vincent Escreau est le nouveau maire de Mulhouse !");

                }else if(ji>=60){

                    System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse !");

                }else{


                    System.out.println("le/la gagnant(e) n'ayant pas atteint 60% des votes: un second tour sera organisé !");

                }

                    

                }else{

                    System.out.println("Erreur: Le nombre de votes excède celuis des votants");

                }

                clavier.close();

            }
    }



/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/


