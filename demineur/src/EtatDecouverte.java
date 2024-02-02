public class EtatDecouverte extends EtatCase {
    public void decouvrir(Case c){
        c.getEtatCourant();
    }
    public void marquer(Case c){
        c.setEtatCourant(c.getEtatCourant());
    }
}
