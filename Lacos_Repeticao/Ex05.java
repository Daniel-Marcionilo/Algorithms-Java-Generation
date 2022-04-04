/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */
package Lacos_Repeticao;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, soma = 0;
		do {
			System.out.print("\nDigite um número inteiro: ");
			x = leitor.nextInt();
			soma += x;
		}while(x != 0);
		
		System.out.println("\nSomatório dos valores digitados: "+ soma);
		System.out.println("\nFim do Programa");
	}

}
