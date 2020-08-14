package modelos;

public class Libreta {
	
	double nexamen;
	double ndeberes;
	double nlecciones;
	double ntalleres;
	public Libreta(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
		this.nexamen = nexamen;
		this.ndeberes = ndeberes;
		this.nlecciones = nlecciones;
		this.ntalleres = ntalleres;
	}
	public double getNexamen() {
		return nexamen;
	}
	public double getNdeberes() {
		return ndeberes;
	}
	public double getNlecciones() {
		return nlecciones;
	}
	public double getNtalleres() {
		return ntalleres;
	}
	
	

}
