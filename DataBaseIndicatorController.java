package com.example;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class DataBaseIndicatorController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
      try{
       DataBaseController controller = new DataBaseController();
       Connection connectionForPopulate = controller.getDBConnection();
       String SQL_Command_Populate = "select * from users";
       Statement statement =connectionForPopulate.createStatement();
       ResultSet resultset = statement.executeQuery(SQL_Command_Populate);
       while(resultset.next()){
       Integer idOfUser = resultset.getInt("id");
       String NameOfUSer = resultset.getString("name");
       String PasswordOFUser = resultset.getString("password");
       }

       
      }catch(Exception e){
        e.printStackTrace();
      }
    }
    
}
