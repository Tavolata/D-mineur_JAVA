public class CaseNumerotee extends Case {
    private int NbVoisinesMinees;
    public Case(Point Coordonnees){
        super(Coordonnees);
    }
    public void devoiler(){
    }
    public void afficher(){
        System.out.println("la case numéroté est:");
    }
    public void NbVoisinesMinees(){
        this.NbVoisinesMinees=NbVoisinesMinees+1;
    }
}
