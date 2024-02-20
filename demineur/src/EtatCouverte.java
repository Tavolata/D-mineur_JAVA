public class EtatCouverte extends EtatCase {
    public static void decouvrir(Case c){
        c.setEtatCourant(new EtatDecouverte());
    }
    public static void marquer(Case c){
        c.setEtatCourant(new EtatMarquee()); 
    }
}
