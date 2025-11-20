package com.example.demo2;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    ListView<horrorCharacter> CharacterListView;
    @FXML
    private Button btnCreate;
    @FXML
    private Button btnRead;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    @FXML
    private TextField txtCharacterName;
    @FXML
    private TextField txtWeakness;
    @FXML
    private CheckBox chkTransformation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CharacterListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        horrorCharacter[] monsters = {
                new horrorCharacter("Zombies", "Rotting flesh", false),
                new horrorCharacter("Vampires", "Sunlight", true),
                new horrorCharacter("Werewolves", "Silver", true)
        };
        for (horrorCharacter monster : monsters) {
            CharacterListView.getItems().add(monster);
        }
    }

    @FXML
    public void addButtonClicked() {
        String characterName = txtCharacterName.getText();
        String weakness = txtWeakness.getText();
        boolean transformation = chkTransformation.isSelected();
        horrorCharacter newHorrorCharacter = new horrorCharacter(characterName, weakness, transformation);
        CharacterListView.getItems().add(newHorrorCharacter);
    }

    @FXML
    public void readButtonClicked() {
        horrorCharacter selectedCharacter = CharacterListView.getSelectionModel().getSelectedItem();
        if (selectedCharacter != null) {
            label1.setText("Character Name: " + selectedCharacter.getCharacterName());
            label2.setText("Weakness: " + selectedCharacter.getWeakness());
            txtCharacterName.setText(selectedCharacter.getCharacterName());
            txtWeakness.setText(selectedCharacter.getWeakness());
            chkTransformation.setSelected(selectedCharacter.isTransformation());
        }
    }

    @FXML
    public void updateButtonClicked() {
        horrorCharacter selectedCharacter = CharacterListView.getSelectionModel().getSelectedItem();
        if (selectedCharacter != null) {
            selectedCharacter.setCharacterName(txtCharacterName.getText());
            selectedCharacter.setWeakness(txtWeakness.getText());
            selectedCharacter.setTransformation(chkTransformation.isSelected());
            CharacterListView.refresh();
        }
    }

    @FXML
    public void deleteButtonClicked() {
        horrorCharacter selectedCharacter = CharacterListView.getSelectionModel().getSelectedItem();
        if (selectedCharacter != null) {
            CharacterListView.getItems().remove(selectedCharacter);
        }
    }
}