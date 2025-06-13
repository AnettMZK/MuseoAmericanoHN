/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.interfazmuseo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class MaintenanceController implements Initializable {

    @FXML
    private TextField name_tf;
    @FXML
    private TextField location_tf;
    @FXML
    private TextField managername_tf;
    @FXML
    private TextField webURL_tf;
    @FXML
    private DatePicker foundationDate_dp;
    @FXML
    private ChoiceBox<?> typeMuseum_cb;
    @FXML
    private Button save_btn;
    @FXML
    private Button cancel_btn;
    @FXML
    private Label warning_lb;
    @FXML
    private Button edit_btn;
    @FXML
    private Button delete_btn;
    @FXML
    private TableView<?> museumRegister_tv;
    @FXML
    private TableView<?> roomsRegister_tv;
    @FXML
    private TableView<?> collectionsRegister_tv;
    @FXML
    private TableView<?> speciesRegister_tv;
    @FXML
    private TableView<?> themesRegister_tv;
    @FXML
    private Label text_lb111111;
    @FXML
    private TableView<?> pricesAndRates_tv;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
