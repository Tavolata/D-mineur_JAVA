public class CaseMinee extends Case {
    public CaseMinee(Point Coordonnees) {
        super(Coordonnees);
    }
    public void devoiler(){
        Partie.perdre();
    }
    public void afficher(){
        System.out.println("M");
    }
}
