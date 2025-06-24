package com.example;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DataBaseIndicatorController implements Initializable {
  @FXML
    private TreeTableView<CotructorsAndGetterSetters> DATA_BASE_TABLE;

    @FXML
    private TreeTableColumn<CotructorsAndGetterSetters, Integer> ID_COLUMN;

    @FXML
    private TreeTableColumn<CotructorsAndGetterSetters, String> NAME_COLUMN;

    @FXML
    private TreeTableColumn<CotructorsAndGetterSetters, String> PASSWORD_COLUMN;

    ObservableList<CotructorsAndGetterSetters>observableList = FXCollections.observableArrayList();

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

       observableList.add(new CotructorsAndGetterSetters(idOfUser, NameOfUSer, PasswordOFUser));
       }
      //  ID_COLUMN.setCellValueFactory(new PropertyValueFactory<>("idUser"));
      //  NAME_COLUMN.setCellValueFactory(null);
      //  PASSWORD_COLUMN.setCellValueFactory(null);
       
      }catch(Exception e){
        e.printStackTrace();
      }
    }
    
}
