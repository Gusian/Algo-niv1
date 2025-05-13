import java.util.Scanner;

public class JB2 {

    public static void main(String[]args){

        float accountA;
        float accountB;
        float ammount;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Combien d'argent possédez vous sur le compte A ?");
        accountA=clavier.nextFloat();


        System.out.println("Combien d'argent possédez vous sur le compte B ?");
        accountB=clavier.nextFloat();


        System.out.println("Combien d'argent voulez vous transférer sur le compte B ?");
        ammount=clavier.nextFloat();

        if(ammount<=accountA){

        accountA-=ammount;
        accountB+=ammount;

        System.out.println("Votre compte A dispose désormais de "+accountA+"euros");
        System.out.println("Votre compte B dispose désormais de "+accountB+"euros");

        }else{

            System.out.println("Le montant de votre transfert excède les capacités du compte A");

        }


        clavier.close();

    }
}

