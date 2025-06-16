package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField LOGINFIELD;

    @FXML
    private TextField PASSWORDFIELD;

    @FXML
    private Button SUBMITBUTTON;
    @FXML
    private  void SUBMIT_BUTTON_ACTION(){
     System.out.println(CheckingInstants());
    }
    private String  CheckingInstants(){
        String Status;
        if(LOGINFIELD.getText().isEmpty()){
         return Status = "LOGIN FIELD IS EMPTHY";
        }else if(PASSWORDFIELD.getText().isEmpty()){
          return Status = "PASSWORD FIELD IS EMPTHY";
        }else if(PASSWORDFIELD.getText().isEmpty()||LOGINFIELD.getText().isEmpty()){
          return Status = "BOTH FIELDS ARE EMPTHY";
        }else{
          return Status = "ALL GOOD";
        }
        // return null;
    }
}
