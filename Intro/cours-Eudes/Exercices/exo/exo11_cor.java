import java.util.Scanner;

public class exo11_cor {

    public static void main(String[] args) {
        
        int money = 3000;
        int retrait=0;
        int reste;
        Scanner clavier = new Scanner(System.in);

        while (money>0) {
            
         System.out.println("Combien voulez-vous retirer ? ");

            retrait = clavier.nextInt();
           
        reste = money- retrait;

        if (reste<0) {
            System.out.println("Opération impossible");
            System.out.println("Fonds insufisants!!!");
            
            }else{
                System.out.println("Veillez prendre votre argent");
                System.out.println("il vous reste "+reste+" Euros" );
                money = reste;
                if(reste<=0){System.out.println("Merci pour votre visite au revoir "); break;}

            }
        }
            clavier.close();

    }
}
