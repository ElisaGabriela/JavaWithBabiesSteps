// Multiplicador em JAVA

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //leitura
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A*B;
		
		System.out.println("Resultado da multiplicação = " + PROD );
	}
}
