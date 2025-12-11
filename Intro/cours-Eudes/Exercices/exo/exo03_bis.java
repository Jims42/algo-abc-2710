import java.util.Scanner;
public class exo03_bis {

    public static void main(String[] args) {
        
        int a;int b;int resulat;

        Scanner clavier = new Scanner(System.in);

        System.out.print("A = ");a=clavier.nextInt();
        System.out.print("B = ");b=clavier.nextInt();
        resulat=a+b;

        if (resulat%2==0) {System.out.println("resultat est PAIR");    
        }else{System.out.println("resultat est IMPAIR");}
        clavier.close();
    }
    
}
