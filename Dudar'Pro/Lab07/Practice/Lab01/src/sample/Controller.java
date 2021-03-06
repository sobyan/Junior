package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imageJava;

    @FXML
    void initialize() {
        imageJava.setOnMouseClicked(event -> {
            imageJava.setVisible(false);
        });
    }
}