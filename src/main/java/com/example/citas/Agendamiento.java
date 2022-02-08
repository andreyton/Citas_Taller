package com.example.citas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Agendamiento extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Agendamiento.class.getResource("Agendamiento.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Agendamiento de Citas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}