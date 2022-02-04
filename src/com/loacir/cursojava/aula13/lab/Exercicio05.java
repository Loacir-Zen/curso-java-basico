package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor em metros: ");
		double metro = scan.nextDouble();
		
		double convertCentimetro = metro * 100;
		System.out.println("O valor em centimetros: " + convertCentimetro);
	}

}
