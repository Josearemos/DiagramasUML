package Instituto;

public class Alumno {
	String nombre;
	String apellidos;
	int curso;
	
	public Alumno(String nombre, String apellidos ,int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public String getapellidos() {
		return apellidos;
	}
	public void setapellidos(String apellidos) {
		this.apellidos= apellidos;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}

	public void hacerexamen() {
		System.out.println("Examen Lengua");
	}
	
	public void hablarotroalumno() {
		System.out.println("hola");
	}
	
	

}
