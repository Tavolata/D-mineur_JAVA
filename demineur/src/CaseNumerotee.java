public class CaseNumerotee extends Case {
    private int NbVoisinesMinees;
    public void devoiler(){
        Partie.testerSiGagne();
    }
    public void afficher(){
        System.out.println("la case numéroté est:");
    }
    public void NbVoisinesMinees(){
        this.NbVoisinesMinees=NbVoisinesMinees+1;
    }
}
