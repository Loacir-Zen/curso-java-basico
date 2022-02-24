package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de CDs: ");
		int numCDs = scan.nextInt();
		double valorCDs = 0;
		
		for(int i=0; i<numCDs; i++) {
			
			System.out.print("Entre com o valor do CD: ");
			double valorCD = scan.nextDouble();
			valorCDs += valorCD;
			
		}
		
		double mediaValorCDs = valorCDs / numCDs;
		
		System.out.println("O valor total é: " + valorCDs);
		System.out.println("O valor médio é: " + mediaValorCDs);

	}

}
