package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

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
