package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBaseController {

           String Url = "jdbc:mysql://localhost:3306/log_in_storeg";
           String Password = "1234567";
           String Name = "root";
    public void MainConnection(){
        try{
          
           Class.forName("com.mysql.cj.jdbc.Driver");
          //Connection connection = null;
          if(Name.isEmpty()||Password.isEmpty()||Url.isEmpty()){
            System.out.println("something went wrong while connecting database");   
          }else{
            Connection connection = DriverManager.getConnection(Url,Name,Password);
            System.out.println("DATA_BASE CONNECTED - All Good");
          }
        
           
        }catch(Exception e){
          e.printStackTrace();
        }        
    }
    public void InsertIntoDataBase(String ScannerName,String ScannerPassword){
      try{
      //MainConnection();
      String SQL_Command = "insert into users(name,password) values (?,?)";
      // PreparedStatement statement = MainConnection()
      Connection testStatmentConnection = DriverManager.getConnection(Url,Name,Password);
      PreparedStatement statement = testStatmentConnection.prepareStatement(SQL_Command);
      statement.setString(1,ScannerName);
      statement.setString(2,ScannerPassword);

      int rowsAffected = statement.executeUpdate();
      if(rowsAffected > 0){
        System.out.println("Update in DataBase : " + rowsAffected);
      }
      }catch(Exception e){
        e.printStackTrace();
      }
      }
}
