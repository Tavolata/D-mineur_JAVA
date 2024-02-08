import java.awt.*;
import java.util.Scanner;

public class Partie {
    private Plateau unPlateau;
    protected Partie uniqueInstance;
    protected int nbMinesInitial=10;
    protected int nbMinesRestantes;
    protected String niveau="Débutant";
    protected boolean encours;
    protected boolean resultat;

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
        unPlateau.marquerCase(pt);
    }
    public void decouvrirCase(Point pt){
        //tester avec plateau
        unPlateau.decouvrirCase(pt);
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
        unPlateau.testerSiGagne();
    }
    public void afficher(){
        unPlateau.afficher();
    }
}
