/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
package Lacos_Repeticao;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, soma = 0;
		do {
			System.out.print("\nDigite um n�mero inteiro: ");
			x = leitor.nextInt();
			soma += x;
		}while(x != 0);
		
		System.out.println("\nSomat�rio dos valores digitados: "+ soma);
		System.out.println("\nFim do Programa");
	}

}
