package com.example.todoapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public void start(Stage stage) throws Exception{
    Parent root =  FXMLLoader.load(getClass().getResource("Main.fxml"));

    Scene scene = new Scene(root, 350,600);

    scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());


    stage.setTitle("To-do Application");
    stage.setResizable(false);
    stage.setScene(scene);
    stage.show();

    }


    public static void main(String[] args) {

        launch();
    }
}