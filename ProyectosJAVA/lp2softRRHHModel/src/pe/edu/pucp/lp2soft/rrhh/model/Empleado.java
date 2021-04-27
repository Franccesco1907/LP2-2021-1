/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.lp2soft.rrhh.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Franccesco
 */
public class Empleado extends Persona implements Serializable {

    private String cargo;
    private double sueldo;
    private Area area;
    public Empleado(){
    }
    
    public Empleado(String nombreCompleto, String DNI, Date fecha_nacimiento, int edad, char genero, String cargo, double sueldo, Area area) {
        super(nombreCompleto, DNI, fecha_nacimiento, edad, genero);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.area = area;
    }
        /*
    public Empleado(int idPersona, String nombreCompleto, String DNI, String cargo, double sueldo) {
        super(idPersona, nombreCompleto, DNI);
        if (cargo.length() < 25) {
            this.cargo = String.format("%-25s", cargo);
        } else {
            this.cargo = cargo.substring(0, 25);  
        }
        this.sueldo = sueldo;
    }
    */
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return getIdPersona() + " " + getNombreCompleto() + " " + cargo;
    }
    
    public String consultarDatos() {
        return getNombreCompleto();
    }
}
