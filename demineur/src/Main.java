//test classes du démineur
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de la classe Case
        Case case1 = new Case();
        case1.Afficher();

        // Appel des méthodes de la classe Case
        case1.marquer();
        case1.marquer();
        case1.decouvrir();
    
        // Affichage de la valeur de la case
        case1.Afficher();
        case1.setEtatCourant(1);
        case1.Afficher();
        case1.setEtatCourant(2);
        case1.Afficher();
        
    }
}
    