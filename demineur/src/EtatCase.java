import Exceptions.ExceptionCaseCouverte;
import Exceptions.ExceptionCaseMarquee;

public abstract class EtatCase{
    public abstract void decouvrir(Case c) throws ExceptionCaseCouverte;
    public abstract void marquer(Case c) throws ExceptionCaseCouverte, ExceptionCaseMarquee;
    
}