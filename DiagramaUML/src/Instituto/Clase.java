package Instituto;

public class Clase {

		String numalumnos;
		String nombre;
		int numero;
		
		public Clase(String numalumnos, String nombre, int numero) {
			super();
			this.numalumnos = numalumnos;
			this.nombre = nombre;
			this.numero = numero;
		}
		public String getnumalumnos() {
			return numalumnos;
		}
		public void setnumalumnos(String alumnos) {
			this.numalumnos = alumnos;
		}
		public String nombre() {
			return nombre;
		}
		public void setnombre(String nombre) {
			this.nombre = nombre;
		}
		public int getnumero() {
			return numero;
		}
		public void setnumero(int numero) {
			this.numero = numero;
		}
		
		public void pasarrato(){
			
		}
		public void aprobarsuspenderexamenes(int nota){
			if(nota <= 5) {
				System.out.println("Aprobado");
			}else{
				System.out.println("Suspenso");
			}
		}
	}

	