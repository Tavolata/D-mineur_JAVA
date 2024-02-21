import java.awt.*;
import java.util.ArrayList;

import Exceptions.ExceptionCaseCouverte;
import Exceptions.ExceptionCaseMarquee;

@SuppressWarnings("unused")
public class Case {
    private EtatCase desEtatCase;
    protected Point Coordonnees = new Point();
    ArrayList<Case> m_voisines;



    public Case(){
        this.Coordonnees.setX(0);
        this.Coordonnees.setY(0);
        this.desEtatCase= new EtatCouverte();

    }
    public void marquer(){
        try {
            desEtatCase.marquer(this);
        } catch (ExceptionCaseCouverte e) { 
            e.printStackTrace();
        } catch (ExceptionCaseMarquee e) {
            e.printStackTrace();
        }
        }
    public void decouvrir(){
        try {
            desEtatCase.decouvrir(this);
        } catch (ExceptionCaseCouverte e) {
            
            e.printStackTrace();
        }
        

    }

    public void devoiler(){}

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
    public void afficher(){
        System.out.println("Coordonnees : "+this.Coordonnees.getX()+" "+this.Coordonnees.getY());
        System.out.println("Etat : "+this.getEtatCourant());

    }

    public static String getEtatCourant(){
        return desEtatCase.getClass().getSimpleName();

    }

    public ArrayList<Case> getVoisines(){
        return m_voisines;
    }

    public void ajouterVoisine(Case c){
        m_voisines.add(c);
    }


}
