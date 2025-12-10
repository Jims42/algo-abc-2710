

import java.util.Scanner;

public class exo02_cor {

    public static void main(String[] args) {
        
        int a;
        int b;
        int soustraction;
        
        Scanner clavier = new Scanner(System.in);

        System.out.println("valeur de a");
        a = clavier.nextInt();
        System.out.println("valeur de b");
        b = clavier.nextInt();

        soustraction = a-b;

        System.out.println("a-b=" +soustraction);

        if (soustraction<00) {
            System.out.println("le resultat est inferieure a 00");
         } else if (soustraction==00) {
            System.out.println("le resultat est egal a 00");
         }
         else{
            System.out.println("lz rzsultat est superieur a 00");
         }

                
            
        clavier.close();


        
        

    }
    
}
