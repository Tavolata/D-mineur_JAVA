public class CaseNumerotee extends Case {
    private int NbVoisinesMinees=0;
    public void devoiler(){
        if(Partie.testerSiGagne()==false){
            for(int i=0; i<=9;i++){
                NbVoisinesMinees=Coordonnees.getVoisines(i)+NbVoisinesMinees;
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
