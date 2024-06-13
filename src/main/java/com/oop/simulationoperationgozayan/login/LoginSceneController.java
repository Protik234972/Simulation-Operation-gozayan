package com.oop.simulationoperationgozayan.login;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
public class LoginSceneController {
    @javafx.fxml.FXML
    private TextField emailOrUserIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    void initialize() {
        userTypeComboBox.setValue("Select User Type");
        userTypeComboBox.getItems().addAll("Customer","Accounts & Finance Officer",
                                            "Customer Service Executive","Operation Manager",
                                                "Admin","HRM",
                                                "Hotel Manager","Tour Agent");

    }

    @javafx.fxml.FXML
    public void validatePassword(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void createNewAccountButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void validateEmailOrUserId(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signInButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void forgotPasswordButtonOnClicked(ActionEvent actionEvent) {
    }
}
