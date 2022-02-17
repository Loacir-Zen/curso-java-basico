package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		for(int i = 0; i<=10; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}

	}

}
