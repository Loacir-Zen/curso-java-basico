package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o ano: ");
		int ano = scan.nextInt();
		
		if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.print("Ano " + ano + " é bissexto");
		} else {
			System.out.print("Não é bissexto");
		}

	}

}
