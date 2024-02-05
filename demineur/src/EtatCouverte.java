public class EtatCouverte extends EtatCase {
    public void decouvrir(Case c){
        if (c.getEtatCourant() == 0){
            c.setEtatCourant();
        }

        
    }
    public void marquer(Case c){
        c.setEtatCourant(c.getEtatCourant());
    }
}
