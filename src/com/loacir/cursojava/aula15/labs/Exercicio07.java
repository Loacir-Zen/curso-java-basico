package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		int num01 = scan.nextInt();
		
		System.out.print("Entre com o segundo número: ");
		int num02 = scan.nextInt();
		
		System.out.print("Entre com o terceiro número: ");
		int num03 = scan.nextInt();
		
		int menorNum = 0;
		int maiorNum = 0;
		
		if(num01 > num02 && num01 > num03 && num02 > num03) {
			maiorNum = num01;
			menorNum = num03;
		} else if (num02 > num01 && num02 > num03 && num01 > num03) {
			maiorNum = num02;
			menorNum = num03;
		} else if (num03 > num01 && num03 > num02 && num02 > num01) {
			maiorNum = num03;
			menorNum = num01;
		} else if (num01 > num02 && num01 > num03 && num03 > num02) {
			maiorNum = num01;
			menorNum = num02;
		} else if (num02 > num01 && num02 > num03 && num03 > num01) {
			maiorNum = num02;
			menorNum = num01;
		}else if (num03 > num01 && num03 > num02 && num01 > num02) {
			maiorNum = num03;
			menorNum = num02;
		} else {
			maiorNum = menorNum;
		}
	
	
	if(maiorNum != menorNum) {
		System.out.println("O maior número é: " + maiorNum);
		System.out.println("O menor número é: " + menorNum);
	} else {
		System.out.println("Todos os números são iguais");
	}
	
	}

}
