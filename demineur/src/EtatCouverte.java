public class EtatCouverte {
    public void decouvrir(Case c){
        c.devoiler();
    }
    public void marquer(Case c){
        c.setEtatCourant(c.getEtatCourant());
    }
}
