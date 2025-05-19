package com.example.todoapplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {


    @FXML     //  inject all the values found in fxml class to controller class.
     private TextField Txtfield;

    @FXML
    private VBox taskcontainer;

    public void addtask(ActionEvent e ){
        // System.out.println("NEW TASK");


        String task = Txtfield.getText();
        if(!task.isEmpty()){
            Label taskLabel = new Label(task);
            taskcontainer.getChildren().add(taskLabel);

            taskLabel.getStyleClass().add("taskLabel");
            Txtfield.clear();
        }
    }

}
