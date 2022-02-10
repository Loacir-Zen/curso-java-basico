package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor de sua hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhada: ");
		double qtdHorasTrabalhada = scan.nextDouble();
		
		double salario = valorHora * qtdHorasTrabalhada;
		
		double sindicato = (salario * 3)/100;
		double FGTS = (salario * 11)/100;
		double taxaDescontoIR = 0.0;
		double taxaINSS = 0.0;
		
		if(salario <= 900) {
			taxaDescontoIR = 0;
		} else if (salario > 900 && salario <= 1500) {
			taxaDescontoIR = 5;
		} else if (salario > 1500 && salario <= 2500) {
			taxaDescontoIR = 10;
		} else {
			taxaDescontoIR = 20;
		}
		
		if(salario <= 1212.0) {
			taxaINSS = 7.5;
		} else if (salario > 1212.1 && salario <= 2427.3) {
			taxaINSS = 9;
		} else if (salario > 2427.4 && salario <= 3641.0) {
			taxaINSS = 12;
		} else if (salario > 3641.0 && salario <= 7087.2){
			taxaINSS = 14;
		}
		
		double descontoIR = (salario * taxaDescontoIR) / 100;
		double descontoINSS = (salario * taxaINSS) / 100;
		double totalDescontos = descontoIR + descontoINSS;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " + qtdHorasTrabalhada + ") 		:R$ " + salario);
		System.out.println("(-) IR (" + taxaDescontoIR + "%)				:R$ " + descontoIR);
		System.out.println("(-) INSS (" + taxaINSS +"%)				:R$ " + descontoINSS);
		System.out.println("FGTS (" + 11 +")				:R$ " + FGTS);
		System.out.println("Total de descontos: 			:R$ " + totalDescontos);
		System.out.println("Salário Líquido: 			:R$ " + (salario - totalDescontos));
		
		

	}

}
