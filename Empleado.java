/**
 * 
 */
package Evaluacion4;

/**
 * @author AULA01
 *
 */
public abstract class Empleado {
	/**
	 * 
	 * Clase empleado
	 */
	//Atributos
	private String nombre;
	private String dui;
	private int edad;
	private boolean casado;
	private double salario;
	//Constructores
	public Empleado() {
	}
	public Empleado(String nombre, String dui, int edad, boolean casado, double salario) {
		
	}
    //Metodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDui() {
		return dui;
	}
	public void setDui(String dui) {
		this.dui = dui;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Clasificacion
	public String Clasificacion(double edad) {
		String respuesta = "";
		if(edad == 21){
			respuesta = "Principiante";
		}else if(edad >= 22 && edad <= 35) {
			respuesta = "Intermedio";
		}else if(edad > 35) {
			respuesta = "Senior";
		}
		return respuesta;
	}
	//Imprimir datos
	public void imprimirDatos(String nombre, String dui, int edad, boolean casado, double salario) {
		 String nombreEmpleado = this.nombre = nombre;
		 String duiEmpleado = this.dui = dui;
		 int edadEmpleado = this.edad = edad;
		 boolean estadoEmpleado = this.casado = casado;
		 double salarioEmpleado = this.salario = salario;
		 double aumento =  this.aumentoSalario(this.salario);
		 String tipoEmpleado = this.Clasificacion(edad);
		 
		 System.out.println("El empleado: "+ nombreEmpleado);
		 System.out.println("Dui: "+ duiEmpleado);
		 System.out.println("Edad de:"+ edadEmpleado  );
		 //Estado civil
		 if(estadoEmpleado == true) {
			 System.out.println("Estado civil: casado");
		 }else {
			 System.out.println("Estado civil: soltero");
		 }
		 
		 System.out.println("salario base:"+salarioEmpleado);
		 System.out.println("clasificacion:"+tipoEmpleado);
		 System.out.println("salario con aumento:"+aumento);
		}
	//Aumento salario
	public double aumentoSalario(double salario) {
	       double aumento = 0.10;
	       double totalEfectivo = salario * aumento;
	       salario = salario + totalEfectivo;
	       return salario;
	}
}

