package Model;

import Controller.G_5TA8;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Vector;

public class Codex {
    private Vector<Race> races;
    private Vector<Classe> classes;
    private G_5TA8 g_stab;

    public Codex(){
        races = new Vector<>();
        classes = new Vector<>();
        createRaces();
        createClasse();
        g_stab = new G_5TA8(races,classes);

    }

    private void createRaces(){
        String nomFichier = "race.xml";
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(nomFichier);

            NodeList list = doc.getElementsByTagName("race");

            for (int i = 0; i < list.getLength(); i++) {
                Node nNode = list.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    if (eElement.getElementsByTagName("pret").item(0).getTextContent().equalsIgnoreCase("true")){
                        String nom = eElement.getElementsByTagName("nom").item(0).getTextContent();
                        String description = eElement.getElementsByTagName("description").item(0).getTextContent();
                        int bonusFor = Integer.parseInt(eElement.getElementsByTagName("bonusFor").item(0).getTextContent());
                        int bonusDex = Integer.parseInt(eElement.getElementsByTagName("bonusDex").item(0).getTextContent());
                        int bonusCon = Integer.parseInt(eElement.getElementsByTagName("bonusCon").item(0).getTextContent());
                        int bonusInt = Integer.parseInt(eElement.getElementsByTagName("bonusInt").item(0).getTextContent());
                        int bonusSag = Integer.parseInt(eElement.getElementsByTagName("bonusSag").item(0).getTextContent());
                        int bonusCha = Integer.parseInt(eElement.getElementsByTagName("bonusCha").item(0).getTextContent());
                        int vitesse = Integer.parseInt(eElement.getElementsByTagName("vitesse").item(0).getTextContent());
                        char taille = eElement.getElementsByTagName("taille").item(0).getTextContent().charAt(0);
                        String langues = eElement.getElementsByTagName("langues").item(0).getTextContent();
                        races.add(new Race(nom,description,bonusFor,bonusDex,bonusCon,bonusInt,bonusSag,bonusCha,vitesse,taille,langues));
                    }
                }

            }
        } catch (IOException | ParserConfigurationException | SAXException e){
            e.printStackTrace();
        }
    }

    private void createClasse(){
        String nomFichier = "classe.xml";
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(nomFichier);

            NodeList list = doc.getElementsByTagName("classe");

            for (int i = 0; i < list.getLength(); i++) {
                Node nNode = list.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    if (eElement.getElementsByTagName("pret").item(0).getTextContent().equalsIgnoreCase("true")){
                        String nom = eElement.getElementsByTagName("nom").item(0).getTextContent();
                        classes.add(new Classe(nom));
                    }
                }

            }
        } catch (IOException | ParserConfigurationException | SAXException e){
            e.printStackTrace();
        }
    }

    public Vector<Classe> getClasses(){return classes;}

    public Vector<Race> getRaces(){
        return races;
    }

    public G_5TA8 getG_5TA8(){return g_stab;}
}