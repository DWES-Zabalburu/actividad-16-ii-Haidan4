/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad16_2;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private static int numPersonas = 0;
    private int idPersona;
    private String dni;
    private Date fechaNacimiento;
    private String password;
    private String Nombre;
    private String Apellido;
    private boolean mayorEdad;
    private List<Evento> listaEventos = new ArrayList<>();

    

    public Persona() {
        this.idPersona = numPersonas++;
    }

    public Persona(String dni, Date fechaNacimiento, String password, String Nombre, String Apellido, boolean mayorEdad) {
        this();
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.password = password;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idPersona;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.idPersona == other.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", password=" + password + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", mayorEdad=" + mayorEdad + '}';
    }
    
    
    
    public boolean isMayorEdad(){
        GregorianCalendar gcHoy = new GregorianCalendar();
        GregorianCalendar gcNacimiento = new GregorianCalendar();
        gcNacimiento.setTime(this.fechaNacimiento);
        int añoActual = gcHoy.get(Calendar.YEAR);
        int añoNacimiento = gcNacimiento.get(Calendar.YEAR);
        int edad = añoActual - añoNacimiento;
        if(gcHoy.get(Calendar.DAY_OF_YEAR)<gcNacimiento.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }
        return edad >= 18;
    }
    
    
}
