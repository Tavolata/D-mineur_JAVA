import java.awt.*;

public class CaseMinee extends Case {
    public void devoiler(){
        if(Partie.perdre()!=false){
            Partie.resultat=true;
            Partie.encours=true;
        }
        else{
            Partie.resultat=false;
            Partie.encours=false;
        }
    }
    public void afficher(){System.out.println("M");}
}
