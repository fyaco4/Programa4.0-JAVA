import java.util.Scanner; 
public class Ejercicio1 {
	public static void main(String[] args) {
		//a.
		System.out.println("inciso a.");
		int numeroInicio = 5;
		int numeroFin = 14;
		int x=numeroInicio;
		
		while (x<=numeroFin) {
			System.out.println(x);
			x++;
		}
		
		//b.
		System.out.println(" ");
		System.out.println("inciso b.");
		x=numeroInicio;
		while (x<=numeroFin) {
			if (x%2==0) {
				System.out.println(x);
			}
			x++;
		}
		//c.
		System.out.println(" ");
		System.out.println("inciso c. ");
		System.out.println("Si desea ver números pares ingrese 0");
		System.out.println("Si desea ver numero impares ingrese 1");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();  
		while (a<0 || a>1) {
			System.out.println("Por favor, ingrese un numero del 0(pares) al 1(impares)");
			a= sc.nextInt();
		}
		x=numeroInicio;
		if(a==0) {
			while (x<=numeroFin) {
				if (x%2==0) {
					System.out.println(x);
				}
				x++;
			}
		} else {
			while (x<=numeroFin) {
				if (x%2==1) {
					System.out.println(x);
				}
				x++;
			}
		}
		//d.
		System.out.println(" ");
		System.out.println("inciso d. ");
		for (int i=numeroFin; i>numeroInicio; i--) {
			System.out.println(i);
		}
	}
}