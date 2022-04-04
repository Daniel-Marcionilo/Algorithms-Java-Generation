
/*
 Faça um programa que entre com três números e coloque em ordem crescente.
*/
package Estrutura_Condicional;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.println("Digite um valor inteiro para n1: ");
		n1 = leitor.nextInt();
		 
		System.out.println("Digite um valor inteiro para n2: ");
		n2 = leitor.nextInt();
		
		System.out.println("Digite um valor inteiro para n3: ");
		n3 = leitor.nextInt();
				
		if(n1 <= n2 && n1 <= n3) {
			if(n2 <= n3) {
				System.out.println("Ordem crescente "+ n1 + ", " + n2 + ", " + n3 + ".");
			}
			else {
				System.out.println("Ordem crescente "+ n1 + ", " + n3 + ", " + n2 + ".");
			}
		}
		else if(n2 <= n1 && n2 <= n3) {
			if(n1 <= n3) {
				System.out.println("Ordem crescente "+ n2 + ", " + n1 + ", " + n3 + ".");
			}
			else {
				System.out.println("Ordem crescente "+ n2 + ", " + n3 + ", " + n1 + ".");
			}
		}
		else if(n3 <= n1 && n3 <= n2) {
			if(n1 < n2) {
				System.out.println("Ordem crescente "+ n3 + ", " + n1 + ", " + n2 + ".");
			}
			else {
				System.out.println("Ordem crescente "+ n3 + ", " + n2 + ", " + n1 + ".");
			}
		}
	}
}
