/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.interfazmuseo;

import controllers.MuMuseosJpaController;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import persistence.MuMuseos;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class MaintenanceController implements Initializable {

    @FXML
    private TextField managername_tf;
    @FXML
    private DatePicker foundationDate_dp;
    @FXML
    private ChoiceBox<?> typeMuseum_cb;
    @FXML
    private TableView<MuMuseos> museumRegister_tv;
    @FXML
    private TableView<?> roomsRegister_tv;
    @FXML
    private TableView<?> collectionsRegister_tv;
    @FXML
    private TableView<?> speciesRegister_tv;
    @FXML
    private TableView<?> themesRegister_tv;
    @FXML
    private TableView<?> pricesAndRates_tv;
    @FXML
    private TextField museumName_tf;
    @FXML
    private TextField museumLocation_tf;
    @FXML
    private TextField museumWebURL_tf;
    @FXML
    private Button museumSave_btn;
    @FXML
    private Button museumCancel_btn;
    @FXML
    private Button museumEdit_btn;
    @FXML
    private Button museumDelete_btn;
    @FXML
    private TextField roomID_tf;
    @FXML
    private TextField roomName_tf;
    @FXML
    private Label museumWarning_lb;
    @FXML
    private TextArea roomDescription_ta;
    @FXML
    private Button roomSave_btn;
    @FXML
    private Button roomEdit_btn;
    @FXML
    private Button roomDelete_btn;
    @FXML
    private Button roomCancel_btn;
    @FXML
    private Label roomWarning_lb;
    @FXML
    private TextField collectionsName_tf;
    @FXML
    private TextField collectionsCentury_tf;
    @FXML
    private TextArea collectionsDescription_ta;
    @FXML
    private Button collectionsDelete_btn1;
    @FXML
    private Button collectionsEdit_btn;
    @FXML
    private Button collectionsSave_btn1;
    @FXML
    private Button collectionsCancel_btn;
    @FXML
    private Button speciesSave_btn;
    @FXML
    private Button speciesCancel_btn;
    @FXML
    private Button speciesDelete_btn;
    @FXML
    private Button speciesEdit_btn;
    @FXML
    private Button themesCancel_btn;
    @FXML
    private Button themesSave_btn;
    @FXML
    private Button themesEdit_btn;
    @FXML
    private Button themesDelete_btn;
    @FXML
    private Button pricesAndRatesDelete_btn;
    @FXML
    private Button pricesAndRatesEdit_btn;
    @FXML
    private Button pricesAndRatesCancel_btn;
    @FXML
    private Button pricesAndRatesSave_btn;
    @FXML
    private TextField scientificNameSpecies_tf;
    @FXML
    private TextField commonNameSpecies_tf;
    @FXML
    private Label collectionsWarning_lb;
    @FXML
    private TextField periodOfLife_tf;
    @FXML
    private TextField extinctionDate_tf;
    @FXML
    private TextArea speciesDescription_ta;
    @FXML
    private Label collectionsWarning_lb1;
    @FXML
    private TextField themesName_tf;
    @FXML
    private TextArea themesDescription_ta;
    @FXML
    private TextField themesPeriod_tf;
    @FXML
    private Label themesWarning_lb;
    @FXML
    private TextField generalPrice_tf;
    @FXML
    private TextField specialPrice_tf;
    @FXML
    private ChoiceBox<?> cardType_cb;
    @FXML
    private TextField commissions_tf;
    
     private MuMuseosJpaController MuseumJpa = new MuMuseosJpaController();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        uploadMuseumData();
    }    

    
    /* GESTION DE MUSEO */
    @FXML
    private void saveMuseumInfo(ActionEvent event) {
    }

    @FXML
    private void editMuseumInfo(ActionEvent event) {
    }

    @FXML
    private void deleteMuseumInfo(ActionEvent event) {
    }

    @FXML
    private void cancelMuseumInfo(ActionEvent event) {
    }
    
   public void uploadMuseumData() {
    museumRegister_tv.getColumns().clear();

    TableColumn<MuMuseos, Integer> id = new TableColumn<>("ID");
    id.setCellValueFactory(new PropertyValueFactory<>("idMuseo"));

    TableColumn<MuMuseos, String> nombre = new TableColumn<>("Nombre");
    nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

    TableColumn<MuMuseos, String> tipo = new TableColumn<>("Tipo");
    tipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));

    TableColumn<MuMuseos, String> ubicacion = new TableColumn<>("Ubicación");
    ubicacion.setCellValueFactory(new PropertyValueFactory<>("ubicacion"));

    TableColumn<MuMuseos, String> director = new TableColumn<>("Director");
    director.setCellValueFactory(new PropertyValueFactory<>("nombreDirector"));

    TableColumn<MuMuseos, LocalDate> fecha = new TableColumn<>("Fecha Fundación");
    fecha.setCellValueFactory(new PropertyValueFactory<>("fechaFundacion"));
    
    TableColumn<MuMuseos, String> sitioWeb = new TableColumn<>("Sitio Web");
    sitioWeb.setCellValueFactory(new PropertyValueFactory<>("sitioWeb"));

    museumRegister_tv.getColumns().addAll(id, nombre, tipo, ubicacion, director, fecha, sitioWeb);

    Collection museos = MuseumJpa.findMuseoEntities();
    ObservableList<MuMuseos> museosFX = FXCollections.observableArrayList(museos);
    museumRegister_tv.setItems(museosFX);
}

    
    
    /* GESTION DE SALAS */
    @FXML
    private void saveRoomInfo(ActionEvent event) {
    }

    @FXML
    private void editRoomInfo(ActionEvent event) {
    }

    @FXML
    private void deleteRoomInfo(ActionEvent event) {
    }

    @FXML
    private void cancelRoomInfo(ActionEvent event) {
    }
    
    public void uploadRoomsData() { }

    /* GESTION DE COLECCIONES */
    @FXML
    private void deleteCollectionsInfo(ActionEvent event) {
    }

    @FXML
    private void editCollectionsnfo(ActionEvent event) {
    }

    @FXML
    private void cancelCollectionsInfo(ActionEvent event) {
    }

    @FXML
    private void saveCollectionsInfo(ActionEvent event) {
    }
    
    /* GESTION DE ESPECIES */
    @FXML
    private void saveSpeciesInfo(ActionEvent event) {
    }

    @FXML
    private void cancelSpeciesInfo(ActionEvent event) {
    }

    @FXML
    private void deleteSpeciesInfo(ActionEvent event) {
    }

    @FXML
    private void editSpeciesInfo(ActionEvent event) {
    }
    
    public void uploadSpeciesData() { }

    /* GESTION DE TEMAS */
    @FXML
    private void cancelThemesInfo(ActionEvent event) {
    }

    @FXML
    private void saveThemesInfo(ActionEvent event) {
    }

    @FXML
    private void ediTthemesInfo(ActionEvent event) {
    }

    @FXML
    private void deleteThemesInfo(ActionEvent event) {
    }
    
    public void uploadThemesData() { }


    
    /* GESTION DE PRECIOS Y TARIFAS */
    @FXML
    private void deletePricesAndRatesInfo(ActionEvent event) {
    }

    @FXML
    private void editPricesAndRatesInfo(ActionEvent event) {
    }

    @FXML
    private void cancelPricesAndRatesInfo(ActionEvent event) {
    }

    @FXML
    private void savePricesAndRatesInfo(ActionEvent event) {
    }
    
    public void uploadPricesAndRatesData() { }

    
}
