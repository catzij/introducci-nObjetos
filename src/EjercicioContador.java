package	src;
import java.util.*;
public class EjercicioContador{	

	Scanner read = new Scanner(System.in);

	public EjercicioContador(){		
	
		System.out.println("1. incremento");
		System.out.println("2. decremento");
		int seleccion = read.nextInt();
		System.out.println("ingrese inicio contador");		
		int inicio = read.nextInt();
		System.out.println("final contador");		
		int end = read.nextInt();

		if (seleccion == 1) {
			if (inicio<end) {
				String contar = "Incremento";
				mostraContador(contar,inicio,end);
				getIncremento(inicio,end);

			}else if (inicio>end) {
				System.out.println("si va a incrementar");
				System.out.println("el final debe ser mayor a donde empieza");				
				System.out.println("vuelva ingresar datos");
			}
		}
		if (seleccion == 2) {
			if (inicio>end) {
				String contar = "Decremento";
				mostraContador(contar,inicio,end);
				getDecremento(inicio,end);
							
			}else if (inicio<end) {
				System.out.println("si va a decrementar");
				System.out.println("el inicio debe ser mayor a donde finaliza");				
				System.out.println("vuelva ingresar datos");	
			}
		}
	}

	public void mostraContador(String contar, int inicio, int end){
		System.out.println("el contador va a "+contar);
		System.out.println("empezando en "+inicio);
		System.out.println("terminando en "+end);		
	}

	public void getIncremento(int inicio, int end){
		for (int i = inicio; i<=end ;i++ ) {
			System.out.print("# ["+i+"]");			
		}
	}

	public void getDecremento(int inicio, int end){
		for (int i = inicio; i>=end ;i-- ) {
			System.out.print(" # ["+i+"]");			
		}
	}	
}