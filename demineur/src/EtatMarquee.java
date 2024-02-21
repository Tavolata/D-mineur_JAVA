import Exceptions.ExceptionCaseCouverte;
import Exceptions.ExceptionCaseMarquee;

public class EtatMarquee extends EtatCase {
    public void decouvrir(Case c){
        c.setEtatCourant(new EtatDecouverte());
        
    }
    public void marquer(Case c) throws ExceptionCaseCouverte, ExceptionCaseMarquee{
        throw new ExceptionCaseMarquee("Case déjà marquée");
    }
}
