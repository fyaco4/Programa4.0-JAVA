import java.util.Scanner; 
public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		
		float ingresos;
		int vehiculos; int inmuebles; 
		boolean cuarta;
		int auxiliar;
		// Cuarta* hace referencia a la posesión de una embarcación, aeronave de lujo o activos societarios.
		
		System.out.print("Introducir ingresos mensuales: ");
		Scanner sc= new Scanner(System.in);
		ingresos= sc.nextInt();  
		System.out.print("Introducir cuantos vehiculos posee: ");

		vehiculos= sc.nextInt();  
		System.out.print("Introducir cuantos inmuebles posee: ");

		inmuebles= sc.nextInt();  
		System.out.println("¿Ústed cumple el requisito de la 4ta opción? 0(si), 1(no)");

		auxiliar= sc.nextInt();
		while (auxiliar < 0 || auxiliar > 1) {
			System.out.print("debe ingresar 0 para si o 1 para no: ");
			auxiliar= sc.nextInt();
		}
		
		if(auxiliar == 1) {
			cuarta=false;
		}else {
			cuarta=true;
		}
		
		if ((ingresos >= 489083) || (vehiculos>=3) || (inmuebles >=3) || (cuarta == true)) {
			System.out.println("Pertenece a la clase alta");
		} else {
			System.out.println(" no pertenece a la clase alta");
		}
	}

}
