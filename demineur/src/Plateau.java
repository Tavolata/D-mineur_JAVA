import java.awt.*;

public class Plateau extends Partie{
    private HashMap<Coordonnees,Case> desCase;
    private int largeur=9;
    private int hauteur=9;

    public Plateau(String niveau) {
        super(niveau);
    }

    public boolean testerSiGagne(){
        return(Partie.resultat);
    }
    public void marquerCase(Point pt){

    }
    public void decouvrirCase(Point pt){

    }
    public void afficher(){

    }
}
