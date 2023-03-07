package Ejercicio1;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		//inciso a
		
		System.out.println("Inciso a");
		System.out.print("la letra 'a' se encontro: ");
		System.out.print(IncisoA("Hola soy estudiante de Argentina programa", 'o'));
		System.out.println(" veces");
		System.out.println();
		
		//inciso b
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inciso b");
		System.out.println("ingrese el orden que del vector 0-> ascendente 1-> descendente");
		int orden = sc.nextInt();
		int[] vector = IncisoB(7,4,1,orden);
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		
		//inciso c
		
		Scanner ScanX= new Scanner(System.in);
		System.out.println("Inciso c");
		System.out.println("ingrese el numero X");
		int numeroX = ScanX.nextInt();
		int vector2[] = {7,4,1,5,8};
		
		int suma=Suma(vector2,numeroX);
		System.out.println(suma);
		
		sc.close();
		ScanX.close();
	}



	//INCISO A

	public static int IncisoA(String frase, char letra) {
		int contador = 0;
		for (int i=0; i< frase.length();i++) {
			if (frase.charAt(i) == letra) {
				contador++;
			}
		}
	
		return contador;
	
	}
	
	//INCISO B
	
	public static int[] IncisoB(int num1, int num2, int num3, int orden) {
		
		int[] vectorresultante = new int[3];
		
		vectorresultante[0]= num1;
		vectorresultante[1]= num2;
		vectorresultante[2]= num3;
		int aux=0;
		
		if (orden==0) {
			for (int i=0; i<vectorresultante.length; i++) {
				for (int j=i+1;j<vectorresultante.length;j++) {
					if (vectorresultante[i] < vectorresultante[j]) {
						aux=vectorresultante[i];
						vectorresultante[i]=vectorresultante[j];
						vectorresultante[j]=aux;
					}
				}
			}
		} else {
			for (int i=0; i<vectorresultante.length; i++) {
				for (int j=i+1;j<vectorresultante.length;j++) {
					if (vectorresultante[i] > vectorresultante[j]) {
						aux=vectorresultante[i];
						vectorresultante[i]=vectorresultante[j];
						vectorresultante[j]=aux;
					}
				}
			}
		}
		
		return vectorresultante;
	}
	
	//INCISO C
	
	public static int Suma(int[] vector2, int X) {
		int suma=0;
		for (int i =0; i<vector2.length;i++) {
			if (vector2[i]>X) {
				suma=suma+vector2[i];
			}
		}
		
		return suma;
	}
	
}