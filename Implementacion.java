package POO;
import POO.Estudiante;
public class Implementacion {

	public static void main(String[] args) {
		//Objeto estudiante
		Estudiante estudiante = new Estudiante();
		
		//Asignacion de datos
		estudiante.setNombre("Juan Cashpa");
		estudiante.setEdad(16);
		estudiante.setSexo("M");
		estudiante.setCarrera("Informatica");
		estudiante.setInstitucion("Humboll");
		
		//Mostrar datos
		String nombre = estudiante.getNombre();
		int edad = estudiante.getEdad();
		String sexo = estudiante.getSexo();
		String institucion = estudiante.getInstitucion();
		String carrera = estudiante.getCarrera();
		
		String mensaje = "El estudiante: " + nombre + ", con la edad de: " +edad+ "  años y el genero de: " +sexo
				          + ", estudia en: "+institucion+", La carrera de : "+carrera;
		
		System.out.print(mensaje);

	}

}
