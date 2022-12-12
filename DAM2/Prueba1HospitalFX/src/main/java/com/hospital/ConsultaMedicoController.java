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


public class ConsultaMedicoController implements Initializable {
    @FXML
    private TableColumn<Appointment, Integer> idConsulta;

    @FXML
    private TableColumn<Appointment, String> idFecha;

    @FXML
    private TableColumn<Appointment, String> idHora;

    @FXML
    private TableColumn<Appointment, Integer> idId;

    @FXML
    private TableView<Appointment> tableAppointmentByDoctor;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtDniDoctor;


    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableAppointmentByDoctor.setEditable(true);


        idId.setCellValueFactory(new PropertyValueFactory<>("id"));
        idFecha.setCellValueFactory(new PropertyValueFactory<>("date"));
        idHora.setCellValueFactory(new PropertyValueFactory<>("time"));
        idConsulta.setCellValueFactory(new PropertyValueFactory<>("docOffice"));

        tableAppointmentByDoctor.setItems(observableList);
    }

    ObservableList<Appointment> observableList = FXCollections.observableArrayList();


    @FXML
    void consultarMedico(ActionEvent event) {
        observableList.removeAll();
        observableList.addAll(AppointmentDAO.getHospitalAppointmentByDoctor(txtDniDoctor.getText(), txtDate.getText()));
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
