package View;

import Controller.Stage2;
import Model.*;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Espace_formulaire {
    private Group formulaire;
    private boolean monstreous;
    private TextField nom,divinite,taille,age;
    private TextArea backStory;
    private ComboBox<String> race,classe,corpulence,eye_color,hair_color;
    private CheckBox genderM,genderF,croyant;
    private Scene scene;
    private VBox supermegabox,vbox1,vbox2;
    private HBox megaHbox,hboxnom,hboxDivinite,hboxGender,hboxCorpulence,hboxrace,hboxclasse,hboxeye,hboxhair,hboxtaille,hboxage,
            hboxFor,hboxDex,hboxCons,hboxInt,hboxWis,hboxCha;
    private Label nomLabel,corpulenceLabel,croyance,eyeLabel,hairLabel,tailleLabel,tailleuniteLabel,ageLabel,classeLabel,
            raceLabel,backStoryLabel,genderLabel,stat,forLabel,dexLabel,consLabel,intLabel,wisLabel,chaLabel,forLabel2,
            dexLabel2, consLabel2,intLabel2,wisLabel2,chaLabel2;
    private Button openViewer,randomizeStat;
    private Spinner<Integer> forTir;
    private Spinner<Integer> dexTir;
    private Spinner<Integer> consTir;
    private Spinner<Integer> intTir;
    private Spinner<Integer> wisTir;
    private Spinner<Integer> chaTir;
    private Profile profile;
    private Codex codex;

    public Espace_formulaire(Codex codex){
        this.codex = codex;
        profile = new Profile();
        openViewer = new Button("Visualisez");
        randomizeStat = new Button("Testez votre luck?");

        formulaire = new Group();
        supermegabox = new VBox();
        megaHbox = new HBox();
        vbox1 = new VBox();
        vbox2 = new VBox();
        //Group 1
        hboxnom = new HBox();
        hboxrace = new HBox();
        hboxGender = new HBox();
        hboxage = new HBox();
        hboxCorpulence =  new HBox();
        hboxeye = new HBox();
        hboxhair = new HBox();
        hboxtaille = new HBox();
        hboxDivinite = new HBox();
        hboxclasse = new HBox();

        nomLabel =  new Label("Nom du personnage:");
        raceLabel = new Label("Race du personnage:");
        genderLabel = new Label("Sexe:");
        ageLabel = new Label("Age du personnage:");
        corpulenceLabel = new Label("Corpulence:");
        eyeLabel = new Label("Couleur des yeux:");
        hairLabel = new Label("Couleur des cheveux:");
        tailleLabel = new Label("Taille du personnage:");
        tailleuniteLabel = new Label("m");
        croyance = new Label("Croyance:");
        classeLabel = new Label("Classe du personnage");
        backStoryLabel = new Label("BackStory:");

        nom = new TextField();
        race = new ComboBox<>();
        genderF = new CheckBox("F");
        genderM = new CheckBox("M");
        age = new TextField();
        corpulence = new ComboBox<>();
        eye_color = new ComboBox<>();
        hair_color = new ComboBox<>();
        taille = new TextField();
        divinite = new TextField();
        croyant = new CheckBox();
        classe = new ComboBox<>();
        backStory = new TextArea();

        hboxnom.getChildren().addAll(nomLabel,nom);
        hboxrace.getChildren().addAll(raceLabel,race);
        hboxGender.getChildren().addAll(genderF,genderM);
        hboxage.getChildren().addAll(ageLabel,age);
        hboxCorpulence.getChildren().addAll(corpulenceLabel,corpulence);
        hboxeye.getChildren().addAll(eyeLabel,eye_color);
        hboxhair.getChildren().addAll(hairLabel,hair_color);
        hboxtaille.getChildren().addAll(tailleLabel,taille,tailleuniteLabel);
        hboxDivinite.getChildren().addAll(croyance,divinite,croyant);
        hboxclasse.getChildren().addAll(classeLabel,classe);
        vbox1.getChildren().addAll(hboxnom,hboxrace,genderLabel,hboxGender,hboxage,hboxCorpulence,hboxeye,hboxhair,hboxtaille,hboxDivinite,hboxclasse,backStoryLabel,backStory);

        //Group 2
        hboxFor = new HBox();
        hboxDex = new HBox();
        hboxCons = new HBox();
        hboxInt = new HBox();
        hboxWis = new HBox();
        hboxCha  = new HBox();

        stat = new Label("Charactéristique");

        forLabel = new Label("FOR:  ");
        forTir = new Spinner<Integer>(0,20,10);
        forLabel2 = new Label(" + 0 = 0 (Mod: 0)");
        hboxFor.getChildren().addAll(forLabel,forTir,forLabel2);

        dexLabel = new Label("DEX:  ");
        dexTir = new Spinner<>(0,20,10);
        dexLabel2 = new Label(" + 0 = 0 (Mod: 0)");
        hboxDex.getChildren().addAll(dexLabel,dexTir,dexLabel2);

        consLabel = new Label("CON: ");
        consTir = new Spinner<>(0,20,10);
        consLabel2 = new Label(" + 0 = 0 (Mod: 0)");
        hboxCons.getChildren().addAll(consLabel,consTir,consLabel2);

        intLabel = new Label("INT:   ");
        intTir = new Spinner<Integer>(0,20,10);
        intLabel2 = new Label(" + 0 = 0 (Mod: 0)");
        hboxInt.getChildren().addAll(intLabel,intTir,intLabel2);

        wisLabel = new Label("SAG:  ");
        wisTir = new Spinner<Integer>(0,20,10);
        wisLabel2 = new Label(" + 0 = 0 (Mod: 0)");
        hboxWis.getChildren().addAll(wisLabel,wisTir,wisLabel2);

        chaLabel = new Label("CHA:  ");
        chaTir = new Spinner<>(0,20,10);
        chaLabel2 = new Label(" + 0 = 0 (Mod: 0)");
        hboxCha.getChildren().addAll(chaLabel,chaTir,chaLabel2);

        vbox2.getChildren().addAll(stat,hboxFor,hboxDex,hboxCons,hboxInt,hboxWis,hboxCha,randomizeStat);

        setElement();
        setAction();
        megaHbox.getChildren().addAll(vbox1,vbox2);
        supermegabox.getChildren().addAll(megaHbox,openViewer);
        formulaire.getChildren().add(supermegabox);
        scene = new Scene(formulaire,1200,800);
    }

    public Scene getScene(){
        return scene;
    }

    private void setElement(){
        nom.setPromptText("Nom complet");
        divinite.setPromptText("Divinite adepte");
        divinite.setDisable(true);
        for (Race raceCodex: codex.getRaces()){
            race.getItems().add(raceCodex.getNom());
        }
        race.getSelectionModel().selectFirst();
        age.setPromptText("Age en année");
        corpulence.getItems().addAll("normal","petit","massif","GODBUILD");
        corpulence.getSelectionModel().selectFirst();
        eye_color.getItems().addAll("brun","noir","bleu","vert","rouge","gris","violet");
        eye_color.getSelectionModel().selectFirst();
        hair_color.getItems().addAll("brun","noir","roux","blond","rouge","vert","bleu","blanc");
        hair_color.getSelectionModel().selectFirst();
        taille.setPromptText("X");
        for (Classe classeCodex: codex.getClasses()) {
            classe.getItems().add(classeCodex.getNom());
        }
        classe.getSelectionModel().selectFirst();
        backStory.setPromptText("Histoire personnel du personnage");

        //Appelle a chaque fois que la box s'ouvre?
        race.setCellFactory(event -> new ListCell<String>(){
            @Override
            public void updateItem(String item,boolean empty) {
                super.updateItem(item, empty);
                if (item != null) {
                    setText(item);
                    setTooltip(codex.getG_5TA8().giveMeTooltip(item,"race"));
                }
                else {
                    setText(null);
                    setTooltip(null);
                }
            }
        });
        classe.setCellFactory(event -> new ListCell<String>(){
            @Override
            public void updateItem(String item,boolean empty) {
                super.updateItem(item, empty);
                if (item != null) {
                    setText(item);
                    setTooltip(codex.getG_5TA8().giveMeTooltip(item,"classe"));
                }
                else {
                    setText(null);
                    setTooltip(null);
                }
            }
        });
        setTooltip(race,"race",race.getValue());
        setTooltip(classe,"classe",classe.getValue());

        forTir.setMaxWidth(55);
        dexTir.setMaxWidth(55);
        consTir.setMaxWidth(55);
        intTir.setMaxWidth(55);
        wisTir.setMaxWidth(55);
        chaTir.setMaxWidth(55);
    }
    private void setAction(){
        croyant.setOnAction(event -> {
            boolean selected = croyant.isSelected();
            divinite.setDisable(!selected);
        });
        race.valueProperty().addListener((observable, oldValue, newValue) -> setTooltip(race,"race",race.getValue()));
        classe.valueProperty().addListener((observable, oldValue, newValue) -> setTooltip(classe,"classe",classe.getValue()));

        randomizeStat.setOnAction(event -> {
            int[] statTemp;
            statTemp = Charactéristique.randomizerStat();
            forTir.getValueFactory().setValue(statTemp[0]);
            dexTir.getValueFactory().setValue(statTemp[1]);
            consTir.getValueFactory().setValue(statTemp[2]);
            intTir.getValueFactory().setValue(statTemp[3]);
            wisTir.getValueFactory().setValue(statTemp[4]);
            chaTir.getValueFactory().setValue(statTemp[5]);
        });
        openViewer.setOnAction(t -> new Stage2());
    }

    private void setTooltip(Node node,String section,String nom){
        final Tooltip t = codex.getG_5TA8().giveMeTooltip(nom,section);
        node.setOnMouseEntered(event -> {
            Point2D p = node.localToScreen(node.getLayoutBounds().getMaxX()-20, node.getLayoutBounds().getMaxY()-7); //I position the tooltip at bottom right of the node (see below for explanation)
            t.show(node, p.getX(), p.getY());
        });
        node.setOnMouseExited(event -> t.hide());
    }
}