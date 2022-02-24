package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double precoItem = 0, somaPreco = 0, qtdDinheiro = 0, trocoDinheiro = 0;
		int count = 1;
		
		do {
			
			System.out.print("Produto " + count + ": R$ ");
			precoItem = scan.nextDouble();
			somaPreco += precoItem;
			count++;
			
		}while(precoItem != 0);
		
		System.out.println("Total: " + somaPreco);
		
		do {
			System.out.print("Dinheiro: R$ ");
			qtdDinheiro = scan.nextDouble();
			
			if(qtdDinheiro < somaPreco) {
				System.out.println("Valor insuficiente");
			} else {
				trocoDinheiro = qtdDinheiro - somaPreco;
			}
		}while(qtdDinheiro < somaPreco);

		System.out.println("Troco: R$ " + trocoDinheiro);
	}

}
