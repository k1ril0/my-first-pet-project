package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseController {
  
    public void MainConnection(){
        try{
           String Url = "jdbc:mysql://localhost:3306/log_in_storeg";
           String Password = "1234567";
           String Name = "root";
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
    // public void GetConnection(){
    //     try{
    //        Connection connection = DriverManager.getConnection()
    //     }catch(Exception e){
    //         e.printStackTrace();
    //     }
    // }
}
