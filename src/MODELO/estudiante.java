package MODELO;

import MODELO.persona;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dianapi
 */
public class estudiante extends persona {

    private String codigo;
    private String carrera;

    public estudiante() {

    }

    public estudiante(String codigo, String carrera, String nombre, String correo, String telefono) {
        super(nombre, correo, telefono);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "estudiante: " + super.toString() + "\n" + "codigo: " + codigo + "\n" + " carrera: " + carrera + "\n";
    }

    public boolean crearArchivoXML(LinkedList<estudiante> listaE) {

        boolean g = false;

        try {

            Element universidad = new Element("universidad");

            Document doc = new Document(universidad);

            for (int i = 0; i < listaE.size(); i++) {
                Element estudiante = new Element("estudiante");

                estudiante.addContent(new Element("nombre").setText(listaE.get(i).getNombre()));

                estudiante.addContent(new Element("telefono").setText(listaE.get(i).getTelefono()));

                estudiante.addContent(new Element("correo").setText(listaE.get(i).getCorreo()));

                estudiante.addContent(new Element("carrera").setText(listaE.get(i).getCarrera()));

                estudiante.addContent(new Element("codigo").setText(listaE.get(i).getCodigo()));

                doc.getRootElement().addContent(estudiante);

            }
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("universidad.xml"));

            g = true;

           

        } catch (IOException io) {
            System.out.println(io.getMessage());
            g = false;
        }

        return g;

    }

}
