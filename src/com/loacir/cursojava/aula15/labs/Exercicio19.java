package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor para A: ");
		double valorA = scan.nextDouble();
		
		System.out.print("Entre com um valor para B: ");
		double valorB = scan.nextDouble();
		
		System.out.print("Entre com a operação (A)adição - (S)subtração - (M)multiplicação - (D)divisão : ");
		char operacao = scan.next().charAt(0);
		
		double calc = 0;
		
		switch(operacao) {
		case 'a' :
		case 'A' : calc = valorA + valorB; break;
		case 's' :
		case 'S' : calc = valorA - valorB; break;
		case 'm' :
		case 'M' : calc = valorA * valorB; break;
		case 'd' :
		case 'D' : calc = valorA / valorB; break;
		default:  System.out.print("Operação inválida!");
		}
		
		System.out.println("O valor é: " + calc);
		
		if(calc % 2 == 0) {
			System.out.println("O valor é par");
		} else {
			System.out.println("O valor é impar");
		}
		
		if(calc > 0) {
			System.out.println("O valor é positivo");
		} else {
			System.out.println("O valor é negativo");
		}

	}
}
