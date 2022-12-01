module com.example.rickandmorty {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.rickandmorty to javafx.fxml, com.google.gson;
    exports com.example.rickandmorty;
}