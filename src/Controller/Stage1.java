package Controller;

import Model.Codex;
import View.Espace_formulaire;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Stage1 extends Stage{

    public Stage1(){
        Codex codex = new Codex();
        Espace_formulaire formulaire = new Espace_formulaire(codex);

        this.setTitle("Fantasy World");
        this.getIcons().add(new Image("Images/icon.png"));
        this.setScene(formulaire.getScene());
        this.show();
        this.setResizable(false);
    }
}