package Instituto;

public class Patio {
	String actividad;
	int cursoqueestan;
	int  tamano;
	
	public Patio(String actividad, int cursosqueestan, int tamano) {
		super();
		this.actividad = actividad;
		this.cursoqueestan = cursosqueestan;
		this.tamano = tamano;
	}
	public String getactividad() {
		return actividad;
	}
	public void setmarca(String actividad) {
		this.actividad = actividad;
	}
	public int getcursosqueestan() {
		return cursoqueestan;
	}
	public void setcursosqueestan(int cursosqueestan) {
		this.cursoqueestan = cursosqueestan;
	}
	public int gettamano() {
		return tamano;
	}
	public void settamano(int tamano) {
		this.tamano = tamano;
	}
	
	public void asignaturasquesedan() {
	}
	
	public void alumnosdescansan() {
	}
	
	
}

