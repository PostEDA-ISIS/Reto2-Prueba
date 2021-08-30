
public class TiempoCompleto extends Profesor {

	public TiempoCompleto(String nombre, String cedula , String escalafon) {
		super(nombre, cedula);
		this.escalafon = escalafon;
	}
	
	String escalafon;

	@Override
	public String toString() {
		return "Profesor Tiempo Completo" + "\n\tNombre:" + nombre + "\n\tCedula:" + cedula + "\n\tEscalafon:" + escalafon;
	}
	
}