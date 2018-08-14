package MODELO;


import MODELO.persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dianapi
 */
public class estudiante extends persona{
    
    private String codigo;
    private String carrera;

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
        return  "estudiante: " + super.toString() +"\n" + "codigo: " + codigo + "\n" +" carrera: " + carrera + "\n";
    }
    
    
    
}
