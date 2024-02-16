public class CaseNumerotee extends Case {
    private int NbVoisinesMinees=0;
    public void devoiler(){
        Partie.testerSiGagne();
    }
    public void afficher(){
        System.out.println(NbVoisinesMinees);
    }
    public void incNbVoisinesMinees(){
        this.NbVoisinesMinees=NbVoisinesMinees+1;
    }
}
