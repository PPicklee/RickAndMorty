package com.example.rickandmorty;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;


public class StartController implements Initializable {


        @FXML
        private ImageView characterImageView;

        @FXML
        private ListView<Character> listView;

        @FXML
        private Button moreInfoButton;

        @FXML
        private HBox resultsHBox;


        @FXML
        private TextField searchTextField;

        @FXML
        private VBox vbox;
        @FXML
         void getDetails(ActionEvent event) throws IOException, InterruptedException {
            Character characterSelected = listView.getSelectionModel().getSelectedItem();
            //SceneChanger.changeScenes(event,"info-view.fxml",movieSelected.getImdbID());
         }

        /**
         * API search term to get results
         */
        @FXML
        private void search() throws IOException, InterruptedException {
            APIResponse apiResponse = APIUtility.getCharacterFromRickAndMorty(searchTextField.getText());

            if (apiResponse.getCharacter().size()>0)
            {
                resultsHBox.setVisible(true);
                listView.getItems().clear();
                listView.getItems().addAll(apiResponse.getCharacter());
            }else{
                resultsHBox.setVisible(false);
            }
        }

    /**
     * Added a listener to get the image depending what is selected on the list view
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listView.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, old, charcterSelected) -> {
                    if (charcterSelected!=null)
                    {
                        try {
                            characterImageView.setImage(new Image(charcterSelected.getImage()));
                        } catch (IllegalArgumentException e) {
                            //Has its own default image imbeded in the API, but if needed would do this
                           // characterImageView.setImage(new Image(Application.class
                            //       .getResourceAsStream("images/defaultCharacter.png")));
                        }
                    }
                });
    }
}