package POO;
//Importar la clase
import POO.Persona;
//Herencia, se usa la palabra extends
public class Estudiante extends Persona {
	 //Atributos
	 private String institucion;
	 private String carrera;
	 
	 //Metodos
     public String estudiar() {
    	 return "estudiar";
     }	

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
