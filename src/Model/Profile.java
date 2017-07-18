package Model;

public class Profile {
    private int force,modFor,Dexterite,modDex,constitution,modCon,intelligence,modInt,sagesse,modSag,charisme,modCha;
    private String nom,age,corpulence,couleur_yeux,couleur_cheveux,divinite,gender;

    public void setForce(int force) {
        this.force = force;
        modFor=Charactéristique.getMod(force);
    }

    public void setDexterite(int dexterite) {
        Dexterite = dexterite;
        modDex=Charactéristique.getMod(dexterite);
    }

    public void setConstitution(int modCon) {
        this.modCon = modCon;
        modCon=Charactéristique.getMod(constitution);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        modInt=Charactéristique.getMod(intelligence);
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
        modSag=Charactéristique.getMod(sagesse);
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
        modCha=Charactéristique.getMod(charisme);
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