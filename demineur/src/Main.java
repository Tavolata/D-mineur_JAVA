import java.awt.*;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String niveau = "";
        Partie partie;
        int choix=0;

        System.out.println("Bienvenue dans notre jeu de démineur");
        System.out.println("Choisissez votre niveau de difficulté");
        System.out.println("1. Débutant | 2. Intermédiaire | 3. Expert");
        choix = sc.nextInt();
        while(choix != 1 && choix != 2 && choix != 3 && choix != 4)
        {

            System.out.println("Choix Invalide, veuillez choisir un niveau de difficulté valide");
            choix = sc.nextInt();
        }
        if(choix == 1)
        {
            niveau = "Débutant";
        }
        else if(choix == 2)
        {
            niveau = "Intermédiaire";
        }
        else if(choix == 3)
        {
            niveau = "Expert";
        }
        else if(choix == 4)
        {
            niveau = "debug";
        }
        partie=Partie.setInstance(niveau);
        partie.encours=true;
        while(Partie.getInstance().encours==true || choix == -1)

        {
            choix = partie.afficher();
            
        }
        if(Partie.getInstance().isResultat())
        {
            System.out.println("Vous avez gagné !");
        }
        else
        {
            System.out.println("Vous avez perdu !");
        }

        sc.close();

        //Pour changer affichage il faut juste aller dans CaseMinee et changer conditions, idem pour CaseMarquee

    }
}
    