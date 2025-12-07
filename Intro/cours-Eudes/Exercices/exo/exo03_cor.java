package exo;

import java.util.Scanner;


public class exo03_cor {

    



    public static void main(String[] args) {
        
        int a;
        int b;
        int division;

        Scanner clavier = new Scanner(System.in);

        System.out.println("valeur de a");

        a = clavier.nextInt();

        System.out.println("valeur de b");
        b = clavier.nextInt();

        division = a / b;

        System.out.println("resultat a/b=" +division);

        if (division%2 == 0) {
            System.out.println(division+"valeur est pair");

        }else{
            System.out.println(division+"valeur est impair");

        }
        clavier.close();

    }
}





