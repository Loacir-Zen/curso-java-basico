package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com preço do pão: ");
		double precoPao = scan.nextDouble();
		
		for(int i=1; i<=50; i++) {
			System.out.println(i + " - R$ " + i * precoPao);
		}

	}

}
