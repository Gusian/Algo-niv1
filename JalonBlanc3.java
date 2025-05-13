import java.util.Scanner;

public class JalonBlanc3 {

    public static void main(String[]args){

        float prixHT;
        float prixTVA;
        float TVA;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Quel est le prix hors taxe de votre produit ?");
        prixHT=clavier.nextFloat();

        System.out.println("Quel est le montant de la TVA ?(en pourcentage)");
        TVA=clavier.nextFloat();

        prixTVA=prixHT*(1+TVA/100);

        prixTVA=Math.round(prixTVA*100);
        prixTVA/=100;

        System.out.println("Le prix de votre produit après TVA est de "+prixTVA+"euros");

        clavier.close();

    }
}

