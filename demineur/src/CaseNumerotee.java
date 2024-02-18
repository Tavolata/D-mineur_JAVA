public class CaseNumerotee extends Case {
    private int NbVoisinesMinees=0;
    public void devoiler(){
        if(Partie.testerSiGagne()==false){
            if(Case.Coordonnees(i)(j)==0){
                NbVoisinesMinees=NbVoisinesMinees+1;
            }
        }
    }
    public void afficher(){
        System.out.println(NbVoisinesMinees);
    }
    public void incNbVoisinesMinees(){
        this.NbVoisinesMinees=NbVoisinesMinees+1;
    }
}
