public class EtatCouverte extends EtatCase {
    public void decouvrir(Case c){
        c.setEtatCourant(new EtatDecouverte());
        c.devoiler();
    }
    public void marquer(Case c){
        c.setEtatCourant(new EtatMarquee());
        Partie.uniqueInstance.decrNbMines();
    }
}



