package com.example.demo2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    ListView<String> CharacterListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        CharacterListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        String [] monsters = {"zombies", "vampires","werewolves"};
        for(String monster: monsters)
        {
            CharacterListView.getItems().add(monster);
        }
    }
}