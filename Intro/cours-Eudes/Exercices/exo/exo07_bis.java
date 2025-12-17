import java.util.Scanner;

public class exo07_bis {
    public static void main(String[] args) {
        
        int erreur=0;

        Scanner clavier = new Scanner(System.in);
        while (erreur<3) {
            
        
        System.out.println("Do you speak english (YES/NO) ? ");
        String choix=clavier.nextLine().toUpperCase();

       if (choix.equals("YES")) {System.out.println("Nice to meet you");}
       
         else if(choix.equals("NO")){ System.out.println("So learn english !");}

        else if(!choix.equals("YES")||(!choix.equals("NO"))) {System.out.println("Veillez repondre par YES ou NO");
            ++erreur;}
            if (erreur >=3) {System.out.println("Vous avez dépasser le nombre d'essai limité à 3");
            System.out.println("Good by !!!");
                
            }
        }
        clavier.close();

    }
    }
    

