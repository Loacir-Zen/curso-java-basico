package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int nun01 = scan.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int num02 = scan.nextInt();
		
		System.out.println("A soma é : " + (num02 + nun01));
	}

}
