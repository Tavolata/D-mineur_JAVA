public class CaseVide extends Case {
    public void devoiler(){
        Partie.testerSiGagne();
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                voisines.decouvrir()[i][j];
            }
        }
    }
    public void afficher(){
        System.out.println(" ");
    }
}
