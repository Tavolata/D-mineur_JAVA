public class Chronometre {
    private Partie unePartie;
    private int temps;
    public Chronometre(Partie partie){
        this.unePartie=partie;
        this.temps=0;
    }
    public void start(){
        if(Partie.encours==true){
            temps = (int)System.currentTimeMillis();
        }
    }
    public void end(){
        if(Partie.encours==false){
            temps = (int)System.currentTimeMillis();
            System.out.println("Temps écoulé : " + temps + " millisecondes");
        }
    }
}
