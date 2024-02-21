import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Plateau{
    private int largeur=9;
    private int hauteur=9;
    private int nbMines=10;
    private int taille=largeur*hauteur;

    Map<Point,Case> Plat = new HashMap<>();
    public Plateau(int largeur, int hauteur, int nbMines){
        this.largeur=largeur;
        this.hauteur=hauteur;
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                Plat.put(new Point(i, j), new CaseVide(new Point(i,j)));
            }
        }

        // tirer un i et un j au hasard
        // regarder case(i,j) si case minee on recommence
        // sinon la case(i,j) devient une case minee
        // on regarde les cases voisines de la case(i,j)
        // on ne touche pas aux voisines de type case minee
        // une voisine de type case vide devient une case numerotee (initialisee a 1)
        // une case voisine numerotee doit être incrementee de 1


        for (int a = i-1; a <= i+1; a++ )
        {
            for (int b = j-1; b<= j+1; b++)
            {
                if((a>=0) && (a<hauteur) && (b>=0) && (b<largeur) && ((a!=i) || (b!=j)))  
                {
                    if (Plat.get(new Point(a, b)) instanceof CaseVide)
                    {
                        Plat.put(new Point(a, b), new CaseNumerotee(new Point(a, b)));
                    }
                    else if (Plat.get(new Point(a, b)) instanceof CaseNumerotee)
                    {
                        Plat.get(new Point(a, b)).incNbVoisinesMinees();
                    }
                }
            }
        }]
    }
    public int getTaille(){
        return taille;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    

    public static boolean testerSiGagne(){
        if(Partie.nbMinesRestantes==0){
            return(true);
        }
        else{
            return(false);
        }
    }
    // public void marquerCase(Point pt){
    //     if(Case.getEtatCourant()=EtatCouverte.marquer(this)){
    //         Partie.decrNbMines();
    //         Case.setEtatCourant(marquer);
    //     }
    //     if(Case.getEtatCourant()=EtatMarquee.marquer(this)){
    //         Partie.incrNbMines();
    //         Case.setEtatCourant(couverte);
    //     }
    // }
    // public void decouvrirCase(Point pt){
    //     if(Case.getEtatCourant()=EtatCouverte.decouvrir(this)){
    //         Partie.decrNbMines();
    //         Case.setEtatCourant(decouverte);
    //         Case.devoiler();
    //     }
    // }
    public void afficher(){
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                Plat.get(new Point(j, i)).afficher();
            }
            
        }
    }
}
    