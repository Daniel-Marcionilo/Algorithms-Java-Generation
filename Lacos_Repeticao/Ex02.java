/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
package Lacos_Repeticao;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		int n, qtdePar = 0, qtdeImpar = 0;

		Scanner leitor = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d° valor: ", i+1);
			n = leitor.nextInt();

			if (n % 2 != 0) {
				qtdeImpar++;
			} else {
				qtdePar++;
			}
		}
		System.out.println("\nQuantidade de números ímpares: " + qtdeImpar);
		System.out.println("Quantidade de números pares: " + qtdePar);
	}
}
