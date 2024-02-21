import Exceptions.ExceptionCaseCouverte;
import Exceptions.ExceptionCaseMarquee;

import java.awt.Point;
import java.util.Scanner;

public class Partie {
    protected Plateau unPlateau;
    protected static Partie uniqueInstance;
    protected int nbMinesInitial=10;
    protected int nbMinesRestantes;
    protected String niveau="Débutant";
    protected boolean encours;
    protected boolean resultat;

    private Partie(String niveau)
    {
        this.niveau= niveau;
        unPlateau = new Plateau(9,9,10);
    }

    public static Partie setInstance(String niveau){
        if(uniqueInstance==null){
            uniqueInstance=new Partie(niveau);
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
    public void marquerCase(Point pt) throws ExceptionCaseCouverte, ExceptionCaseMarquee {
        unPlateau.marquerCase(pt);
    }
    public void decouvrirCase(Point pt) throws ExceptionCaseCouverte {
        unPlateau.decouvrirCase(pt);
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
            encours=false;
        }
    }
    public void testerSiGagne(){
        resultat=unPlateau.testerSiGagne();
    }
    public void afficher()  throws ExceptionCaseCouverte, ExceptionCaseMarquee {
        Scanner lectureClavier= new Scanner(System.in);
        int c;
        int x;
        int y;
        System.out.println("Nb mines restantes:");
        System.out.println(nbMinesRestantes);
        unPlateau.afficher();
        System.out.println("1- Marquer une case");
        System.out.println("2- Decouvrir une case");
        System.out.println("0- Quitter");
        c=lectureClavier.nextInt();
        System.out.println("Saisissez les coordonnees de la case");
        x=lectureClavier.nextInt();
        y= lectureClavier.nextInt();
        Point p= new Point(x,y);
        switch(c){
            case 1: marquerCase(p);
                System.out.println("Nb mines restantes:");
                System.out.println(nbMinesRestantes);
                unPlateau.afficher();
                System.out.println("1- Marquer une case");
                System.out.println("2- Decouvrir une case");
                System.out.println("0- Quitter");
                c=lectureClavier.nextInt();
                System.out.println("Saisissez les coordonnees de la case");
                x=lectureClavier.nextInt();
                y= lectureClavier.nextInt();
                p= new Point(x,y);
                break;
            case 2:
                decouvrirCase(p);
                System.out.println("Nb mines restantes:");
                System.out.println(nbMinesRestantes);
                unPlateau.afficher();
                System.out.println("1- Marquer une case");
                System.out.println("2- Decouvrir une case");
                System.out.println("0- Quitter");
                c=lectureClavier.nextInt();
                System.out.println("Saisissez les coordonnees de la case");
                x=lectureClavier.nextInt();
                y= lectureClavier.nextInt();
                p= new Point(x,y);
                break;
        }while(c!=0);
    }
}
