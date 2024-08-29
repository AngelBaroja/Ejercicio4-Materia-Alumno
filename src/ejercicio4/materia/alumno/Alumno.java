/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.materia.alumno;

import java.util.HashSet;

/**
 *
 * @author El Angel
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> listaMateria;
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        listaMateria = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + " / " + apellido + ", " + nombre; 
    }

    public HashSet<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(HashSet<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
    
    public void agregarMateria(Materia materia){
        listaMateria.add(materia);
    }
    
    public int cantidadMaterias(){
        return listaMateria.size();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
