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
public class Persona implements Serializable{
    private int idPersona;
    private String nombreCompleto;
    private String DNI;
    private Date fecha_nacimiento;
    private int edad;
    private char genero;

    public Persona(){}

    public Persona(String nombreCompleto, String DNI, Date fecha_nacimiento, int edad, char genero) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
        this.genero = genero;
    }
    /*
    public Persona(int idPersona, String nombreCompleto, String DNI) {
        this.idPersona = idPersona;
        if(nombreCompleto.length() < 60)
            this.nombreCompleto = String.format("%-60s", nombreCompleto);
        else this.nombreCompleto = nombreCompleto.substring(0, 60); 
        
        if(nombreCompleto.length() < 8)
            this.DNI = String.format("%-8s", DNI);
        else this.DNI = DNI.substring(0, 8);
    }
*/
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
}
