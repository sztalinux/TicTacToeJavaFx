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

public class SignSelectionController {

    @FXML
    private Button grajButton;
    @FXML
    private Button menuButton;

    public SignSelectionController(){
        System.out.println("duaaa");
    }

    @FXML
    void initialize(){

        EventHandler<ActionEvent> handlerGraj = new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event){
//                Jesli dobrze zaznaczony znak:
                System.out.println("Przejscie do nowego okna Game");
//                else nic sie nie dzieje po kliknieciu
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
}
