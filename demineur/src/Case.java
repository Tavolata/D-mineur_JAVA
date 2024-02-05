import java.awt.*;

public class Case {
    private EtatCase desEtatCase;
    private Point Coordonnees;
    public Case(Point Coordonnees){
        this.Coordonnees.setX(0);
        this.Coordonnees.setY(0);
        this.desEtatCase.setEtatCourant(0);

    }
    public void marquer(){
    

    }
    public void decouvrir(){


    }
    public void devoiler()
    {

    }
    public void setEtatCourant(int e){
        desEtatCase.etat=e;

    }
    public void Afficher(){

    }

    public int getEtatCourant(){

        return desEtatCase.etat;

    }

    public ArrayList<Case> getVoisines(){

    }

    public void ajouterVoisine(Case c){

    }



}
