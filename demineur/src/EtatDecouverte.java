import Exceptions.ExceptionCaseCouverte;

public class EtatDecouverte extends EtatCase {

    public EtatDecouverte() {
    }

    public void decouvrir(Case c) throws ExceptionCaseCouverte
    {
        throw new ExceptionCaseCouverte("Case déjà découverte");
    }
    
    public void marquer(Case c) throws ExceptionCaseCouverte{
        throw new ExceptionCaseCouverte("Case déjà découverte");
    }
    
}
