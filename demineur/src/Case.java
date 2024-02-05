import java.awt.*;

public class Case {
    private EtatCase[] desEtatCase = new EtatCase[9*9] ;
    private Point Coordonnees;
    public Case(Point Coordonnees){
        this.Coordonnees.setX(0);
        this.Coordonnees.setY(0);
        this.desEtatCase.add(new EtatCouverte());

    }
    public void marquer(){
    

    }
    public void decouvrir(){


    }
    public void devoiler()
    {

    }
    public void setEtatCourant(etatCase e){

    }
    public void Afficher(){

    }

    public etatCase getEtatCourant(){

    }

    public ArrayList<Case> getVoisines(){

    }

    public void ajouterVoisine(Case c){

    }



}
