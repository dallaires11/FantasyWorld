package View;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class Viewer {
    private Scene scene;
    private Group root;
    private MenuBar menuBar;
    private Menu menuSave;

    public Viewer(){
        menuBar = new MenuBar();
        menuSave = new Menu("Enregistrer");

        menuBar.getMenus().addAll(menuSave);

        root = new Group();
        root.getChildren().add(menuBar);
        scene = new Scene(root,600,700);
    }

    private void setElement(){

    }

    public Scene getScene(){
        return scene;
    }
}