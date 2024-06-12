module com.oop.simulationoperationgozayan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.simulationoperationgozayan to javafx.fxml;
    exports com.oop.simulationoperationgozayan;
}