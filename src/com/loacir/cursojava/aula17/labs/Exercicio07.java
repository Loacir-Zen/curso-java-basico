package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0; i<num.length; i++) {
			System.out.println("Entre com o valor para i: ");
			num[i] = scan.nextInt();
		}
		
		int maiorNum = Integer.MIN_VALUE;
		for(int i = 0; i<num.length; i++) {
			if(num[i] > maiorNum) {
				maiorNum = num[i];
			}
		}
		
		System.out.println("O maior número é: " + maiorNum);
	}
}
