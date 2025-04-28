import java.util.Scanner;

public class si { 
    public static void main(String[]args) {
        int a;
        int nombre ;
        int somme;
        String message; 
        
        Scanner clavier = new Scanner(System.in) ;
        System.out.print("Entrer un nombre : ");
       a= clavier.nextInt();
       System.out.print("Entrer un second nombre");
       nombre= clavier.nextInt();
        somme= nombre+a;
        if (somme>10) {
            message= "supérieur à dix";

        }else{

            message= "inférieur ou égal à 10";
        }
        System.out.println("la somme est : "+somme); System.out.println(message);
            clavier.close();

   
    
    
    
    }
}    
