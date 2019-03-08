package POO;
public class Persona {
	 //Atributos
	  private String nombre;
	  private int edad;
	  private String sexo;
	   //Metodos
	   public Persona() { //Constructor		   
	   }
	   public String correr() {
		   return "Estoy corriendo";
	   }  
	   public String comer() {
		   return "Estoy comiendo";
	   } 
	   //Metodos acceso
	    public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return this.edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getSexo() {
			return this.sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}  	   
}
