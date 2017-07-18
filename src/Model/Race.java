package Model;

public class Race {
    private String nom,description,langues;
    private char taille;
    private int bonusFor,bonusDex,bonusCon,bonusInt,bonusSag,bonusCha,vitesse;

    public Race(String nom,String descript,int bFor,int bDex,int bCon,int bInt,int bSag,int bCha,int vit,char taille,
                String langues){
        this.nom=nom;
        description=descript;
        bonusFor=bFor;
        bonusDex=bDex;
        bonusCon=bCon;
        bonusInt=bInt;
        bonusSag=bSag;
        bonusCha=bCha;
        vitesse=vit;
        this.taille=taille;
        this.langues = langues;
    }

    public String getNom(){
        return nom;
    }

    public String getDescription(){
        return description;
    }
}