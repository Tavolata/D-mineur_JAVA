import java.awt.*;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Plateau{
    private HashMap<Point,Case> Coordonnees;
    private int largeur=9;
    private int hauteur=9;
    Map<Point,Case> m_coord = new HashMap<>();
    private static int nbMinesRestantes;

    public static boolean testerSiGagne(){
        if(nbMinesRestantes==0){
            return(true);
        }
        else{
            return(false);
        }
    }
    public void marquerCase(Point pt){
        pt.getX();
        pt.getX();
    }
    public void decouvrirCase(Point pt){
        pt.getX();
        pt.getY();
    }
    public void afficher(){
        Scanner lectureClavier= new Scanner(System.in);
        int c;
        c=3;
        int x;
        int y;
        while(c!=0){
            System.out.println("Nb mines restantes:");
            System.out.println(nbMinesRestantes);
            for(int i=0;i<=largeur;i++){
                for(int j=0;j<=hauteur;j++) {
                    x=lectureClavier.nextInt();
                    y= lectureClavier.nextInt();
                    Point p=new Point(x,y);
                    p.getX();
                    p.getY();
                }
                System.out.println("\n");
            }
            System.out.println("1- Marquer une case");
            System.out.println("2- Decouvrir une case");
            System.out.println("0- Quitter");
            if(c==1) {
                System.out.println("Saisissez les coordonnees de la case");
                x=lectureClavier.nextInt();
                y= lectureClavier.nextInt();
                Point p= new Point(x,y);
                marquerCase(p);
            }
            if(c==2) {
                System.out.println("Saisissez les coordonnees de la case");
                //CaseNumerotee.afficher();
                x=lectureClavier.nextInt();
                y= lectureClavier.nextInt();
                Point p=new Point(x,y);
                decouvrirCase(p);
            }
        }
    }
}