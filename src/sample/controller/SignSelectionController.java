package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SignSelectionController {

    @FXML
    private Button grajButton;
    @FXML
    private Button menuButton;


    @FXML
    void initialize(){

        EventHandler<ActionEvent> handlerGraj = new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){
                System.out.println("Rozpoczecie gry");
            }

        };

        EventHandler<ActionEvent> handlerMenu = new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){
                System.out.println("Powrot do menu");
            }

        };

        grajButton.addEventHandler(ActionEvent.ACTION, handlerGraj);
        menuButton.addEventHandler(ActionEvent.ACTION, handlerMenu);

}
