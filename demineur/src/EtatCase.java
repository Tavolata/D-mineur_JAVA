import Exceptions.ExceptionCaseCouverte;
import Exceptions.ExceptionCaseMarquee;
public abstract class EtatCase{
    public static void decouvrir(Case c) throws ExceptionCaseCouverte {
    }

    public static void marquer(Case c) throws ExceptionCaseCouverte, ExceptionCaseMarquee {
    }

}