import java.awt.*;
import java.util.HashMap;


public class Plateau extends Partie{
    private HashMap<Point,Case> Coordonnees;
    private int largeur=9;
    private int hauteur=9;
    public Plateau(String niveau) {
        super(niveau);
    }

    @Override
    public boolean testerSiGagne(){
        boolean s= super.resultat;
        return(s);
    }
    @Override
    public void marquerCase(Point pt){
        super.marquerCase(pt);
    }
    @Override
    public void decouvrirCase(Point pt){
        super.decouvrirCase(pt);
    }
    @Override
    public void afficher(){
        super.afficher();

        for(int i=0;i<largeur;i++){
            for(int j=0;j<hauteur;j++){

            }
        }
    }
}
