package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		double notas = 0, somaNotas = 0;
		char op = 'S';
		
		do {
			System.out.print("Digite uma nota: ");
			notas = scan.nextDouble();
			somaNotas += notas;
			count ++;
			System.out.print("Deseja informar outra nota: ");
			op = scan.next().charAt(0);
		}while(op == 'S' || op == 's');
		
		System.out.println("A média é: " + (somaNotas / count));

	}

}
