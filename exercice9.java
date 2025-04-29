import java.util.Scanner;

public class exercice9 {
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
        String coa;
        if(mdp.equals(cmdp)) {
            coa="Pour vous connecter, renseignez votre email :";
        }else{
            coa="";
        }

        System.out.println(coa);
        System.out.print("");
        String va;
        va=clavier.next();
        String cva;
        String vmdp;
        if(va.equals(a)){
            cva="Renseignez votre mot de passe : ";
            /*System.out.print("");
            vmdp=clavier.next();*/ 
        }else{
            cva="adresse incorrecte";
        }
        System.out.println(cva);

        
        clavier.close();
            

        }
    }





/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
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
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/