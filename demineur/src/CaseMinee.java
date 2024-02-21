import java.awt.*;
@SuppressWarnings("unused")
public class CaseMinee extends Case {

    public CaseMinee(Point pt)
    {
        super(pt);
    }
    public void devoiler(){
        Partie.perdre();
    }
    public void afficher()
    {
        System.out.print("M");
    }
}
