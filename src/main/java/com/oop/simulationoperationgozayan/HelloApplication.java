package com.oop.simulationoperationgozayan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/oop/simulationoperationgozayan/login/LoginScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Welcome To Gozayan!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}