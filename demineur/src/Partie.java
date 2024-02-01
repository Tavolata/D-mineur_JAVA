import java.awt.*;

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

    }
    public void decouvrirCase(Point pt){

    }
    public void decrNbMines(){
        nbMinesRestantes=nbMinesRestantes-1;
    }
    public void incrNbMines(){
        nbMinesRestantes=nbMinesRestantes+1;
    }
    public void perdre(){
        if(nbMinesRestantes!=0){
            resultat=false;
        }
    }
    public void testerSiGagne(){
        if(nbMinesRestantes==0){
            resultat=true;
            if(niveau=="Débutant"){
                niveau=""
            }
        }
    }
    public void afficher(){}
}
