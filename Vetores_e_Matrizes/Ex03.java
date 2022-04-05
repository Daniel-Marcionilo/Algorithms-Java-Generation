/*
 * 3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes
N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes
N1 e N2.

 */

package Vetores_e_Matrizes;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];

		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		System.out.println("\nPopulando N1");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print("\nDigite um número: ");
				N1[l][c] = leitor.nextInt();
			}
		}
		System.out.println("\nPopulando N2");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print("\nDigite um número: ");
				N2[l][c] = leitor.nextInt();
			}
		}
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
			}
		}
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		
		System.out.println("\nImprimindo M1");
		
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(M1[l][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("\nImprimindo M2");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(M2[l][c] + "\t");
			}
			System.out.println();
		}
	}

}
