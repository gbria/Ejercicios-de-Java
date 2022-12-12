package com.hospital;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ConsultaOperarController implements Initializable {
    @FXML
    private TableColumn<Patient, String> idApellido;

    @FXML
    private TableColumn<Patient, String> idDni;

    @FXML
    private TableColumn<Patient, String> idEnfermedad;

    @FXML
    private TableColumn<Patient, String> idNombre;

    @FXML
    private TableColumn<Patient, String> idOperacion;

    @FXML
    private TableView<Patient> tableOperation;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableOperation.setEditable(true);

        idDni.setCellValueFactory(new PropertyValueFactory<>("dni"));
        idNombre.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        idApellido.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        idEnfermedad.setCellValueFactory(new PropertyValueFactory<>("medicalIllness"));
        idOperacion.setCellValueFactory(new PropertyValueFactory<>("dni"));

        tableOperation.setItems(observableList);

    }

    ObservableList<Patient> observableList = FXCollections.observableArrayList(PatientDAO.getSurgicalOperation());

    public void switchToSceneMain(ActionEvent event) {
        //Volvemos al menú principal
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Menú principal");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
