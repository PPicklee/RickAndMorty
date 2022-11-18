module com.example.rickandmorty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rickandmorty to javafx.fxml;
    exports com.example.rickandmorty;
}