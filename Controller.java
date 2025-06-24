package com.example;

import java.util.ArrayList;

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
    private Button SUBMITBUTTON_FOR_DATA_BASE;




    @FXML
    private  void SUBMIT_BUTTON_ACTION(){
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
      DataBaseController controllerOfDataBase = new DataBaseController();
      controllerOfDataBase.InsertIntoDataBase(LOGINFIELD.getText(),PASSWORDFIELD.getText());
      break;  
       }
    }
    private String  CheckingInstants(){
        String Status;
        if(LOGINFIELD.getText().isEmpty()){
         return Status = "LOGIN_EMPTHY";
        }else if(PASSWORDFIELD.getText().isEmpty()){
          return Status = "PASSWORD_EMPTHY";
        }else if(PASSWORDFIELD.getText().isEmpty() && LOGINFIELD.getText().isEmpty()){
          return Status = "BOTH_EMPTHY";
        }else{
          return Status = "ALL_GOOD";
        }  
        // return null;
    }
    //not sure about this method 
    // public void WriteLoginInString(String LoginForList,String PasswordForList){
    //   System.out.println("Here is your data in log-in");
    //   //  ArrayList <String> List= new ArrayList<>();
    //   //  List.add(LoginForList);
    //    System.out.println("Login is : " + LoginForList);
    //    System.out.println("Password is : " + PasswordForList);
    // }

    @FXML
    private void Acttive_Data_Base(){
      SUBMITBUTTON_FOR_DATA_BASE.setOnAction(event -> {
        DataBaseController dBaseController = new DataBaseController();
        dBaseController.MainConnection();
      });
    }
}
