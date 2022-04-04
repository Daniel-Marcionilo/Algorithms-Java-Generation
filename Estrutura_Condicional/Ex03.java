/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:

	10-14 infantil
	15-17 juvenil
	18-25 adulto
*/
package Estrutura_Condicional;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		byte idade;
		System.out.print("Digite sua idade: ");
		idade = leitor.nextByte();

		if (idade >= 10 && idade <= 14) {
			System.out.println("Você pertence à categoria INFANTIL");
		}
		if (idade >= 15 && idade <= 17) {
			System.out.println("Você pertence à categoria JUVENIL");
		}
		if (idade >= 18 && idade <= 25) {
			System.out.println("Você pertence à categoria ADULTO");
		}
	}
}
