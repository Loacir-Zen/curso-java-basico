package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Entre com um valor: ");
		int valor = scan.nextInt();
		
		if(valor % 2 == 0) {
			System.out.print("Valor é par");
		} else {
			System.out.print("Valor é impar");
		}

	}

}
