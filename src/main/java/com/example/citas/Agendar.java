package com.example.citas;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Agendar extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Agendamiento.class.getResource("Agendar.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Agendar Cita");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
