import java.util.Scanner;
public class Exo01_3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        double a;
        double r;
        double pi=3.14;

                
        System.out.println("Lire le rayon R d'un cercle et un angle A(en degré(s)).");
        System.out.print("rayon = ");r=clavier.nextDouble();
        System.out.print("Angle = ");a=clavier.nextDouble();
        System.out.println("L'aire du secteur circulaire = "+(pi*(r*r)*a)/360);


        
    }
    
}
