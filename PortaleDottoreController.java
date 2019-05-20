/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elitis.Controller;

import elitis.Elitis;
import elitis.Dottore;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author powar
 */
public class PortaleDottoreController implements Initializable {

    @FXML
    private Label bentornato;
    @FXML
    private Button logout;
    @FXML
    private Label nome;
    @FXML
    private Label codfiscale;
    @FXML
    private Label email;
    @FXML
    private Label cognome;
    @FXML
    private Label nascita;
    @FXML
    private Label telefono;
    @FXML
    private Label nome1;
    private final Stage stage = Elitis.stage;
    public Dottore dottore = loginController.dottore;
    @FXML
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bentornato.setText("Bentornato " +dottore.getNome());
        nome.setText(dottore.getNome());
        email.setText(dottore.getEmail());
        cognome.setText(dottore.getCognome());
        telefono.setText(dottore.getNumTel());
        nascita.setText(dottore.getDataNascita());
        codfiscale.setText(dottore.getCodFiscale());
    }    

    @FXML
    private void paginaPrincipale(ActionEvent event) {
    }

    @FXML
    private void prenotaRicovero(ActionEvent event) {
    }

    @FXML
    private void gestionePrestazione(ActionEvent event) {
    }

    @FXML
    private void gestioneAccount(ActionEvent event) {
    }

    @FXML
    private void prenotaPrestazione(ActionEvent event) {
    }

    @FXML
    private void logout(ActionEvent event) {
    }
    
}
