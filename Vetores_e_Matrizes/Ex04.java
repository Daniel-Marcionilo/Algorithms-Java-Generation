
/*
 * 4.	Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal. 
 */
package Vetores_e_Matrizes;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int soma = 0, diagonal = 0;

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("\nDigite um n�mero: ");
				matriz[l][c] = leitor.nextInt();
				soma += matriz[l][c];
			}
		}
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz[l][c] + "\t");
			}
			System.out.println();
		}

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (l == c) {
					diagonal += matriz[l][c];
				}
			}
		}

		System.out.println("Somat�rio dos valores: " + soma);
		System.out.println("Somat�rio dos valores na diagonal principal: " + diagonal);

	}

}
