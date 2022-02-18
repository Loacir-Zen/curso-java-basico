package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com um valor inteiro: ");
		int num = scan.nextInt();
		System.out.print(num + "! = ");
		int fat = num;
		
		while(num >= 1) {
			System.out.print(" " + num);
			num--;
			if(num > 0) {
				fat = fat * num;
			}			
		}
		
		System.out.print(" = " + fat);
	}

}
