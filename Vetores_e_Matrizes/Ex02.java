/*
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente
 * também quantas foram as ocorrências da maior pontuação.
 */
package Vetores_e_Matrizes;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Random lcto = new Random();

		int nSorteado, maior = 0, ocorrenciasMaior = 0, soma = 0, media = 0;

		int v[] = new int[10];

		for (int cont = 0; cont < v.length; cont++) {
			nSorteado = lcto.nextInt(6) + 1;
	
			v[cont] = nSorteado;
			soma += v[cont];

			if (maior < v[cont]) {
				maior = v[cont];
			}
		}
		media = soma / v.length;

		System.out.print("\n[");
		for (int i = 0; i < v.length; i++) {
			if (v[i] == maior) {
				ocorrenciasMaior++;
			}

			if (i == v.length-1) {
				System.out.print(v[i] + "]");
			} else {
				System.out.print(v[i] + ",");
			}
		}

		System.out.printf("\n\nQtde ocorrências maior pontuação: %d", ocorrenciasMaior);
		System.out.printf("\nMédia Aritmética: %d", media);
	}

}
