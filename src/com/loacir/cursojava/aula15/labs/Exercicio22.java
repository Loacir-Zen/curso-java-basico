package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Entre com a quantidade de morango me kg: ");
		double pesoMorango = scan.nextDouble();
		
		double precoMorango = 0;
		
		if(pesoMorango <= 5) {
			precoMorango = 2.50;
		} else if (pesoMorango > 5) {
			precoMorango = 2.20;
		}
		

		System.out.print("Entre com a quantidade de maça em kg: ");
		double pesoMaca = scan.nextDouble();
		
		double precoMaca = 0;
		
		if(pesoMaca <= 5) {
			precoMaca = 1.80;
		} else if (pesoMaca > 5) {
			precoMaca = 1.50;
		}

		
		double precoTotal = 0;

		if((pesoMaca + pesoMorango) > 8 || (precoMaca * pesoMaca) + (precoMorango * pesoMorango) > 25) {
			precoTotal = (precoMaca * pesoMaca) + (precoMorango * pesoMorango) - ((precoMaca * pesoMaca) + (precoMorango * pesoMorango) * 10) / 100;
		} else {
			precoTotal = (precoMaca * pesoMaca) + (precoMorango * pesoMorango);
		}
		
		System.out.print("O preço a ser pago é: " + precoTotal);

		
		
	}

}
