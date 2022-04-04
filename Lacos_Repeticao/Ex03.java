/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
*/

package Lacos_Repeticao;

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int totalVinte = 0, totalCinquenta = 0;
		byte idade;
		System.out.print("Digite a idade: ");
		idade = leitor.nextByte();

		while (idade != -99) {		
			if (idade < 21) {
				totalVinte++;
			}

			if (idade > 50) {
				totalCinquenta++;
			}
			
			System.out.print("Digite a idade: ");
			idade = leitor.nextByte();
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", totalVinte);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", totalCinquenta);
		System.out.println("\n\nFim do programa");
	}
}
