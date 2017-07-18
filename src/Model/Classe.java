package Model;

public class Classe {
    private String nom,description;
    private  int dVie;

    public Classe(String nom,int dVieParNiveau,String description){
        this.nom = nom;
        dVie = dVieParNiveau;
        this.description = description;
    }

    public String getNom(){
        return nom;
    }

    public String getDescription(){
        return description;
    }

}
