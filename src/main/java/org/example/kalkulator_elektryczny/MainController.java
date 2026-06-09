package org.example.kalkulator_elektryczny;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private KalkulatorElektryczny kalkulatorElektryczny;
    @FXML
    private ComboBox typComboBox;
    @FXML
    private Label pole1label;
    @FXML
    private TextField pole1;
    @FXML
    private Label pole2label;
    @FXML
    private TextField pole2;
    @FXML
    private Label pole3label;
    @FXML
    private TextField pole3;
    @FXML
    private Label wynikLabel;

    @FXML
    public void initialize(){}

    @FXML
    public void onTypObliczeniaChanged(){

    }

    @FXML
    public void onObliczClick(){
        wynikLabel.setText("");
    }
}
