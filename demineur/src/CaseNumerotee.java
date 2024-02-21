import java.awt.*;
public class CaseNumerotee extends Case {
    private int NbVoisinesMinees=1;

    public CaseNumerotee(Point pt)
    {
        super();
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
        System.out.print(NbVoisinesMinees);
    }
    public void incNbVoisinesMinees(){
        this.NbVoisinesMinees=NbVoisinesMinees+1;
    }
}
