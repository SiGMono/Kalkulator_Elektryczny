package org.example.kalkulator_elektryczny;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private KalkulatorElektryczny kalkulatorElektryczny = new KalkulatorElektryczny();
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
        pole1.setText("");
        pole2.setText("");
        pole3.setText("");
        switch (typComboBox.getValue().toString()){
            case "Napiecie":
                pole1label.setText("Natezenie");
                pole2label.setText("Opor");
                pole3.setDisable(true);
                break;
            case "Natezenie":
                pole1label.setText("Napiecie");
                pole2label.setText("Opor");
                pole3.setDisable(true);
                break;
            case "Opor":
                pole1label.setText("Napiecie");
                pole2label.setText("Natezenie");
                pole3.setDisable(true);
                break;
            case "Opor Szeregowy":
            case "Opor Rownolegly":
                pole1label.setText("R1");
                pole2label.setText("R2");
                pole3label.setText("R3");
                pole3.setDisable(false);
                break;
            case "Moc":
                pole1label.setText("Napiecie");
                pole2label.setText("Natezenie");
                pole3label.setText("Czas (sekundy)");
                pole3.setDisable(false);
                break;
        }
    }

    public static boolean checkIfNumber(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    @FXML
    public void onObliczClick(){
        if (checkIfNumber(pole1.getText()) ||  checkIfNumber(pole2.getText()) || checkIfNumber(pole3.getText())){
            Double pole1num = Double.parseDouble(pole1.getText());
            Double pole2num = Double.parseDouble(pole2.getText());
            Double pole3num = 0.0;
            if(!pole3.getText().isEmpty()){
                pole3num = Double.parseDouble(pole3.getText());
            }
            switch (typComboBox.getValue().toString()){
                case "Napiecie":
                    wynikLabel.setText(kalkulatorElektryczny.obliczNapiecie(pole1num, pole2num) + "V");
                    break;
                case "Natezenie":
                    wynikLabel.setText(kalkulatorElektryczny.obliczNatezenie(pole1num, pole2num) + "A");
                    break;
                case "Opor":
                    wynikLabel.setText(kalkulatorElektryczny.obliczOpor(pole1num, pole2num) + "Ω");
                    break;
                case "Opor Szeregowy":
                    if(pole3.getText().isEmpty()){
                        wynikLabel.setText(kalkulatorElektryczny.szeregowo(pole1num, pole2num) + "Ω");
                    }else{
                        wynikLabel.setText(kalkulatorElektryczny.szeregowo(pole1num, pole2num, pole3num) + "Ω");
                    }
                    break;
                case "Opor Rownolegly":
                    if(pole3.getText().isEmpty()){
                        wynikLabel.setText(kalkulatorElektryczny.rownolegle(pole1num, pole2num) + "Ω");
                    }else{
                        wynikLabel.setText(kalkulatorElektryczny.rownolegle(pole1num, pole2num, pole3num) + "Ω");
                    }
                    break;
                case "Moc":
                    if(pole3.getText().isEmpty()){
                        wynikLabel.setText(kalkulatorElektryczny.obliczMoc(pole1num, pole2num) + "W");
                    }else{
                        wynikLabel.setText(kalkulatorElektryczny.obliczMoc(pole1num, pole2num, pole3num) + "J");
                    }
                    break;
            }
        }else{
            wynikLabel.setText("Zla wartosc wejsciowa na jednym z pol");
        }
    }
}
