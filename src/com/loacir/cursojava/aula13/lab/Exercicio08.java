package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da hora trabalhada: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Digite a quantidade de horas trabalhada: ");
		double qtdTrabalhada = scan.nextDouble();
		
		double calcSalario = valorHora * qtdTrabalhada;
		System.out.println("O seu salário será de: " + calcSalario);
		
	}

}
