/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.actividad16_2;

import java.util.List;

/**
 *
 * @author DAW1
 */
public interface PersonasDAO {
    Persona añadirPersona(Persona nueva);
    void eliminarPersona(int id);
    void modificarPersona(Persona modificar);
    List<Persona> getPersonas();
    Persona getPersona(int id);
    Persona getPersona(String dni);
}
