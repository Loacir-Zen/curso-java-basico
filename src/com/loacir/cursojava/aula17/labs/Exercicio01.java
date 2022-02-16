package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota;
		
		do {
			System.out.print("Digite uma nota entre 0 até 10: ");
			nota = scan.nextDouble();
		}while(nota < 0 || nota > 10);
		
		System.out.println("O valor da nota: " + nota);
		

	}

}
