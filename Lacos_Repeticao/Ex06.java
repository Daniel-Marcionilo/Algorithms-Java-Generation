/*
 * Escrever um programa que receba vários números inteiros no teclado.
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 * (DO...WHILE)
 */
package Lacos_Repeticao;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, soma = 0, cont = 0, media = 0;
		do {
			System.out.print("\nDigite um número inteiro: ");
			x = leitor.nextInt();
			if (x % 3 == 0 && x != 0) {
				soma += x;
				cont++;
			}
		} while (x != 0);
	

		media = soma / cont;

		System.out.printf("\nMédia dos números digitados múltiplos de 3: %d", media);
		System.out.println("\n\nFim do Programa");
	}
}
