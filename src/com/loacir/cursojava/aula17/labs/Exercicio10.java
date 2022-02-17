package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o valor para num01: ");
		int num01 = scan.nextInt();
		System.out.print("Entre com o valor para num02: ");
		int num02 = scan.nextInt();
		
		int i, j;
		if(num01 > num02) {
			i = num01;
			j = num02 + 1;
		} else {
			i = num02;
			j = num01 + 1;
		}
		
		do {		
			System.out.println(j);
			j++;
		}while(j < i);

	}

}
