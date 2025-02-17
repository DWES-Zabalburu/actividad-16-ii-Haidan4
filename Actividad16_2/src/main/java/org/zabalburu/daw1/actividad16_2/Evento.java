/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad16_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Evento {
    private static int generarIdEvento = 0;
    private int idEvento;
    private String descripcion;
    private Date fecha;
    private String lugar;
    private boolean mayorEdad;
    private double coste;
    private List<Persona> listaPersonas = new ArrayList<>();

    public Evento(int id, String descripcion, Date fecha, String lugar, boolean mayorEdad, double coste) {
        this.idEvento = generarIdEvento++;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mayorEdad = mayorEdad;
        this.coste = coste;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idEvento;
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
        final Evento other = (Evento) obj;
        return this.idEvento == other.idEvento;
    }

    @Override
    public String toString() {
        return "Evento{" + "idEvento=" + idEvento + ", descripcion=" + descripcion + ", fecha=" + fecha + ", lugar=" + lugar + ", mayorEdad=" + mayorEdad + ", coste=" + coste + '}';
    }
    
    
    
}
