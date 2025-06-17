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
     //System.out.println(CheckingInstants().toString());
     switch(CheckingInstants()){
      case "LOGIN_EMPTHY":
      System.out.println("LOGIN FIELD IS EMPTHY");
      break;
      case "PASSWORD_EMPTHY":
      System.out.println("PASSWORD FIELD IS EMPTHY");
      break;
      case "BOTH_EMPTHY":
      System.out.println("BOTH FIELDS ARE EMPTHY");
      break;
      case "ALL_GOOD":
      System.out.println("ALL GOOD");
      break;  
       }
    }
    private String  CheckingInstants(){
        String Status;
        if(LOGINFIELD.getText().isEmpty()){
         return Status = "LOGIN_EMPTHY";
        }else if(PASSWORDFIELD.getText().isEmpty()){
          return Status = "PASSWORD_EMPTHY";
        }else if(PASSWORDFIELD.getText().isEmpty()||LOGINFIELD.getText().isEmpty()){
          return Status = "BOTH_EMPTHY";
        }else{
          return Status = "ALL_GOOD";
        }
        // return null;
    }
}
