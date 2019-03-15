package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variável
		int metros, centimetros;
		Scanner xuxa = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o valor em metros: ");
		metros = xuxa.nextInt();
		
		//processamento
		centimetros = (metros * 100);
		
		//saída
		System.out.println(metros + " metros em centímetros é " + centimetros);
		
		xuxa.close();
		
		
	}

}
