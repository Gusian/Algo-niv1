import java.util.Scanner;

public class exercice10 {
    public static void main(String[]args) {
        String q1;
        int r1;
        String q2;
        int r2;
        String q3;
        int r3;
        String q4;
        int r4;
        String q5;
        int r5;
        Scanner clavier = new Scanner(System.in);
        System.out.print("La capital de la France est Paris (V/F)");
        q1=clavier.next();
        if(q1.equals("V")){
            r1=1;
        }else{
            r1=0;
        }
        System.out.print("la tomate est un fruit (V/F)");
        q2=clavier.next();
        if(q2.equals("V")||q2.equals("F")){
            r2=1;
        }else{
            r2=0;  
        }
        System.out.print("pluton est une planette (V/F)");
        q3=clavier.next();
        if(q3.equals("F")){
            r3=1;
        }else{
            r3=0;
    }
    System.out.print("Je sais coder (V/F)");
        q4=clavier.next();
        if(q4.equals("V")){
            r4=1;
        }else{
            r4=0;
        }
        System.out.print("J'aime le code (V/F)");
        q5=clavier.next();
        if(q5.equals("V")){
            r5=1;
        }else{
            r5=0;
        }
        int s;
        s=r1+r2+r3+r4+r5;
        System.out.print("votre résultat est de "+s);
        clavier.close();
        


}
}





/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * 
*/