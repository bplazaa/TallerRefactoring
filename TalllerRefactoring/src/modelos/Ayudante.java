package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    protected Estudiante est;
    public ArrayList<Paralelo> paralelos;

    public Ayudante(String nombre, String apellido, String matricula, String facultad, 
    		int edad, String direccion, String telefono){
    	
    	super(nombre, apellido, matricula, facultad, edad, direccion, telefono);
    }


    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
