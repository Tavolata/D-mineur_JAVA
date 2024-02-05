public class EtatCouverte extends EtatCase {
    public void decouvrir(Case c){
        if (c.getEtatCourant() == 0 && c.getEtatCourant()==1){
            c.setEtatCourant(2);
        }
        else if (c.getEtatCourant() == 2){
            Exception e = new Exception("Case déjà découverte");
        }
    }
    public void marquer(Case c){
        if (c.getEtatCourant() == 0){
            c.setEtatCourant(1);
        }
        else if (c.getEtatCourant() == 1){
            c.setEtatCourant(0);
        }
    }
}
