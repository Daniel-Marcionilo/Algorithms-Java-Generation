/*
Faça um programa que receba três inteiros e diga qual deles é o maior.
*/

package Estrutura_Condicional;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n1, n2, n3, maior;
		System.out.println("Digite um valor inteiro para n1: ");
		n1 = leitor.nextInt();
		 
		System.out.println("Digite um valor inteiro para n2: ");
		n2 = leitor.nextInt();
		
		System.out.println("Digite um valor inteiro para n3: ");
		n3 = leitor.nextInt();
		
		maior = n1;
		
		if(n2 > maior) {
			maior = n2;
		}
		
		if(n3 > maior) {
			maior = n3;
		}
		
		System.out.println("Maior número digitado: "+ maior);
				
	}

}
