package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com valor para num01: ");
		int num01 = scan.nextInt();
		
		System.out.print("Entre com valor para num02: ");
		int num02 = scan.nextInt();
		
		if (num01 > num02 ) {
			System.out.println("O maior valor é -> " + num01);
		} else {
			System.out.println("O maior valor é -> " + num02);
		}

	}

}
