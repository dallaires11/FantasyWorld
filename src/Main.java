/**Projet de createur de personnage fantastique V.ALPHA
* Demare le 13/07/2017 par Samuel Dallaire
* */
import Controller.Stage1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new Stage1();
    }


    public static void main(String[] args) {launch(args);}
}