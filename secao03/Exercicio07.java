package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//variáveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Qual é a sua altura? ");
		altura = teclado.nextFloat();
		
		//processamento
		peso_ideal = (float)(altura * 72.7) - 58; //o float em na forma cast
		
		//saída
		System.out.printf("Seu peso ideal seria %.2f", peso_ideal);
		
		teclado.close();
		

	}

}
