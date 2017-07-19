package View;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Viewer {
    private Scene scene;
    private MenuBar menuBar;
    private MenuItem menuItemSave;
    private Group imageScene;

    public Viewer(){
        menuBar = new MenuBar();
        Menu menuFichier = new Menu("Fichier");
        menuItemSave = new MenuItem("Enregistrer");
        menuFichier.getItems().add(menuItemSave);
        menuBar.getMenus().add(menuFichier);

        setElement();
        setAction();

        Group root = new Group();
        imageScene = new Group();
        root.getChildren().addAll(menuBar,imageScene);
        scene = new Scene(root,600,700);
    }

    private void setElement(){
        menuBar.setPrefWidth(630);
    }
    private void setAction(){
        menuItemSave.setOnAction(event -> saveAsPng());
    }

    public Scene getScene(){
        return scene;
    }

    private void saveAsPng() {
        System.out.println("re");
        WritableImage image = imageScene.snapshot(new SnapshotParameters(), null);

        // TODO: probably use a file chooser here
        File file = new File("viewer.png");

        try {
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
        } catch (IOException e) {
            // TODO: handle exception here
        }
    }
}