import java.awt.*;

public class CaseNumerotee extends Case {
    private int NbVoisinesMinees=0;
    public CaseNumerotee(){
        super();
    }
    public CaseNumerotee(Point pt){
        super(pt);
    }
    public void devoiler(){
        if(Partie.resultat=true){
            Partie.testerSiGagne();
        }
        else{
            for(int i=0; i<=NbVoisinesMinees;i++){
                m_voisines.get(i).decouvrir();
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
