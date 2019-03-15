/**
 * 
 */
package Evaluacion4;

/**
 * @author AULA01
 *
 */
import Evaluacion4.Empleado;
public class Programador extends Empleado {

	/**
	 * 
	 */
	public Programador () {
		// TODO Auto-generated constructor stub
	}
    //Atributos
	private int lineasDeCodigoPorHora = 0;
	private String lenguajeDominante = "";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Programador programador = new Programador();
		 programador.imprimirDatos("Juan", "778788788-8", 40, true, 600);
		 System.out.println("Lineas de codigo por hora: "+ (programador.lineasDeCodigoPorHora = 2000));
		 System.out.println("Lenguaje dominate: "+(programador.lenguajeDominante = "Java"));
		
		

	}

}
