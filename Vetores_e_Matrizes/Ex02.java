/*
 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente
 * tamb�m quantas foram as ocorr�ncias da maior pontua��o.
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

		System.out.printf("\n\nQtde ocorr�ncias maior pontua��o: %d", ocorrenciasMaior);
		System.out.printf("\nM�dia Aritm�tica: %d", media);
	}

}
