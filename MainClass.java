package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class MainClass extends Application
{
    public static void main( String[] args )
    {
     launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.setTitle("MainStage");
        primaryStage.show();
    }
}
