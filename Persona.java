package POO;
public class Persona {
	 //Atributos
	 public String nombre;
	 public int edad;
	 public String sexo;
	 //Metodos
	   //Metodos de acceso
	   public Persona() {
		   
	   }
	   public String correr() {
		   return "Estoy corriendo";
	   }  
	   public String comer() {
		   return "Estoy comiendo";
	   } 
	 //Metodos de la clase o comunes
		public static void main(String[] args) {
			       //objeto   //instancia	
			Persona persona = new Persona();

			String respuesta =  persona.correr();
			System.out.println(respuesta);
			persona.edad = 19;
			System.out.println(persona.edad);
								
		}
	   
}
