
public abstract class Profesor {
	String nombre;
	String cedula;

	public Profesor(String nombre, String cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public abstract String toString(); //hola
	
}