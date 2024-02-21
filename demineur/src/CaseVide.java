import java.awt.*;
import java.util.ArrayList;

public class CaseVide extends Case {

    public CaseVide()
    {
        super();
    }

    public CaseVide(Point pt)
    {
        super(pt);
    }

    public void devoiler(){
        if(Plateau.testerSiGagne()==true){
            Partie.encours=false;
            Partie.resultat=true;
        }
        else{
            for(int i=0;i<=8;i++){
                m_voisines.get(i).decouvrir();
            }
        }
    }
    public void afficher(){
        System.out.println(" ");
    }
}
