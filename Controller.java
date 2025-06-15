package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button Button;

    @FXML
    private Label Label;

    @FXML
    private  void ButtonAction(){
      Button.setOnAction(event -> {
        Label.setText("CHUI");
      }); 
    }
    
}
