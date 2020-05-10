package Instituto;

public class Ordenador {
	String marca;
	int bateria;
	String alumnopertenece;
	
	public Ordenador(String marca, int bateria, String alumnopertenece) {
		super();
		this.marca = marca;
		this.bateria = bateria;
		this.alumnopertenece = alumnopertenece;
	}
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public int getbateria() {
		return bateria;
	}
	public void setbateria(int bateria) {
		this.bateria = bateria;
	}
	public String getalumnopertenece() {
		return alumnopertenece;
	}
	public void setalumnopertenece(String alumnopertenece) {
		this.alumnopertenece = alumnopertenece;
	}
	
	public void hacertrabajos() {
	}
	
	public void verpagweb() {
	}
	
	
}

