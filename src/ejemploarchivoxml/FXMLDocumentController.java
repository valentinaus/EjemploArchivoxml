/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivoxml;

import MODELO.estudiante;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author diana.urrutia
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField nombre1;
    
    @FXML
    private TextField codigo1;
    
    @FXML
    private TextField correo1;
    
    @FXML
    private TextField carrera1;
    
    @FXML
    private TextField telefono1;
    
    @FXML
    private Button agregarestudiantes;
     
    @FXML
    private Button guardararchivo;
    
    @FXML
    private Label lnombre;
    
    @FXML
    private Label lcodigo;
     
    @FXML
    private Label lcorreo;
      
    @FXML
    private Label lcarrera;
       
    @FXML
    private Label ltelefono;
    
    
    LinkedList <estudiante> listaE;
    
    
    @FXML
    private void AgregarEstudiantes(ActionEvent event) {
        System.out.println("You clicked me!");

        String nombre = nombre1.getText();
        String correo = correo1.getText();
        String carrera = carrera1.getText();
        String telefono = telefono1.getText();
        String codigo = codigo1.getText();
        
        estudiante objE = new estudiante(codigo, carrera, nombre, correo, telefono);
        listaE.add(objE);
        
    }
    
    @FXML
    private void guardarXML(ActionEvent event) {
        
       estudiante objeV= new estudiante();
        
        boolean guardar = objeV.crearArchivoXML(listaE);
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        listaE= new LinkedList<>();
        
        
    }    
    
}
