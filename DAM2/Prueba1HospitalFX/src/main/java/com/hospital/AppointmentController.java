package com.hospital;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AppointmentController implements Initializable {
    @FXML
    private TableColumn<Appointment, Integer> idConsulta;

    @FXML
    private TableColumn<Appointment, String> idDoctor;

    @FXML
    private TableColumn<Appointment, String> idEnfermero;

    @FXML
    private TableColumn<Appointment, String> idFecha;

    @FXML
    private TableColumn<Appointment, String> idHora;

    @FXML
    private TableColumn<Appointment, Integer> idId;

    @FXML
    private TableColumn<Appointment, String> idPaciente;

    @FXML
    private TableView<Appointment> tableAppointment;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtDniDoctor;

    @FXML
    private TextField txtDniNurse;

    @FXML
    private TextField txtDniPatient;

    @FXML
    private TextField txtOffice;

    @FXML
    private TextField txtTimeHour;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Convertimos la tableView en editable
        tableAppointment.setEditable(true);

        //id no se puede modificar, ya que es una PK
        idId.setCellValueFactory(new PropertyValueFactory<>("id"));

        //El resto de campos serán editables
        idFecha.setCellValueFactory(new PropertyValueFactory<>("date"));
        idFecha.setCellFactory(TextFieldTableCell.forTableColumn());
        idFecha.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Appointment, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Appointment, String> t) {
                        Appointment appointmentTmp = ((Appointment) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        appointmentTmp.setDate(t.getNewValue());
                        //Llamamos al método update para actualizar
                        AppointmentDAO.updateAppointment(appointmentTmp);
                    }
                }
        );

        idHora.setCellValueFactory(new PropertyValueFactory<>("time"));
        idHora.setCellFactory(TextFieldTableCell.forTableColumn());
        idHora.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Appointment, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Appointment, String> t) {
                        Appointment appointmentTmp = ((Appointment) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        appointmentTmp.setTime(t.getNewValue());
                        //Llamamos al método update para actualizar
                        AppointmentDAO.updateAppointment(appointmentTmp);
                    }
                }
        );

        idPaciente.setCellValueFactory(new PropertyValueFactory<>("dniPatient"));
        idPaciente.setCellFactory(TextFieldTableCell.forTableColumn());
        idPaciente.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Appointment, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Appointment, String> t) {
                        Appointment appointmentTmp = ((Appointment) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        appointmentTmp.setPatient(t.getNewValue());
                        //Llamamos al método update para actualizar
                        AppointmentDAO.updateAppointment(appointmentTmp);
                    }
                }
        );


        idDoctor.setCellValueFactory(new PropertyValueFactory<>("dniDoctor"));
        idDoctor.setCellFactory(TextFieldTableCell.forTableColumn());
        idDoctor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Appointment, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Appointment, String> t) {
                        Appointment appointmentTmp = ((Appointment) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        appointmentTmp.setDoctor(t.getNewValue());
                        //Llamamos al método update para actualizar
                        AppointmentDAO.updateAppointment(appointmentTmp);
                    }
                }
        );

        idEnfermero.setCellValueFactory(new PropertyValueFactory<>("dniNurse"));
        idEnfermero.setCellFactory(TextFieldTableCell.forTableColumn());
        idEnfermero.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Appointment, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Appointment, String> t) {
                        Appointment appointmentTmp = ((Appointment) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        appointmentTmp.setNurse(t.getNewValue());
                        //Llamamos al método update para actualizar
                        AppointmentDAO.updateAppointment(appointmentTmp);
                    }
                }
        );

        idConsulta.setCellValueFactory(new PropertyValueFactory<>("docOffice"));
        idConsulta.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        idConsulta.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Appointment, Integer>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Appointment, Integer> t) {
                        Appointment appointmentTmp = ((Appointment) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        appointmentTmp.setDocOffice(t.getNewValue());

                        AppointmentDAO.updateAppointment(appointmentTmp);
                    }
                }
        );


        tableAppointment.setItems(observableList);
    }

    //Los datos que deben mostrarse
    ObservableList<Appointment> observableList = FXCollections.observableArrayList(AppointmentDAO.getHospitalAppointment());

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

    public void addAppointment(ActionEvent event) {
        //Instanciamos appointment
        Appointment appointment = new Appointment();

        //Rellenamos datos a traves de textFields
        appointment.setDate(txtDate.getText());
        appointment.setTime(txtTimeHour.getText());
        appointment.setPatient(txtDniPatient.getText());
        appointment.setDoctor(txtDniDoctor.getText());
        appointment.setNurse(txtDniNurse.getText());
        appointment.setDocOffice(Integer.parseInt(txtOffice.getText()));


        //Añadimos los datos a la BD
        AppointmentDAO.addAppointment(appointment);

        //Mostramos el añadido (refresh)
        observableList.add(appointment);

        //Limpiamos txtFields
        txtDate.clear();
        txtTimeHour.clear();
        txtDniPatient.clear();
        txtDniDoctor.clear();
        txtDniNurse.clear();
        txtOffice.clear();
    }

    public void deleteAppointment(ActionEvent event) {
        tableAppointment.getItems().removeAll(tableAppointment.getSelectionModel().getSelectedItem());
        Integer id = tableAppointment.getSelectionModel().getSelectedItem().getId();

        AppointmentDAO.deleteAppointment(id);

    }

}
