/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.actividad16_2;

/**
 *
 * @author DAW1
 */
public interface EventoDAO {
    Evento añadirEvento(Evento nuevo);
    void elminasEvent(int id);
    void modificarEvento(Evento evento);
    List<Evento> getEvento();
    Evento
}
