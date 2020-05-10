package Instituto;

public class Instituto {
	
	String nombre;
	int cursos;
	String calle;
	
	public Instituto(String nombre, int cursos, String calle) {
		super();
		this.nombre = nombre;
		this.cursos = cursos;
		this.calle = calle;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getcalle() {
		return calle;
	}
	public void setcalle(String calle) {
		this.calle = calle;
	}
	public int getcursos() {
		return cursos;
	}
	public void setcursos(int cursos) {
		this.cursos = cursos;
	}
	
	public void ensenaralumno() {
	}
	public void contratarprofesor() {
	}
}

