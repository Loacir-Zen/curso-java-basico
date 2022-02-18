package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com um valor inteiro: ");
		int num = scan.nextInt();
		int index = num;
		boolean primo = true;
		
		while(index > 2) {
			index--;
			if(num % index == 0) {
				primo = false;
			}		
		}

		if(primo == true) {
			System.out.println("O número é primo");
		}else if(primo == false) {
			System.out.println("O número não é primo");
		}
	}

}
