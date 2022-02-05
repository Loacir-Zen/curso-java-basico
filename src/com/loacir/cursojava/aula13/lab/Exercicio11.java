package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;
import java.math.*;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int num01 = 0;
		int num02 = 0;
		double num03 = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor inteiro para num01: ");
		num01 = scan.nextInt();
		
		System.out.print("Digite um valor inteiro para num02: ");
		num02 = scan.nextInt();
		
		System.out.print("Digite um valor real para num03: ");
		num03 = scan.nextDouble();
		
		double calcExerA = (num01 * 2) + (num02 / 2);
		double calcExerB = (num01 * 3) + num03;
		double calcExerC = Math.pow(num03, 2);
		
		System.out.println("Resultado do exercício A: " + calcExerA);
		System.out.println("Resultado do exercício B: " + calcExerB);
		System.out.println("Resultado do exercício C: " + calcExerC);

	}

}
