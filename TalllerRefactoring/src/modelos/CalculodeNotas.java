package modelos;

public class CalculodeNotas {

	
	//Calcula y devuelve la nota contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public static double CalcularNota(Libreta t){
        		
    			double notaInicial=0;
                double notaTeorico=(t.getNexamen()+t.getNdeberes()+t.getNlecciones())*0.80;
                double notaPractico=(t.getNtalleres())*0.20;
                notaInicial=notaTeorico+notaPractico;
 
        return notaInicial;
    }
    
    //Calcula y devuelve la nota total contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public static double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        
        notaTotal=(p.getMateria().getNotaInicial()+p.getMateria().getNotaFinal())/2;
 
        return notaTotal;
        
    }
}


