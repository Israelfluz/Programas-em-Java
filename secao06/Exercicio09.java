package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//Variáveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("informe o índice de poluição: ");
		indice = teclado.nextFloat();
		
		//Processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção: Indústrias do 1º grupo devem suspender as atividade. ");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Atenção: Indústrias do 1º e 2º grupos devem suspender as atividade. ");
		}else if(indice >= 0.5) {
			System.out.println("Atenção: Todos os grupos devem suspender as atividades. ");
		}
		teclado.close();

	}

}
