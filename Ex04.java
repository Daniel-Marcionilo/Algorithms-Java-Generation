/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
   número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
   ímpar exiba o número elevado ao quadrado.
 */

package Atividades;

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n;

		System.out.print("Digite um número qualquer: ");
		n = leitor.nextInt();
		
		if(n % 2 != 0) {
			System.out.println("O número é ímpar!");
			System.out.println("Resultado ao quadrado = "+ (n * n));
		}
		else {
			System.out.println("O número é par!");
			System.out.printf("Raiz quadrada = "+ Math.sqrt(n));
		}
	}
}
