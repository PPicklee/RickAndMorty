package com.example.rickandmorty;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

    public class SceneChanger {
        public static void changeScenes(ActionEvent event, String fxmlFileName, CharacterDetails characterDetails) throws IOException, InterruptedException {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(fxmlFileName));
            Scene scene = new Scene(fxmlLoader.load());
            DetailsController controller = fxmlLoader.getController();
            controller.loadCharacterDetails(characterDetails);

            //Gets the stage
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }

        public static void changeScenes(ActionEvent event,String fxmlFileName) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(fxmlFileName));
            Scene scene = new Scene(fxmlLoader.load());

            //Gets the Stage
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

