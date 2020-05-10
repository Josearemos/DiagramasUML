package Instituto;

public class Libro {
	String nombre;
	String asignatura;
	int numpaginas;
	
	public Libro(String nombre,String asignatura, int numpaginas) {
		super();
		this.numpaginas = numpaginas;
		this.nombre = nombre;
		this.asignatura= asignatura;
	}
	public String getasignatura() {
		return asignatura;
	}
	public void setasignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String nombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public int getnumpaginas() {
		return numpaginas;
	}
	public void setnumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}
	
	public void numero() {
		System.out.println();
	}
	
	public void leerlibro(){
		
	}
	public void subrayarlibro(){

		}
	}

