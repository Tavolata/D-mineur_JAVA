import java.awt.*;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Plateau{
    private int largeur=9;
    private int hauteur=9;
    private int taille=largeur*hauteur;

    Map<Point,Case> Plat = new HashMap<>();
    public Plateau(int largeur, int hauteur){
        this.largeur=largeur;
        this.hauteur=hauteur;
        for (int i = 0; i < largeur; i++) {
            for (int j = 0; j < hauteur; j++) {
                Plat.put(new Point(i, j), new Case());
            }
        }
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
    public void afficher(Map<Point,Case> Plat){
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                Plat.get(new Point(j, i)).afficher();
            }
            
        }
    }
}
    