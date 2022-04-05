/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado.
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
 * (DO...WHILE)
 */
package Lacos_Repeticao;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, soma = 0, cont = 0, media = 0;
		do {
			System.out.print("\nDigite um n�mero inteiro: ");
			x = leitor.nextInt();
			if (x % 3 == 0 && x != 0) {
				soma += x;
				cont++;
			}
		} while (x != 0);
	

		media = soma / cont;

		System.out.printf("\nM�dia dos n�meros digitados m�ltiplos de 3: %d", media);
		System.out.println("\n\nFim do Programa");
	}
}
