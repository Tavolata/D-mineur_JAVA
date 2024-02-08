import Exceptions.ExceptionCaseCouverte;

public abstract class EtatCase{
    public abstract void decouvrir(Case c) throws ExceptionCaseCouverte;
    public abstract void marquer(Case c);
    
}