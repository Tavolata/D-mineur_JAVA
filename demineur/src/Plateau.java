import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;


public class Plateau{
    private HashMap<Point,Case> Coordonnees;
    private int largeur=9;
    private int hauteur=9;

    private boolean resultat;
    private int nbMinesRestantes;

    public boolean testerSiGagne(){
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
                //Point pt;
                //pt.getX();
                //pt.getY();
            }
        }
        /*int coord;
        Scanner scan = new Scanner(System.in);
        System.out.println("debut de la partie");
        encours=true;
        while(isEncours()==true){
            System.out.println(niveau);
            System.out.println("\n");
            System.out.println("nombre de mines a encore decouvrir:");
            System.out.println(nbMinesRestantes);
            System.out.println("\n");
            //afficher le plateau
            System.out.println("\n");
            System.out.println("donne les coordonnees que tu veux decouvrir:");
            coord=scan.nextInt();
            //decouvrirCase(coord);
            //marquerCase(coord);
            //condition arret du jeu avec temps ecoule avec isencours==false et perdu
            if(resultat==true){
                encours=false;
                System.out.println("gagne");
            }
        }*/
    }
}
