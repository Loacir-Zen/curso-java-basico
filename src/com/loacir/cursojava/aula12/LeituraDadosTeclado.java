package com.loacir.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		double altura = 0.0;
		
		System.out.print("Digite seu nome completo: ");
		nome = scan.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		System.out.print("Digite seu primeiro nome: ");
		nome = scan.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Digite sua altura: ");
		altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);

		

	}

}
