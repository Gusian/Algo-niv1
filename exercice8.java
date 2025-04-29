import java.util.Scanner;

public class exercice8 {
    public static void main(String[]args) {
        String p;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrer votre prénom : ");
        p=clavier.next();
        String n;
        System.out.print("Entrer votre nom : ");
        n=clavier.next();
        String a;
        System.out.print("Entrer votre adresse mail : ");
        a=clavier.next();
        String mdp;
        System.out.print("Entrer un mot de passe : ");
        mdp=clavier.next();
        String cmdp;
        System.out.print("Confirmez votre mot de passe : ");
        cmdp=clavier.next();
        String m;
        


        if(mdp.equals(cmdp)) {
            m=("merci "+n+" "+p+" votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse :"+a);
        } else{
            m="inscription annulée";
        }
        System.out.println(m);
        clavier.close();
            

        }





    }







/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/