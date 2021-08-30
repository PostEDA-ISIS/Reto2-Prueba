
import java.util.ArrayList;
import java.util.Scanner;
//jdjdkd
public class Institucion {

	public static ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	
	public static String Input = "";
	
	public static void procesarComando(){
		Scanner sc = new Scanner(System.in);
		
		while(!Input.startsWith("3")){
			Input = sc.nextLine();
			
			if(Input.startsWith("1")){
				agregarProfesor();
			}
			
			if(Input.startsWith("2")){
				listarProfesores();
			}
			
		}
	}
	
	public static void agregarProfesor(){
		String [] Frag = Input.split("&");
		Profesor profesor;
		
		if(Frag[1].equalsIgnoreCase("Catedra")){
			profesor = new HoraCatedra(Frag[2], Frag[3], Frag[4], Integer.parseInt(Frag[5]));
			profesores.add(profesor);
		}

		if(Frag[1].equalsIgnoreCase("Completo")){
			profesor = new TiempoCompleto(Frag[2], Frag[3], Frag[4]);
			profesores.add(profesor);
		}
	}
	
	public static void listarProfesores(){
		System.out.println("***Listado de profesores***");
		
		for(Profesor profesor : profesores){
			System.out.println(profesor);
		}
	}
	
	public static void main(String[] args) {
		procesarComando();
	}

}