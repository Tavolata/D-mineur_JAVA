public class CaseMinee extends Case {
    public Case(Point Coordonnees){
        super(Coordonnees);
    }
    public void devoiler(){
        Partie.perdre();
    }
    public void afficher(){
        System.out.println("M");
    }
}
