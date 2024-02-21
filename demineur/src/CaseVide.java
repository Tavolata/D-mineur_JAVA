import java.awt.*;
import java.util.ArrayList;
@SuppressWarnings("unused")
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
        Partie.getInstance().testerSiGagne();
        if (Partie.getInstance().isEncours())
        {
            for(int i=0;i<=8;i++){
                m_voisines.get(i).decouvrir();
            }
        }
    }
    public void afficher(){
        //System.out.print("*");
        if (getEtatCourant() instanceof EtatCouverte) {
            System.out.print("*");
        }
        else if (this.getEtatCourant() instanceof EtatDecouverte) {
            System.out.print(" ");
        }
        else if (this.getEtatCourant() instanceof EtatMarquee) {
            System.out.print("D");
        }
    }
}
