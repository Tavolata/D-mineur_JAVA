import java.awt.Point;

public class Partie {
    private static Plateau unPlateau;
    protected static Partie uniqueInstance;
    protected int nbMinesInitial=10;
    protected static int nbMinesRestantes;
    protected String niveau="Débutant";
    protected static boolean encours;
    protected static boolean resultat;

    private Partie() {
        this.niveau=niveau;
    }
    private Partie(Partie tete){
        niveau= tete.niveau;
    }

    public static Partie setInstance(String niveau){
        if(uniqueInstance==null){
            uniqueInstance=new Partie();
        }
        return uniqueInstance;
    }
    public static Partie getInstance(){
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
        unPlateau.marquerCase(pt);
    }
    public void decouvrirCase(Point pt){
        unPlateau.decouvrirCase(pt);
    }
    public void decrNbMines(){
        nbMinesRestantes=nbMinesRestantes-1;
    }
    public void incrNbMines(){
        nbMinesRestantes=nbMinesRestantes+1;
    }
    public static void perdre(){
        if(nbMinesRestantes!=0){
            resultat=false;
            encours=false;
        }
    }
    public static void testerSiGagne(){
        resultat=unPlateau.testerSiGagne();
    }
    public void afficher(){
        unPlateau.afficher();
    }
}
