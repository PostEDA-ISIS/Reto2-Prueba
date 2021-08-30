
public class HoraCatedra extends Profesor {
	String numHoras;
	int valorHora;

	public HoraCatedra( String nombre, String cedula, String numHoras,int valorHora) {
		super(nombre, cedula);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "Profesor Hora Catedra" + "\n\tNombre:" + nombre + "\n\tCedula:" + cedula + "\n\tNumero de horas:" + numHoras + "\n\tValor de la hora:" + valorHora;
	}
	
}