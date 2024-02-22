import java.awt.*;
import java.util.ArrayList;

@SuppressWarnings("unused")
public abstract class Case {
    private EtatCase desEtatCase;
    protected Point Coordonnees = new Point();
    protected ArrayList<Case> m_voisines = new ArrayList<Case>();



    public Case(){
        this.desEtatCase = new EtatCouverte();
        this.Coordonnees.x=0;
        this.Coordonnees.y=0;
    }

    public Case(Point pt)
    {
        Coordonnees = pt;
        this.desEtatCase = new EtatCouverte();
    }

    public void marquer()
    {
    
        desEtatCase.marquer(this);
    }
    public void decouvrir()
    {
        desEtatCase.decouvrir(this);
    }

    public abstract void devoiler();

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
    public abstract void afficher();

    public EtatCase getEtatCourant(){
        return desEtatCase;

    }

    public ArrayList<Case> getVoisines(){
        return m_voisines;
    }

    public void ajouterVoisine(Case c){
        m_voisines.add(c);
    }

    public void incNbVoisinesMinees() {
        throw new UnsupportedOperationException("Unimplemented method 'incNbVoisinesMinees'");
    }


}
