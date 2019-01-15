package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import sample.Main;

public class MenuController {

    @FXML
    private Button startButton;
    @FXML
    private Button wyjdzButton;

    public MenuController(){
        System.out.println("duaaa");
    }

    @FXML
    void initialize(){

        EventHandler<ActionEvent> handlerStart = new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){

//                try {
//                    Parent root = FXMLLoader.load(getClass().getResource("../view/SignSelectionView.fxml"));
//                    Stage stage = new Stage();
//                    stage.setScene(new Scene(root));
//                    stage.show();
//                    Main.stg.close();
//                } catch(Exception e) {
//                    e.printStackTrace();
//                }
                System.out.println("Przejscie do nowego okna SignSelection");
            }

        };

        EventHandler<ActionEvent> handlerWyjdz = new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){
                System.out.println("Wyjscie z aplikacji");
            }

        };

        startButton.addEventHandler(ActionEvent.ACTION, handlerStart);
        wyjdzButton.addEventHandler(ActionEvent.ACTION, handlerWyjdz);

    }
}
