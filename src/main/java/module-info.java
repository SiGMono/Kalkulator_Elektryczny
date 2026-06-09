module org.example.kalkulator_elektryczny {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kalkulator_elektryczny to javafx.fxml;
    exports org.example.kalkulator_elektryczny;
}