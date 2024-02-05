public class EtatCouverte extends EtatCase {
    public void decouvrir(Case c){
        if (c.getEtatCourant() ==2 )
        
        
    }
    public void marquer(Case c){
        c.setEtatCourant(c.getEtatCourant());
    }
}
