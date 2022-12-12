package com.hospital;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToMedicoView(ActionEvent event) {

        try {
            root = FXMLLoader.load(getClass().getResource("MedicoView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Datos de personal de medicina");
            stage.setScene(scene);

            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void switchToEnfermeroView(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("EnfermeroView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Datos de personal de enfermería");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchToPacienteView(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("PacienteView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Datos de pacientes");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchToAppointmentView(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("AppointmentView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void switchToConsultaMedicoView(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("ConsultaMedicoView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void switchToConsultaPacienteView(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("ConsultaPacienteView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void switchToConsultaOperarView(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("ConsultaOperarView.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}



