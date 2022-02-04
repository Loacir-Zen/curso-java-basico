package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a nota do primeiro bimestre: ");
		double nota01 = scan.nextDouble();
		
		System.out.print("Digite a nota do segundo bimestre: ");
		double nota02 = scan.nextDouble();
		
		System.out.print("Digite a nota do terceiro bimestre: ");
		double nota03 = scan.nextDouble();
		
		System.out.print("Digite a nota do quarto bimestre: ");
		double nota04 = scan.nextDouble();
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.println("A média foi: " + media);

	}

}
