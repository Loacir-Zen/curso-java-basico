package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		int num01 = scan.nextInt();
		
		System.out.print("Entre com o segundo número: ");
		int num02 = scan.nextInt();
		
		System.out.print("Entre com o terceiro número: ");
		int num03 = scan.nextInt();
		
		if ( num01 > num02 && num01 > num03) {
			System.out.println("O maior número é: " + num01);
		} else if ( num02 > num01 && num02 > num03) {
			System.out.println("O maior número é: " + num02);
		} else if ( num03 > num01 && num03 > num02) {
			System.out.println("O maior número é: " + num03);
		} else {
			System.out.println("Todos os números são iguais");
		}

	}

}
