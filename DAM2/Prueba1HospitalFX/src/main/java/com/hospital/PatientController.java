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

public class PatientController implements Initializable {
    @FXML
    private TableView<Patient> tablePatient;

    @FXML
    private TableColumn<Patient, String> idAlergia;

    @FXML
    private TableColumn<Patient, String> idApellido;

    @FXML
    private TableColumn<Patient, String> idDni;

    @FXML
    private TableColumn<Patient, String> idEmail;

    @FXML
    private TableColumn<Patient, String> idEnfermedad;

    @FXML
    private TableColumn<Patient, String> idGenero;

    @FXML
    private TableColumn<Patient, String> idNacimiento;

    @FXML
    private TableColumn<Patient, String> idNombre;

    @FXML
    private TableColumn<Patient, String> idOperacion;

    @FXML
    private TableColumn<Patient, String> idPrescripcion;

    @FXML
    private TableColumn<Patient, String> idPruebas;

    @FXML
    private TableColumn<Patient, String> idSangre;

    @FXML
    private TableColumn<Patient, Integer> idTelefono;

    @FXML
    private TextField txtAllergy;

    @FXML
    private TextField txtBType;

    @FXML
    private TextField txtDBirth;

    @FXML
    private TextField txtDni;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFName;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtLName;

    @FXML
    private TextField txtMIllness;

    @FXML
    private TextField txtMTest;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtPrescription;

    @FXML
    private TextField txtSOp;

    private Stage stage;
    private Scene scene;
    private Parent root;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Convertimos la tableView en editable
        tablePatient.setEditable(true);

        //Dni no se puede modificar, ya que es una PK
        idDni.setCellValueFactory(new PropertyValueFactory<>("dni"));

        //El resto de campos serán editables
        idNombre.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        idNombre.setCellFactory(TextFieldTableCell.forTableColumn());
        idNombre.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setFirstName(t.getNewValue());
                        //Llamamos al método update para actualizar
                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idApellido.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        idApellido.setCellFactory(TextFieldTableCell.forTableColumn());
        idApellido.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setLastName(t.getNewValue());
                        //Llamamos al método update para actualizar
                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idNacimiento.setCellValueFactory(new PropertyValueFactory<>("dateBirth"));
        idNacimiento.setCellFactory(TextFieldTableCell.forTableColumn());
        idNacimiento.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setDateBirth(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idGenero.setCellValueFactory(new PropertyValueFactory<>("gender"));
        idGenero.setCellFactory(TextFieldTableCell.forTableColumn());
        idGenero.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setGender(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idSangre.setCellValueFactory(new PropertyValueFactory<>("bloodType"));
        idSangre.setCellFactory(TextFieldTableCell.forTableColumn());
        idSangre.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setBloodType(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idTelefono.setCellValueFactory(new PropertyValueFactory<>("phone"));
        idTelefono.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        idTelefono.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, Integer> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setPhone(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        idEmail.setCellFactory(TextFieldTableCell.forTableColumn());
        idEmail.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setEmail(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idAlergia.setCellValueFactory(new PropertyValueFactory<>("allergy"));
        idAlergia.setCellFactory(TextFieldTableCell.forTableColumn());
        idAlergia.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setAllergy(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idEnfermedad.setCellValueFactory(new PropertyValueFactory<>("medicalIllness"));
        idEnfermedad.setCellFactory(TextFieldTableCell.forTableColumn());
        idEnfermedad.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setMedicalIllness(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idPruebas.setCellValueFactory(new PropertyValueFactory<>("medicalTest"));
        idPruebas.setCellFactory(TextFieldTableCell.forTableColumn());
        idPruebas.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setMedicalTest(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idPrescripcion.setCellValueFactory(new PropertyValueFactory<>("prescription"));
        idPrescripcion.setCellFactory(TextFieldTableCell.forTableColumn());
        idPrescripcion.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setPrescription(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        idOperacion.setCellValueFactory(new PropertyValueFactory<>("surgicalOp"));
        idOperacion.setCellFactory(TextFieldTableCell.forTableColumn());
        idOperacion.setOnEditCommit(
                new EventHandler<CellEditEvent<Patient, String>>() {
                    @Override
                    public void handle(CellEditEvent<Patient, String> t) {
                        Patient patientTmp = ((Patient) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        patientTmp.setSurgicalOp(t.getNewValue());

                        PatientDAO.updatePatient(patientTmp);
                    }
                }
        );

        tablePatient.setItems(observableList);
    }

    //Los datos que deben mostrarse
    ObservableList<Patient> observableList = FXCollections.observableArrayList(PatientDAO.getHospitalPatients());

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

    public void addPatient(ActionEvent event) {
        //Instanciamos patient
        Patient patient = new Patient();

        //Rellenamos datos a traves de textFields
        patient.setDni(txtDni.getText());
        patient.setFirstName(txtFName.getText());
        patient.setLastName(txtLName.getText());
        patient.setDateBirth(txtDBirth.getText());
        patient.setGender(txtGender.getText());
        patient.setBloodType(txtBType.getText());
        patient.setPhone(Integer.parseInt(txtPhone.getText()));
        patient.setEmail(txtEmail.getText());
        patient.setAllergy(txtAllergy.getText());
        patient.setMedicalIllness(txtMIllness.getText());
        patient.setMedicalTest(txtMTest.getText());
        patient.setPrescription(txtPrescription.getText());
        patient.setSurgicalOp(txtSOp.getText());

        //Añadimos los datos a la BD
        PatientDAO.addPacient(patient);

        //Mostramos el añadido (refresh)
        observableList.add(patient);

        //Limpiamos txtFields
        txtDni.clear();
        txtFName.clear();
        txtLName.clear();
        txtDBirth.clear();
        txtGender.clear();
        txtBType.clear();
        txtPhone.clear();
        txtPhone.clear();
        txtEmail.clear();
        txtAllergy.clear();
        txtMIllness.clear();
        txtMTest.clear();
        txtPrescription.clear();
        txtSOp.clear();
    }

    public void deletePatient(ActionEvent event) {
        tablePatient.getItems().removeAll(tablePatient.getSelectionModel().getSelectedItem());
        String dni = tablePatient.getSelectionModel().getSelectedItem().getDni();

        PatientDAO.deletePatient(dni);
    }
}


