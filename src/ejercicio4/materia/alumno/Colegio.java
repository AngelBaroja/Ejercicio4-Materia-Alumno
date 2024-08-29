/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.materia.alumno;

import java.util.HashSet;

/**
 *
 * @author El Angel
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
        Materia materia1 = new Materia(1, 1, "Ingles");
        Materia materia2 = new Materia(2, 1, "Matematicas");
        Materia materia3= new Materia(3, 1, "Laboratorio");
        Materia materia4= new Materia(4, 1, "Web");
        
        
        Alumno alumno1= new Alumno(1001, "Lopez", "Martin");
        Alumno alumno2= new Alumno(1002, "Martinez", "Brenda");
        
        HashSet<Materia> listaMateria=new HashSet<>();
        
        listaMateria.add(materia1);
        listaMateria.add(materia2);
        listaMateria.add(materia3);
        listaMateria.add(materia4);
        
        HashSet<Alumno> listaAlumno=new HashSet<>();
        
        listaAlumno.add(alumno1);
        listaAlumno.add(alumno2);
        
        alumno1.agregarMateria(materia1);
        alumno1.agregarMateria(materia2);
        alumno1.agregarMateria(materia3);
        
        alumno2.agregarMateria(materia1);
        alumno2.agregarMateria(materia2);
        alumno2.agregarMateria(materia3);
        alumno2.agregarMateria(materia3);
        
        Pantalla a= new Pantalla(listaMateria, listaAlumno);
        a.setVisible(true);
        
    }
    
}
