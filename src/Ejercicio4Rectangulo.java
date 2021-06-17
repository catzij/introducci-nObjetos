package src;
public class Ejercicio4Rectangulo{

	public Ejercicio4Rectangulo(int ancho, int largo){

		if (ancho == largo) {
			System.out.println("el ancho y largo son iguales");
			System.out.println("entonces no es un rectangulo");
		}
		int area = calcularArea(ancho,largo);
		int perimetro=calcularPerimetro(ancho,largo);

		System.out.println("el area es      "+area);
		System.out.println("el perimetro es "+perimetro);
	}

	public int calcularArea(int ancho, int largo){
		int area = ancho *largo;
		return area;
	}

	public int calcularPerimetro(int ancho, int largo){
		int perimetro = (2*ancho)+(2*largo);
		return perimetro;
	}

}