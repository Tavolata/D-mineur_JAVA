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
            for (Case c  : m_voisines)
            {
                if (c.getEtatCourant() instanceof EtatCouverte)
                {
                    c.decouvrir();
                }
            }
        }
    }
    public void afficher(){
        //System.out.print("*");
        if (this.getEtatCourant() instanceof EtatCouverte) {
            System.out.print("*");
        }
        else if (this.getEtatCourant() instanceof EtatDecouverte) {
            System.out.print(" ");
        }
        else if (this.getEtatCourant() instanceof EtatMarquee) {
            System.out.print("M");
        }
    }
}
