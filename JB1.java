import java.util.Scanner;

public class JB1 {

    public static void main(String[]args){

        int age;

        Scanner clavier = new Scanner(System.in);

        System.out.println("Saisir votre âge : ");

        age=clavier.nextInt();

        if(age>=18){

            System.out.println("Vous êtes majeur");


        }else if(age<18&age>=0){

        System.out.println("Vous êtes mineur");

        }else{

            System.out.println("Vous n'êtes pas encore né");

            clavier.close();

        }

        

    }
}