package Instituto;

public class Asignatura {
	String nombre;
	int curso;
	int numtemas;
	
	public Asignatura(String nombre, int curso, int numtemas) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.numtemas = numtemas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getnumtemas() {
		return numtemas;
	}
	public void setnumtemas(int numtemas) {
		this.numtemas = numtemas;
	}
	
	public void aprobarasignatura() {
	}
	
	public void profesorquelada() {
	}
	
	
}