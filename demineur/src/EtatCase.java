public class EtatCase{
    public int etat=0; // couverte par défaut car toutes les cases sont couverte au début
    // 0 = case couverte | 1 case marquee | 2 case decouverte
    public void marquer(){
        if(etat==0){
            setEtatCourant(1);
        }
        else if(etat==1){
            setEtatCourant(0);
        }
        
    }
    public void decouvrir(){
        if(etat==0){
            setEtatCourant(2);
        }
        else if(etat==1){
            setEtatCourant(2);
        }
    }
    public int getEtatCourant(){
        return etat;
    }
    public void setEtatCourant(int e){
        etat=e;
    }

}