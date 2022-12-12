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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ConsultaPacienteController implements Initializable {
    @FXML
    private TableColumn<Appointment, String> idApellidos;

    @FXML
    private TableColumn<Patient, Integer> idConsulta;

    @FXML
    private TableColumn<Patient, String> idEnfermedad;

    @FXML
    private TableColumn<Appointment, String> idFecha;

    @FXML
    private TableColumn<Appointment, String> idNombre;

    @FXML
    private TableColumn<Patient, String> idPrescripcion;

    @FXML
    private TableColumn<Patient, String> idPruebas;

    @FXML
    private TableView<Appointment> tableQueryPatient;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtDniPatient;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableQueryPatient.setEditable(true);


        idNombre.setCellValueFactory(new PropertyValueFactory<>("firstNamePatient"));
        idApellidos.setCellValueFactory(new PropertyValueFactory<>("lastNamePatient"));
        idFecha.setCellValueFactory(new PropertyValueFactory<>("date"));
        idEnfermedad.setCellValueFactory(new PropertyValueFactory<>("medicalIllness"));
        idPruebas.setCellValueFactory(new PropertyValueFactory<>("medicalTest"));
        idPrescripcion.setCellValueFactory(new PropertyValueFactory<>("prescription"));

        tableQueryPatient.setItems(observableList);
    }

    ObservableList<Appointment> observableList=FXCollections.observableArrayList();
    @FXML
    void consultarPaciente(ActionEvent event) {
        observableList.removeAll();
        observableList.addAll(AppointmentDAO.getHospitalHistorialByPacientOfTimeEspecific(txtDniPatient.getText(),txtDate.getText()));

    }

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
