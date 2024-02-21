import java.awt.*;
public class CaseNumerotee extends Case {
    private int NbVoisinesMinees=1;

    public CaseNumerotee(Point pt)
    {
        super();
    }


    public void devoiler(){
        Partie.getInstance().testerSiGagne();
    }
    public void afficher()
    {
        if (getEtatCourant() instanceof EtatCouverte) {
            System.out.print("*");
        }
        else if (this.getEtatCourant() instanceof EtatDecouverte) {
            System.out.print(NbVoisinesMinees);
        }
        else if (this.getEtatCourant() instanceof EtatMarquee) {
            System.out.print("D");
        }
    }
    public void incNbVoisinesMinees(){
        this.NbVoisinesMinees=NbVoisinesMinees+1;
    }
}
