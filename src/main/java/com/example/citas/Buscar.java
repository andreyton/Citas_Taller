package com.example.citas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Buscar extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Agendamiento.class.getResource("Buscar.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Buscar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
