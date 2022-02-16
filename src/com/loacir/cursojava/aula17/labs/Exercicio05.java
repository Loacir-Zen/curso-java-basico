package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com a população de A: ");
		long populacaoA = scan.nextLong();
		
		System.out.print("Entre com a taxa de crescimento de A: ");
		double taxaA = scan.nextDouble();
		
		System.out.print("Entre com a população de B: ");
		long populacaoB = scan.nextLong();
		
		System.out.print("Entre com a taxa de crescimento de B: ");
		double taxaB = scan.nextDouble();
		
		int count = 0;
		for(long a=populacaoA, b=populacaoB; a<b; a+=((populacaoA*taxaA)/100), b+=((populacaoB*taxaB)/100)) {
			count++;
			System.out.println("a -> " + a + "  -  b ->" + b);
		}
		System.out.println("A quantidade de anos será: " + count);

	}

}
