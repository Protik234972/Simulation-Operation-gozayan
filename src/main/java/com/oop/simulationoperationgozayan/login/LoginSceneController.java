package com.oop.simulationoperationgozayan.login;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class LoginSceneController {
    @javafx.fxml.FXML
    private TextField emailOrUserIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private PasswordField passwordTextField;

    @javafx.fxml.FXML
    void initialize() {
        userTypeComboBox.setValue("Select User Type");
        userTypeComboBox.getItems().addAll("Customer","Accounts & Finance Officer",
                                            "Customer Service Executive","Operation Manager",
                                                "Admin","HRM",
                                                "Hotel Manager","Tour Agent");

    }

    @javafx.fxml.FXML
    public void createNewAccountButtonOnClicked(ActionEvent actionEvent) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/login/signupScene.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setTitle("Signup");
        window.setScene(scene2);
        window.show();
    }

    @javafx.fxml.FXML
    public void signInButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void forgotPasswordButtonOnClicked(ActionEvent actionEvent) {
    }
}
