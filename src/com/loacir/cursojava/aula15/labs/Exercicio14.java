package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira parcial: ");
		double primeiraParcial = scan.nextDouble();
		
		System.out.print("Digite a segunda parcial: ");
		double segundaParcial = scan.nextDouble();
		
		double mediaParcial = (primeiraParcial + segundaParcial) / 2;
		char conceito = ' ';
		
		if(mediaParcial > 9.0 && mediaParcial <= 10.0) {
			conceito = 'A';
		} else if (mediaParcial > 7.5 && mediaParcial <= 8.9) {
			conceito = 'B';
		} else if (mediaParcial > 6.0 && mediaParcial <= 7.4) {
			conceito = 'C';
		} else if (mediaParcial > 4.0 && mediaParcial <= 5.9) {
			conceito = 'C';
		} else {
			conceito = 'D';
		}
		
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.print("Conceito - " + conceito + " : APROVADO" );
		} else if (conceito == 'D' || conceito == 'E') {
			System.out.print("Conceito - " + conceito + " : REPROVADO");
		}
	}
}
