import java.awt.*;

public class Case {
    private EtatCase desEtatCase;
    private Point Coordonnees = new Point();


    public Case(){
        this.Coordonnees.setX(0);
        this.Coordonnees.setY(0);
        this.desEtatCase= new EtatCouverte();

    }
    public void marquer(){
        
        this.desEtatCase.marquer();
        System.out.println(this.getEtatCourant());
    }
    public void decouvrir(){
        this.desEtatCase.decouvrir();
        System.out.println(this.getEtatCourant());

    }

    public void setEtatCourant(EtatCase e){
        switch(e.getClass().getSimpleName()){
            case "EtatCouverte":
                this.desEtatCase = new EtatCouverte();
                break;
            case "EtatDecouverte":
                this.desEtatCase = new EtatDecouverte();
                break;
            case "EtatMarquee":
                this.desEtatCase = new EtatMarquee();
                break;

        }
        

    }
    public void Afficher(){
        System.out.println("Coordonnees : "+this.Coordonnees.getX()+" "+this.Coordonnees.getY());
        System.out.println("Etat : "+this.getEtatCourant());

    }

    public String getEtatCourant(){
        return desEtatCase.getClass().getSimpleName();

    }

    // public ArrayList<Case> getVoisines(){

    // }

    // public void ajouterVoisine(Case c){

     //}



}
