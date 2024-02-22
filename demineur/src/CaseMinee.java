import java.awt.*;
@SuppressWarnings("unused")
public class CaseMinee extends Case {

    public CaseMinee(Point pt)
    {
        super(pt);
    }
    public void devoiler(){
        Partie.getInstance().perdre();
    }
    
    public void afficher()
    {
        //System.out.print("M");
        if (this.getEtatCourant() instanceof EtatCouverte) {
            System.out.print("B");
        }
        else if (this.getEtatCourant() instanceof EtatDecouverte) {
            System.out.print("B");
        }
        else if (this.getEtatCourant() instanceof EtatMarquee) {
            System.out.print("M");
        }
    }
}
