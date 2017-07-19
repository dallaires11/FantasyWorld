package Model;

import Controller.CalculStat;

public class Profile {
    private int force,modFor,Dexterite,modDex,constitution,modCon,intelligence,modInt,sagesse,modSag,charisme,modCha;
    private String nom,age,corpulence,couleur_yeux,couleur_cheveux,divinite,gender;

    public void setForce(int force) {
        this.force = force;
        modFor= CalculStat.getMod(force);
    }

    public void setDexterite(int dexterite) {
        Dexterite = dexterite;
        modDex= CalculStat.getMod(dexterite);
    }

    public void setConstitution(int modCon) {
        this.modCon = modCon;
        modCon= CalculStat.getMod(constitution);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        modInt= CalculStat.getMod(intelligence);
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
        modSag= CalculStat.getMod(sagesse);
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
        modCha= CalculStat.getMod(charisme);
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCorpulence(String corpulence) {
        this.corpulence = corpulence;
    }

    public void setDivinite(String divinite) {
        this.divinite = divinite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCouleur_cheveux(String couleur_cheveux) {
        this.couleur_cheveux = couleur_cheveux;
    }

    public void setCouleur_yeux(String couleur_yeux) {
        this.couleur_yeux = couleur_yeux;
    }
}