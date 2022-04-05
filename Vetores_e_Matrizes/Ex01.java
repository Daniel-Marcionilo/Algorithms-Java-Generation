/*
 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
 * atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
 */
package Vetores_e_Matrizes;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		int v[] = new int[5];
		int maior = 0;

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um n�mero: ");
			v[i] = leitor.nextInt();
		}
		
		System.out.print("\n[");
		for (int i = 0; i < 5; i++) {
			if (maior < v[i]) {
				maior = v[i];
			}
			if(i == 4) {
				System.out.print(v[i]+ "]");
			}
			else{
				System.out.print(v[i]+ ",");
			}
		}

		System.out.println("\n\nMaior pontua��o: " + maior);
	}

}
