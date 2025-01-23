/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad16_2;

import java.util.List;

/**
 *
 * @author DAW1
 */
public class PersonaMatriz implements PersonasDAO {

        private static Persona[] personas =new Persona[100];
        private static int numPersonas = 0;
        
    @Override
    public Persona añadirPersona(Persona nueva) {
        if(numPersonas < personas.length){
            personas[numPersonas] = nueva;
            numPersonas++;
        }
        return nueva;
    }

    @Override
    public void eliminarPersona(int id) {
        int i = buscarPersona(id);
        for(i=0; i<numPersonas && id != personas[i].getId(); i++);
        if(i < numPersonas){
            for(i=i+1; i<numPersonas; i++){
                personas[i-1] = personas[i];
            }
        numPersonas--;
        }
    }

    @Override
    public void modificarPersona(Persona modificar) {
        int posicion = buscarPersona(modificar.getIdPersona());
        if(posicion != -1){
            personas[posicion] = modificar;
        }
    }

    @Override
    public List<Persona> getPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona getPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona getPersona(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private int buscarPersona(int id){
        int i;
        for(i=0; i<numPersonas && 
            id != personas[i].getId(); i++);
        if (i < numPersonas){
            return i;
        }else{
            return -1;
        }
    }
    
}
