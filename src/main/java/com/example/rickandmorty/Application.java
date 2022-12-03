package com.example.rickandmorty;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("start.fxml"));
        //logo
        stage.getIcons().add(new Image(Application.class.getResourceAsStream("images/rick.png")));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Rick and Morty API");
        stage.setScene(scene);
        stage.show();
    }
//testing
//    public static void main(String[] args) throws IOException, InterruptedException {
//
//        APIResponse apiResponse = APIUtility.getCharacterFromRickAndMorty("rick");
//        launch();
//    }
}