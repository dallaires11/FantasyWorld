package Controller;

import Model.Classe;
import Model.Race;
import javafx.scene.control.Tooltip;

import java.util.Vector;

public class G_5TA8 {
    private Vector<Classe> classes;
    private Vector<Race> races;

    public G_5TA8(Vector races,Vector classes){
        this.races = races;
        this.classes =  classes;
    }

    public Tooltip giveMeTooltip(String nom,String section){
        String description;
        description = "erreur";
        if(section.equalsIgnoreCase("race")){
            for (Race raceSearch: races) {
                if (raceSearch.getNom().equalsIgnoreCase(nom)) {
                    description = raceSearch.getDescription();
                    break;
                }
            }
        }
        else if(section.equalsIgnoreCase("classe")){
            for (Classe classeSearch: classes) {
                if (classeSearch.getNom().equalsIgnoreCase(nom)) {
                    description = classeSearch.getDescription();
                    break;
                }
            }
        }
        Tooltip tp = new Tooltip(description);
        return tp;
    }
    public int giveMeBonus(String nom,String stat){
        int bonusStat = 0;
        for (Race raceSearch: races) {
            if (raceSearch.getNom().equalsIgnoreCase(nom)) {
                bonusStat = raceSearch.getStat(stat);
                break;
            }
        }
        return bonusStat;
    }
}
