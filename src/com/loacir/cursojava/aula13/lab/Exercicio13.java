package com.loacir.cursojava.aula13.lab;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor da hora trabalhada: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com valor de horas trabalhada no mês: ");
		double qtdHorasTrabalhadas = scan.nextDouble();
		
		double calcSalarioBruto = valorHora * qtdHorasTrabalhadas;
		double impostoRenda = (calcSalarioBruto * 11) / 100;
		double inss = (calcSalarioBruto * 8) / 100;
		double sindicato = (calcSalarioBruto * 5) / 100;
		double calcSalarioLiquido = calcSalarioBruto - impostoRenda - inss - sindicato;
		
		System.out.println("Salário Bruto       : " + calcSalarioBruto);
		System.out.println("Imposto de Renda (-): " + impostoRenda);
		System.out.println("INSS             (-): " + inss);
		System.out.println("Sindicato        (-): " + sindicato);
		System.out.println("Salário liquido     : " + calcSalarioLiquido );

	}

}
