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
    public int getBonusFor(){
        return bonusFor;
    }
    public int getBonusDex(){
        return bonusDex;
    }
    public int getBonusCon(){
        return bonusCon;
    }
    public int getBonusInt(){
        return bonusInt;
    }
    public int getBonusSag(){
        return bonusSag;
    }
    public int getBonusCha(){
        return bonusCha;
    }
    public int getStat(String stat){
        switch (stat){
            case "for":
                return getBonusFor();
            case "dex":
                return getBonusDex();
            case "con":
                return getBonusCon();
            case "int":
                return getBonusInt();
            case "sag":
                return getBonusSag();
            case "cha":
                return getBonusCha();
            default:
                return 0;
        }
    }
}