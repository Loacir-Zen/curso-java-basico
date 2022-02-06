package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a primeira parcial: ");
		double nota01 = scan.nextDouble();
		
		System.out.print("Entre com a segunda parcial: ");
		double nota02 = scan.nextDouble();
		
		double mediaNota = (nota01 + nota02) / 2;
		
		if (mediaNota < 7.0) {
			System.out.print("Reprovado");
		} else if (mediaNota >= 7.0 && mediaNota < 10) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Aprovado com Distinção");
		}

	}

}
