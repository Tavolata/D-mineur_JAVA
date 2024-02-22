public class EtatMarquee extends EtatCase {
    public void decouvrir(Case c){
        
    }
    public void marquer(Case c) {

        c.setEtatCourant(new EtatCouverte());
        Partie.uniqueInstance.incrNbMines();
    }
}
