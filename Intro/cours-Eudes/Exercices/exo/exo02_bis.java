import java.util.Scanner;
public class exo02_bis {

    public static void main(String[] args) {
        
        int a;int b;int resulat;

        Scanner clavier =new Scanner(System.in);

        System.out.print("A = ");a=clavier.nextInt();
        System.out.print("B = ");b=clavier.nextInt();
        resulat=a-b;
        System.out.println("Resultat = "+resulat);

        if (resulat<0) {System.out.println("Resultat inferieure a 0");
        }else if (resulat>0) {System.out.println("resultat superieure a 0");    
        }else{System.out.println("resultat est egal a 0");}
    clavier.close();
    }

    
}
