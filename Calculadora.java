package POO;

public class Calculadora {
     //Atributos
	 //Metodos
	public int sumar(int n1, int n2) {
		int suma = 0;
		//Proceso
		suma = n1 + n2;
		//retorno
		return suma;
	}
	
	public int restar(int n1, int n2) {
		int resta = 0;
		//Proceso
		resta = n1 - n2;
		//retorno
		return resta;
	}
	
	public static void main(String[] args) {
		//objeto
		Calculadora calculadora = new Calculadora();
		
		int respuesta = calculadora.sumar(9, 10);
		int respuestaResta = calculadora.restar(9, 10);	
		
		System.out.println("El resultado de la sumatoria de 9 + 10  es: "+respuesta);
		System.out.println("El resultado de la resta de 9 - 10  es: "+respuestaResta);
	}
}
