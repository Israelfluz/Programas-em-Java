package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//variáveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//procesamento
		if(numero > 0) {
			a = numero;
			
			//saída
			System.out.println(numero);
			
		}else {
			b = numero;
			
			//saída
			System.out.println(numero);
			
		}
		teclado.close();

	}

}
