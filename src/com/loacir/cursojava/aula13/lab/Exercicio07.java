package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;
import java.math.*;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		double altura = scan.nextDouble();
		
		System.out.print("Digite a base: ");
		double base = scan.nextDouble();
		
		double areaQuadrado = altura * base;
		System.out.println("A área do quadrado é: " + areaQuadrado);
		System.out.println("O dobro da área é: " + areaQuadrado * 2);
	}

}
