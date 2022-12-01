package com.example.rickandmorty;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;


public class Controller implements Initializable {

        @FXML
        private ListView<Character> listView;


        @FXML
        private HBox resultsHBox;


        @FXML
        private TextField searchTextField;

        @FXML
        private VBox vbox;

        /**
         * API search term to get results
         */
        @FXML
        private void search() throws IOException, InterruptedException {
            APIResponse apiResponse = APIUtility.getCharacterFromRickAndMorty(searchTextField.getText());
            //APIResponse apiResponse = APIUtility.getCharacterFromRickAndMorty("rick");

            if (apiResponse.getCharacter().size()>0)
            //if (apiResponse.resultsReturned())
            {
                resultsHBox.setVisible(true);
                vbox.setVisible(true);
                listView.getItems().addAll(apiResponse.getCharacter());
            }else{
                resultsHBox.setVisible(false);
            }
        }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}