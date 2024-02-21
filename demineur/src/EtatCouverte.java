public class EtatCouverte extends EtatCase {
    public void decouvrir(Case c){
        c.setEtatCourant(new EtatDecouverte());
    }
    public void marquer(Case c){
        c.setEtatCourant(new EtatMarquee()); 
    }
}
