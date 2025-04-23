import java.util.Scanner;

public class si { 
    public static void main(String[]args) {
        int a;
        a=7;
        String somme;
        
        Scanner clavier = new Scanner(System.in) ;
        System.out.print("Entrer un nombre : ");
        int nombre = clavier.nextInt();
        System.out.println(nombre);
        if (nombre+a>10) {
            somme= "supérieur à dix";

        }else{

            somme= "inférieur à 10";
        }
        System.out.println(somme);

        clavier.close();
        

          /***    if (nombre+a>10) {
            somme= "supérieur à dix";
        }
        System.out.printl(somme);  System.out.println(nombre);
 ****/
 
    
    
    
    }
}    
