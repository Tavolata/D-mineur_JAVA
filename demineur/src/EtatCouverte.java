public class EtatCouverte extends EtatCase {
    public void decouvrir(Case c){
        c.devoiler();
    }
    public void marquer(Case c){
        c.setEtatCourant(c.getEtatCourant());
    }
}
