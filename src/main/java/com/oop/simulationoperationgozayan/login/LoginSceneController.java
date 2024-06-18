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
    public void signInButtonOnClicked(ActionEvent actionEvent) throws IOException {
        String emailOrUserId = emailOrUserIdTextField.getText();
        String password = passwordTextField.getText();
        String userType = userTypeComboBox.getValue();

        LoginValidationAndVerification loginValidationAndVerification = new LoginValidationAndVerification();
        if (loginValidationAndVerification.validateEmailOrId(emailOrUserId) && loginValidationAndVerification.validatePassword(password)) {
            Parent dashboardScene = switch (userType) {
                case "Customer" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/protik/customer/customerDashboardScene.fxml")));
                case "Accounts & Finance Officer" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/protik/accounts_and_finance_officer/accountOfficerDashboardScene.fxml")));
                case "Customer Service Executive" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/plabon/customer_service_executive/customerServiceExecutiveDashboardScene.fxml")));
                case "Operation Manager" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/plabon/operation_manager/operationManagerDashboardScene.fxml")));
                case "Admin" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/amanta/admin/adminDashboardScene.fxml")));
                case "HRM" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/amanta/hrm/hrmDashboardScene.fxml")));
                case "Hotel Manager" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/toushia/hotelManager/hotelManagerDashboardScene.fxml")));
                case "Tour Agent" ->
                        FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/oop/simulationoperationgozayan/toushia/tourAgent/tourAgentDashboardScene.fxml")));
                default -> throw new IllegalArgumentException("Invalid user type: " + userType);
            };
            Scene scene = new Scene(dashboardScene);
            Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setTitle(userType + " Dashboard");
            window.setScene(scene);
            window.show();
        } else {
            System.out.println("Invalid Email or User ID or Password");
        }
    }

    @javafx.fxml.FXML
    public void forgotPasswordButtonOnClicked(ActionEvent actionEvent) {
    }
}
