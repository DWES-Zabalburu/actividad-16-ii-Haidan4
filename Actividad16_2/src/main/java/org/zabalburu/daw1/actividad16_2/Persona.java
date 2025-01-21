/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad16_2;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Persona {
        
    GregorianCalendar calendario = new GregorianCalendar();
    
    private int generarIdPersona = 0;
    private int idPersona;
    private String dni;
    private Calendar fechaNacimiento;
    private String Nombre;
    private String Apellido;
    private boolean mayorEdad;
    private List<Evento> listaEventos;

    public Persona(int idPersona, String dni, Calendar fechaNacimiento, String Nombre, String Apellido, boolean mayorEdad) {
        this.idPersona = generarIdPersona++;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.mayorEdad = mayorEdad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }
    
    public int getEdad(){
        return this.fechaNacimiento - GregorianCalendar.getInstance();
    
    }
    
}
