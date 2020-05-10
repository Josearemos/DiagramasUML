package Instituto;

public class Curso {
	
	String aula;
	String profesor;
	int numeroalumnos;
	
	public Curso(String aula, String profesor, int numeroalumnos) {
		super();
		this.aula = aula;
		this.profesor = profesor;
		this.numeroalumnos = numeroalumnos;
	}
	public String getaula() {
		return aula;
	}
	public void setaula(String aula) {
		this.aula = aula;
	}
	public String getprofesor() {
		return profesor;
	}
	public void setprofesor(String profesor) {
		this.profesor = profesor;
	}
	public int getnumeroalumnos() {
		return numeroalumnos;
	}
	public void setnumeroalumnos(int numeroalumnos) {
		this.numeroalumnos = numeroalumnos;
	}
	
	public void danasignaturas() {
	}
	public void pasansiguientecurso() {
	}
}

