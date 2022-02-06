package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor: ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("O número é positivo");
		} else if ( num < 0) {
			System.out.println("O número é negativo");
		} else {
			System.out.println("O número é igual a 0");
		}

	}

}
