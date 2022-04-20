package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Estudiante;
import ar.edu.unju.edm.model.Calculadora;
@SpringBootApplication
public class Ttp0CalaRocioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ttp0CalaRocioApplication.class, args);
		
		String nombre="Rocio";
		System.out.println("Hola" + nombre + " "+darnombre());
		Estudiante unEstudiante = new Estudiante ();
		unEstudiante.setDni("45763506");
		unEstudiante.setNombre("Rocio");
		unEstudiante.setApellido("Cala");
		System.out.println("el estudiante"+ unEstudiante.getNombre()+ " "+"dice hola");
		Calculadora unCalculadora = new Calculadora(); 
		unCalculadora.setN1(10);
		unCalculadora.setN2(5);
		System.out.println("El resultado de la suma es " + unCalculadora.sumaNumero());
		System.out.println("El resultado de la resta es " + unCalculadora.restaNumero());
		System.out.println("El resultado de la division es " + unCalculadora.divisionNumero());
		System.out.println("El resultado de la multiplicacion es " + unCalculadora.multiplicacionNumero());
		System.out.println("El resultado de la potencia es " + unCalculadora.potenciaNumero());
    }
	
	private static String darnombre() {
		String darnombre="Rocio";
		return darnombre;
	}
}
