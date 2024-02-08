import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;


public class Plateau{
    private HashMap<Point,Case> Coordonnees;
    private int largeur=9;
    private int hauteur=9;

    private static boolean resultat;
    private static int nbMinesRestantes;

    public static boolean testerSiGagne(){
        if(nbMinesRestantes==0){
            resultat=true;
        }
        else{
            resultat=false;
        }
        return(resultat);
    }
    public void marquerCase(Point pt){
        pt.setX(1);
        pt.setY(1);
    }
    public void decouvrirCase(Point pt){
        pt.getX();
        pt.getY();
    }
    public void afficher(){

        for(int i=0;i<=largeur;i++){
            for(int j=0;j<=hauteur;j++){
                decouvrirCase(Coordonnees[i][j]);
            }
            System.out.println("\n");
        }
    }
}
