import java.awt.*;
import java.util.Scanner;

public class Partie {
    private Partie uniqueInstance;
    private int nbMinesInitial=10;
    protected int nbMinesRestantes;
    private String niveau="Débutant";
    private boolean encours;
    private boolean resultat;

    public Partie(String niveau) {
        this.niveau=niveau;
    }
    public Partie(Partie tete){
        niveau= tete.niveau;
    }

    public Partie setInstance(String niveau){
        if(uniqueInstance==null){
            uniqueInstance=new Partie(niveau);
        }
        return uniqueInstance;
    }
    public Partie getInstance(){
        return uniqueInstance;
    }

    public int getNbMinesRestantes() {
        return nbMinesRestantes;
    }
    public int getNbMinesInitial(){
        return nbMinesInitial;
    }

    public String getNiveau() {
        return niveau;
    }

    public boolean isResultat() {
        return resultat;
    }

    public boolean isEncours() {
        return encours;
    }
    public void marquerCase(Point pt){
        //tester avec plateau
    }
    public void decouvrirCase(Point pt){
        //tester avec plateau
    }
    public void decrNbMines(){
        nbMinesRestantes=nbMinesRestantes-1;
    }
    public void incrNbMines(){
        nbMinesRestantes=nbMinesRestantes+1;
    }
    public void perdre(){
        if(getNbMinesRestantes()!=0){
            resultat=false;
        }
    }
    public void testerSiGagne(){
        if(getNbMinesRestantes()==0){
            resultat=true;
        }
        else{
            resultat=false;
        }
    }
    public void afficher(){
        int coord;
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
        }
    }
}
