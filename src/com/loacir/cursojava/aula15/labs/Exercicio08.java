package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o preço do produto A: ");
		double produtoA = scan.nextDouble();
		
		System.out.print("Digite o preço do produto B: ");
		double produtoB = scan.nextDouble();
		
		System.out.print("Digite o preço do produto C: ");
		double produtoC = scan.nextDouble();
		
		double menorPreco = produtoA;
		String produtoMaisBarato = "";
		
		if(produtoA < menorPreco) {
			menorPreco = produtoA;
			produtoMaisBarato = "A";
		} else if (produtoB < menorPreco) {
			menorPreco = produtoB;
			produtoMaisBarato = "B";
		} else if (produtoC < menorPreco){
			menorPreco = produtoC;
			produtoMaisBarato = "C";
		}

		System.out.println("O produto mais barato é: " + produtoMaisBarato);
	}

}
