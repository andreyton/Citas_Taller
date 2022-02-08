package com.example.citas;

import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class AgendamientoController {

    // Iniciador ventana agendar cita
    @FXML
    protected void onAgendarButtonClick() throws IOException {
        Agendar open  = new Agendar();
        open.start(new Stage());
    }

    // Iniciador ventana Buscar cita
    @FXML
    protected void onBuscarButtonClick() throws IOException {
        Buscar open  = new Buscar();
        open.start(new Stage());
    }

    // Generar registro en archivo XML O JSON , en carpeta del dia (FECHA)
    @FXML
    protected void onRegistrarButtonClick() throws IOException {
        // ....
    }
}

