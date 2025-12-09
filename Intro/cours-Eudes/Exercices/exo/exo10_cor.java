package exo;

import java.util.Scanner;


public class exo10_cor {
    

    public static void main(String[] args) {
        
        boolean a;
        int score = 0;


        Scanner clavier = new Scanner(System.in);


    System.out.println("Question 1 : L'informatique a besoin des mathématiques ? (V/F)");
            a = clavier.nextBoolean();

    if (a == true) {
        ++score ;
        System.out.println("votre score " +score+" /5");
    } 
    else{
        System.out.println("Reponse fausse");

    }
    System.out.println("Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)");
    a = clavier.nextBoolean();

    if (a == false) {
        ++score;
        System.out.println("votre score "+score+" /5");
        
    }
    else{
        System.out.println("Reponse fausse");   
    }
    System.out.println("Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)");
    a = clavier.nextBoolean();

    if (a == false) {
        ++ score;
        System.out.println("votre score "+score+ " /5");
    }
    else{
        System.out.println("Reponse fausse");
    }
    System.out.println("Question 4 : Une table de vérité retourne l'expression algébrique (V/F)");
    a = clavier.nextBoolean();

    if (a == false) {
        ++score;
        System.out.println("votre score "+score+" /5");
    }
    else{
        System.out.println("Reponse fausse");
    }
    System.out.println("Question 5 : Git permet de stocker à distance son travail (V/F)");
    a = clavier.nextBoolean();

    if (a == true) {
        ++score;
        System.out.println("votre score "+score+" /5");
        
    }
    else{
        System.out.println("Reponse fausse");
    }
    System.out.println("Votre score final est de "+score+" /5");
    if (score>=3) {
        System.out.println("Félicitation");
        
    }
         else if (score<3&&score>=1) {
            System.out.println("Resulta moyen, vous ferez mieux la prochaine fois");
            
         }
         else {
            System.out.println("Nul, recaler!!!");

        
    }
    clavier.close();



    }
}
