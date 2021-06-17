package src;
import java.util.*;


public class Principal{

	public static void main(String[] args){
		Principal principal = new Principal();
	}

	public Principal(){
		System.out.println("");
		asterisco(40);
		System.out.println("Ejercicio1 Contador");
		asterisco(40);		
		EjercicioContador contador = new EjercicioContador();

		System.out.println("");
		asterisco(40);		
		System.out.println("Ejercicio2 Cuadrado");
		asterisco(40);		
		Ejercicio2Cuadrado cuadrado = new Ejercicio2Cuadrado(10);		

		System.out.println("");
		asterisco(40);
		System.out.println("Ejercicio3 Circulo");
		asterisco(40);		
		Ejercicio3Circulo cirulo = new Ejercicio3Circulo(5);

		System.out.println("");
		asterisco(40);
		System.out.println("Ejercicio4 Rectangulo");
		asterisco(40);		
		Ejercicio4Rectangulo rectangulo = new Ejercicio4Rectangulo(10,20);
		Ejercicio4Rectangulo rectangulo2 = rectangulo;
		

	}
	public void asterisco(int valor){

		for (int i =0;i<valor ;i++ ) {
			System.out.print("*");			
		}
			System.out.println("*");			

	}	

}