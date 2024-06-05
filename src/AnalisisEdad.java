import java.util.*;
/*
 * Clase donde analizaremos el método
 */
public class AnalisisEdad {
/*
 * Método principal donde generaremos las edades
 */
	Scanner sc = new Scanner(System.in);

	private ArrayList<Integer> edades;
	int edad;

	
	public AnalisisEdad(ArrayList<Integer> edades ) {
		this.edades = edades;
	}
	public String comprobar(ArrayList<Integer> edades) {
		int menores = 0;
		int mayores = 0;
		int jubilados = 0;
		
		for(int i=0;i<edades.size();i++) {
			if(edades.get(i)<18) {
				menores = menores + 1;
			}else if (edades.get(i)>=18 && edades.get(i)<65) {
				mayores = mayores + 1;
			}else if (edades.get(i)>65) {
				jubilados = jubilados + 1;
			}
			
		}
		String mensaje = " menores de edad " + menores + " mayores de edad " + mayores + " jubilados " + jubilados;
		return mensaje;
	}
}
