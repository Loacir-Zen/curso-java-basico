package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre o salário: ");
		double salario = scan.nextDouble();
		double percentual = 0.0; 
		
		if(salario <= 280.0) {
			percentual = 20;
		} else if (salario > 280.0 && salario <= 700.0) {
			percentual = 15;
		} else if (salario > 700.0 && salario <= 1500.0) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		double aumento = (salario * percentual) / 100;
		double salarioAtual = aumento + salario;
		
		System.out.println("O salário antes do reajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo salário: " + salarioAtual);
	}

}