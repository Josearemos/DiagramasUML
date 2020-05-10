package Instituto;

public class Examen {
	String nombrealumno;
	int nota;
	int numpreguntas;
	
	public Examen(String nombrealumno, int nota, int numpreguntas) {
		super();
		this.nombrealumno = nombrealumno;
		this.nota = nota;
		this.numpreguntas = numpreguntas;
	}
	public String getnombrealumno() {
		return nombrealumno;
		
	}public String setnombrealumno() {
		return nombrealumno;
	}
	
	public int getnota() {
		return nota;
	}
	public void setnota(int nota) {
		this.nota = nota;
	}
	public int getnupreguntas() {
		return numpreguntas;
	}
	public void setnumpreguntas(int numpreguntas) {
		this.numpreguntas = numpreguntas;
	}
	
	public void comprobarconocimiento() {
	}
	public void aprobarsuspenderexamenes(int nota){
		if(nota <= 5) {
			System.out.println("Aprobado");
		}else{
			System.out.println("Suspenso");
		}
	}

}
