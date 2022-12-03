package com.example.rickandmorty;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DetailsController implements Initializable, CharacterDetailsInitializable{
    @FXML
    private ImageView characterImageView;

    @FXML
    private Label genderLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label speciesLabel;

    @FXML
    private Label statusLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void loadCharacterDetails(CharacterDetails characterDetails) {
        characterImageView.setImage(new Image(characterDetails.getImage()));
        nameLabel.setText(characterDetails.getName());
        genderLabel.setText(characterDetails.getSpecies());
        speciesLabel.setText(characterDetails.getSpecies());
        statusLabel.setText(characterDetails.getStatus());
    }

    @FXML
    private void returnToStart(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"start.fxml");
    }


}

