package com.loacir.cursojava.aula14;
import java.util.Scanner;


public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade");
		} else {
			System.out.println("É menor de idade");
		}
		
		//barata <= 10
		// 10 < valor 15 - pedir desconto
		// 15 <= 17 - pesquisar mais 
		// >= 17 muito caro 
		
		System.out.print("Digite o preço: ");
		double preco = scan.nextDouble();
		
		if (preco <= 10.0) {
			System.out.println("Muito barato pode comprar");
		} else if (preco > 10.0 && preco <= 15.0) {
			System.out.println("Pedir desconto");
		} else if (preco > 15.0 && preco <= 17.0) {
			System.out.println("Pesquisar mais");
		} else {
			System.out.println("Muito caro");
		}
	}
}
