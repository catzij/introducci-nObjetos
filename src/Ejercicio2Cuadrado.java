package src;

public class Ejercicio2Cuadrado{

	public Ejercicio2Cuadrado(int base){
		System.out.println("la base del cuadreado es "+base);
		int area=calcularArea(base);
		int perimetro= calcularPerimetro(base);
		System.out.println("el area es       "+area);
		System.out.println("el perimetro es  "+perimetro);
	}

	public int calcularArea(int base){
		int area = base * base;
		return area;
	}

	public int calcularPerimetro(int base){
		int perimetro = 4*base;
		return perimetro;
	}
}