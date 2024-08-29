/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.materia.alumno;

/**
 *
 * @author El Angel
 */
public class Materia {
    private int idMateria;
    private int año;
    private String nombre;

    public Materia(int idMateria, int año, String nombre) {
        this.idMateria = idMateria;
        this.año = año;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre+ " / Año: "+ año ;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
