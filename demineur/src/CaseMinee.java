import java.awt.*;
public class CaseMinee extends Case {
    public CaseMinee(){
        super();
    }
    public CaseMinee(Point pt){
        super(pt);
    }
    public void devoiler(){
        Partie.perdre();
    }
    public void afficher(){System.out.println("M");}
}
