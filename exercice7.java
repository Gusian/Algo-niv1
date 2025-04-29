import java.util.Scanner;

public class exercice7 {
    public static void main(String[]args) {
        System.out.println("Do you speak english(Y/N)?");
        String r;
        Scanner clavier = new Scanner(System.in);
        r=clavier.next();
        String m;
        if(r=="Y") {
            m="Nice to meet you";
        }else if(r=="N") {
            m="So learn english !";
        }else{
            m="réponse invalide";
        }
        System.out.println(m);
        clavier.close();  

        }


 
 
    }

/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/