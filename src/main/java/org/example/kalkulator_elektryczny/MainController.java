package org.example.kalkulator_elektryczny;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    private KalkulatorElektryczny kalkulatorElektryczny;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
