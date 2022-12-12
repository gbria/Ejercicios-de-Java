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

public class NurseController implements Initializable {
    @FXML
    private TableView<Nurse> tableNurse;
    @FXML
    private TableColumn<Nurse, String> idDni;
    @FXML
    private TableColumn<Nurse, String> idNombre;
    @FXML
    private TableColumn<Nurse, String> idApellido;
    @FXML
    private TableColumn<Nurse, String> idEmail;
    @FXML
    private TableColumn<Nurse, String> idHorario;
    @FXML
    private TableColumn<Nurse, Integer> idTelefono;
    @FXML
    private TextField txtDni;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtFName;
    @FXML
    private TextField txtLName;
    @FXML
    private TextField txtPhone;
    @FXML
    private TextField txtTime;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Convertimos la tableView en editable
        tableNurse.setEditable(true);

        //Dni no se puede modificar, ya que es una PK
        idDni.setCellValueFactory(new PropertyValueFactory<>("dni"));

        //El resto de campos serán editables
        idNombre.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        idNombre.setCellFactory(TextFieldTableCell.forTableColumn());
        idNombre.setOnEditCommit(
                new EventHandler<CellEditEvent<Nurse, String>>() {
                    @Override
                    public void handle(CellEditEvent<Nurse, String> t) {
                        Nurse nurseTmp = ((Nurse) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        nurseTmp.setFirstName(t.getNewValue());
                        //Llamamos al método update para actualizar
                        NurseDAO.updateNurse(nurseTmp);
                    }
                }
        );

        idApellido.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        idApellido.setCellFactory(TextFieldTableCell.forTableColumn());
        idApellido.setOnEditCommit(
                new EventHandler<CellEditEvent<Nurse, String>>() {
                    @Override
                    public void handle(CellEditEvent<Nurse, String> t) {
                        Nurse nurseTmp = ((Nurse) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        nurseTmp.setLastName(t.getNewValue());

                        NurseDAO.updateNurse(nurseTmp);
                    }
                }
        );

        idEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        idEmail.setCellFactory(TextFieldTableCell.forTableColumn());
        idEmail.setOnEditCommit(
                new EventHandler<CellEditEvent<Nurse, String>>() {
                    @Override
                    public void handle(CellEditEvent<Nurse, String> t) {
                        Nurse nurseTmp = ((Nurse) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        nurseTmp.setEmail(t.getNewValue());

                        NurseDAO.updateNurse(nurseTmp);
                    }
                }
        );

        idHorario.setCellValueFactory(new PropertyValueFactory<>("timeTable"));
        idHorario.setCellFactory(TextFieldTableCell.forTableColumn());
        idHorario.setOnEditCommit(
                new EventHandler<CellEditEvent<Nurse, String>>() {
                    @Override
                    public void handle(CellEditEvent<Nurse, String> t) {
                        Nurse nurseTmp = ((Nurse) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        nurseTmp.setTimeTable(t.getNewValue());

                        NurseDAO.updateNurse(nurseTmp);
                    }
                }
        );

        idTelefono.setCellValueFactory(new PropertyValueFactory<>("phone"));
        idTelefono.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        idTelefono.setOnEditCommit(
                new EventHandler<CellEditEvent<Nurse, Integer>>() {
                    @Override
                    public void handle(CellEditEvent<Nurse, Integer> t) {
                        Nurse nurseTmp = ((Nurse) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        );
                        nurseTmp.setPhone(t.getNewValue());

                        NurseDAO.updateNurse(nurseTmp);
                    }
                }
        );

        tableNurse.setItems(observableList);
    }

    //Los datos que deben mostrarse
    ObservableList<Nurse> observableList = FXCollections.observableArrayList(NurseDAO.getHospitalNurse());

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

    public void addNurse(ActionEvent event) {
        //Instanciamos nurse
        Nurse nurse = new Nurse();

        //Rellenamos datos a traves de textFields
        nurse.setDni(txtDni.getText());
        nurse.setFirstName(txtFName.getText());
        nurse.setLastName(txtLName.getText());
        nurse.setEmail(txtEmail.getText());
        nurse.setPhone(Integer.parseInt(txtPhone.getText()));
        nurse.setTimeTable(txtTime.getText());

        //Añadimos los datos a la BD
        NurseDAO.addNurse(nurse);

        //Mostramos el añadido (refresh)
        observableList.add(nurse);

        //Limpiamos txtFields
        txtDni.clear();
        txtFName.clear();
        txtLName.clear();
        txtEmail.clear();
        txtPhone.clear();
        txtTime.clear();
    }

    public void deleteNurse(ActionEvent event) {
        tableNurse.getItems().removeAll(tableNurse.getSelectionModel().getSelectedItem());
        String dni = tableNurse.getSelectionModel().getSelectedItem().getDni();

        NurseDAO.deleteNurse(dni);
    }
}