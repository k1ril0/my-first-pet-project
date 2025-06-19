package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseController {
    String Url = "jdbc:mysql://localhost:3306/my_project_database";
    String Password = "1234567";
    String Name = "root";
    public Connection MainConnection(String name,String password,String url){
        try{
          if(!name.isEmpty()||!password.isEmpty()||!url.isEmpty()){
            Connection connection = DriverManager.getConnection(name,password,url);
            System.out.println("DATA_BASE CONNECTED");
          }else{
            return null;
          }
          return connection; 
           
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
