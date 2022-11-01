package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		while(n>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			n =sc.nextInt();
		}
		
		
		int [][] mat = new int [n][n];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				System.out.print("Elemento ["+(i)+","+(j)+"]:");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ");
		
		
		int sun = 0;
		for (int i=0;i<mat.length;i++) {
			
			for (int j=0;j<mat[i].length;j++) {
				if (i<j) {
					sun += mat[i][j];
				}
			}
		}
		System.out.println(sun);
		
		
		
		
		
		sc.close();

	}

}
