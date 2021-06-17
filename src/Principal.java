package src;
import java.util.*;


public class Principal{

	public static void main(String[] args){
		Principal principal = new Principal();
	}

	public Principal(){
		System.out.println("Ejercicio1");
		EjercicioContador contador = new EjercicioContador();
		System.out.println("Ejercicio2");
		Ejercicio2Cuadrado cuadrado = new Ejercicio2Cuadrado(10);
		

	}

}