/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
   n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
   �mpar exiba o n�mero elevado ao quadrado.
 */

package Atividades;

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n;

		System.out.print("Digite um n�mero qualquer: ");
		n = leitor.nextInt();
		
		if(n % 2 != 0) {
			System.out.println("O n�mero � �mpar!");
			System.out.println("Resultado ao quadrado = "+ (n * n));
		}
		else {
			System.out.println("O n�mero � par!");
			System.out.printf("Raiz quadrada = "+ Math.sqrt(n));
		}
	}
}
