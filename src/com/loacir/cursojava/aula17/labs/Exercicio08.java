package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int soma = 0;
		
		for(int i = 0; i<num.length; i++) {
			System.out.println("Entre com o valor para i: ");
			num[i] = scan.nextInt();
			soma += num[i];
		}
		
		double media = soma / num.length;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);

	}

}
