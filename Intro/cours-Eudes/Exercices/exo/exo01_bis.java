import java.util.Scanner;
public class exo01_bis {
    public static void main(String[] args) {
        
        int a;
        int b;
        int resultat;

        Scanner clavier = new Scanner(System.in);
       
        System.out.print("A= "); a=clavier.nextInt();
         System.out.print("B= ");b=clavier.nextInt();
        resultat= a+b;
        System.out.println("Resultat = "+resultat);
        clavier.close();

    }
    
}
