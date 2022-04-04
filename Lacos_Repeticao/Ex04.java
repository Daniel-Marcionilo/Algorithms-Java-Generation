
/*
 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
 * 	- o número de pessoas calmas; 
	- o número de mulheres nervosas; 
	- o número de homens agressivos; 
	- o número de outros calmos;
	- o número de pessoas nervosas com mais de 40 anos; 
	- o número de pessoas calmas com menos de 18 anos.
 */
package Lacos_Repeticao;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int cont = 0, idade, sexo, personalidade, qtdePessoasCalmas = 0, qtdeMulheresNervosas = 0;
		int qtdeHomensAgressivos = 0, qtdeOutrosCalmos = 0, qtdeNervosasMaiorQuarenta = 0, qtdeCalmosMenor = 0;

		System.out.println("Pesquisa - Características Psicológicas");
		while (cont < 7) {
			System.out.print("\nQual sua idade? ");
			idade = leitor.nextInt();

			System.out.println("\nQual o seu sexo?");
			System.out.println("   1 - Feminino");
			System.out.println("   2 - Masculino");
			System.out.println("   3 - Outros");
			System.out.print("Escolha uma das opções acima: ");
			sexo = leitor.nextInt();

			System.out.println("\nVocê se considera uma pessoa");
			System.out.println("   1 - Calma");
			System.out.println("   2 - Nervosa");
			System.out.println("   3 - Agressiva");
			System.out.print("Escolha uma das opções acima: ");
			personalidade = leitor.nextInt();

			if (personalidade == 1) {
				qtdePessoasCalmas++;
			}

			if (sexo == 1 && personalidade == 2) {
				qtdeMulheresNervosas++;
			}

			if (sexo == 2 && personalidade == 3) {
				qtdeHomensAgressivos++;
			}

			if (sexo == 3 && personalidade == 1) {
				qtdeOutrosCalmos++;
			}

			if (personalidade == 2 && idade > 40) {
				qtdeNervosasMaiorQuarenta++;
			}

			if (personalidade == 1 && idade < 18) {
				qtdeCalmosMenor++;
			}

			cont++;
		}
		
		System.out.println("\n\nNúmero de pessoas calmas: "+ qtdePessoasCalmas);
		System.out.println("Número de mulheres nervosas: "+ qtdeMulheresNervosas);
		System.out.println("Número de homens agressivos: "+ qtdeHomensAgressivos);
		System.out.println("Número de outros calmos: "+ qtdeOutrosCalmos);
		System.out.println("Número de nervosas com mais de 40 anos: "+ qtdeNervosasMaiorQuarenta);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+ qtdeCalmosMenor);
		
	}

}
