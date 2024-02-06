import java.awt.*;

public class Case {
    private EtatCase desEtatCase = new EtatCase();
    private Point Coordonnees = new Point();
    public Case(){
        this.Coordonnees.setX(0);
        this.Coordonnees.setY(0);
        this.desEtatCase.setEtatCourant(0);

    }
    public void marquer(){
        this.desEtatCase.marquer();
        System.out.println(this.desEtatCase.etat);
    }
    public void decouvrir(){
        this.desEtatCase.decouvrir();
        System.out.println(this.desEtatCase.etat);

    }

    public void setEtatCourant(int e){
        desEtatCase.etat=e;

    }
    public void Afficher(){
        System.out.println("Coordonnees : "+this.Coordonnees.getX()+" "+this.Coordonnees.getY());
        System.out.println("Etat : "+this.desEtatCase.etat);

    }

    // public int getEtatCourant(){

    //     return desEtatCase.etat;

    // }

    // public ArrayList<Case> getVoisines(){

    // }

    // public void ajouterVoisine(Case c){

     //}



}
