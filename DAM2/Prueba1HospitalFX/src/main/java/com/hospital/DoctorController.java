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
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DoctorController implements Initializable {
    @FXML
    private TableView<Doctor> tableDoctor;
    @FXML
    private TableColumn<Doctor, String> idDni;
    @FXML
    private TableColumn<Doctor, String> idNombre;
    @FXML
    private TableColumn<Doctor, String> idApellido;
    @FXML
    private TableColumn<Doctor, String> idEspecialidad;
    @FXML
    private TableColumn<Doctor, String> idEmail;
    @FXML
    private TableColumn<Doctor, Integer> idTelefono;
    @FXML
    private TableColumn<Doctor, String> idHorario;
    @FXML
    private TableColumn<Doctor, Integer> idHoras;

    @FXML
    private TextField txtDni;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFName;

    @FXML
    private TextField txtHour;

    @FXML
    private TextField txtLName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtSpeciality;

    @FXML
    private TextField txtTime;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Convertimos la tableView en editable
        tableDoctor.setEditable(true);

        //Dni no se puede modificar, ya que es una PK
        idDni.setCellValueFactory(new PropertyValueFactory<>("dni"));

        //El resto de campos serán editables
        idNombre.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        idNombre.setCellFactory(TextFieldTableCell.forTableColumn());
        idNombre.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, String>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, String> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setFirstName(t.getNewValue());
                        //Llamamos al método update para actualizar
                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        idApellido.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        idApellido.setCellFactory(TextFieldTableCell.forTableColumn());
        idApellido.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, String>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, String> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setLastName(t.getNewValue());

                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        idEspecialidad.setCellValueFactory(new PropertyValueFactory<>("speciality"));
        idEspecialidad.setCellFactory(TextFieldTableCell.forTableColumn());
        idEspecialidad.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, String>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, String> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setSpeciality(t.getNewValue());

                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        idEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        idEmail.setCellFactory(TextFieldTableCell.forTableColumn());
        idEmail.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, String>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, String> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setEmail(t.getNewValue());

                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        idTelefono.setCellValueFactory(new PropertyValueFactory<>("phone"));
        idTelefono.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        idTelefono.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, Integer> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setPhone(t.getNewValue());

                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        idHorario.setCellValueFactory(new PropertyValueFactory<>("timetable"));
        idHorario.setCellFactory(TextFieldTableCell.forTableColumn());
        idHorario.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, String>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, String> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setTimetable(t.getNewValue());

                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        idHoras.setCellValueFactory(new PropertyValueFactory<>("extraHour"));
        idHoras.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        idHoras.setOnEditCommit(
                new EventHandler<CellEditEvent<Doctor, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Doctor, Integer> t) {
                        Doctor doctorTmp = ((Doctor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        doctorTmp.setExtraHour(t.getNewValue());

                        DoctorDAO.updateDoctor(doctorTmp);
                    }
                }
        );

        tableDoctor.setItems(observableList);
    }

    //Los datos que deben mostrarse
    ObservableList<Doctor> observableList = FXCollections.observableArrayList(DoctorDAO.getHospitalDoctors());

    public void switchToSceneMain(ActionEvent event) {
        //Volvemos al menú principal
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Menu principal");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addDoctor(ActionEvent event) {
        //Instanciamos doctor
        Doctor doctor = new Doctor();

        //Rellenamos datos a traves de textFields
        doctor.setDni(txtDni.getText());
        doctor.setFirstName(txtFName.getText());
        doctor.setLastName(txtLName.getText());
        doctor.setSpeciality(txtSpeciality.getText());
        doctor.setEmail(txtEmail.getText());
        doctor.setPhone(Integer.parseInt(txtPhone.getText()));
        doctor.setTimetable(txtTime.getText());
        doctor.setExtraHour(Integer.parseInt(txtHour.getText()));

        //Añadimos los datos a la BD
        DoctorDAO.addDoctor(doctor);

        //Mostramos el añadido (refresh)
        observableList.add(doctor);

        //Limpiamos txtFields
        txtDni.clear();
        txtFName.clear();
        txtLName.clear();
        txtSpeciality.clear();
        txtEmail.clear();
        txtPhone.clear();
        txtTime.clear();
        txtHour.clear();
    }

    public void deleteDoctor(ActionEvent event) {
        tableDoctor.getItems().removeAll(tableDoctor.getSelectionModel().getSelectedItem());
        String dni = tableDoctor.getSelectionModel().getSelectedItem().getDni();

        DoctorDAO.deleteDoctor(dni);
        System.out.println(dni);

    }
}
