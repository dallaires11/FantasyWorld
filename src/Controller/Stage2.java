package Controller;

import View.Viewer;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Stage2 extends Stage{

    public Stage2(){
        Viewer viewer = new Viewer();
        this.setTitle("Fantasy World - Perso Viewer");
        this.getIcons().add(new Image("Images/icon.png"));
        this.setScene(viewer.getScene());
        this.setResizable(false);
        this.show();
    }
}