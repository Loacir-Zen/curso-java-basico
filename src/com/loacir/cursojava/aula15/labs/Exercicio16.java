package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;
import java.math.*;

public class Exercicio16 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
	System.out.print("Entre com um valor para A: ");
	double valorA = scan.nextDouble();
	double delta = 0;
	double primeiraRaiz = 0;
	double segundaRaiz = 0;
	
	if(valorA == 0) {
		System.out.print("A equação não é de segundo grau");
	} else {
		
		System.out.print("Entre com um valor para B: ");
		double valorB = scan.nextDouble();
		
		System.out.print("Entre com um valor para C: ");
		double valorC = scan.nextDouble();
		
		delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
		
		if (delta < 0) {
			System.out.print("A equação não possui raízes rais");
		} else {
			if (delta == 0) {
				primeiraRaiz = (-(valorB) + Math.sqrt(delta)) / (2* valorA);  
				System.out.print("A raiz' da equação é: " + primeiraRaiz);
			} else if (delta > 0) {
				primeiraRaiz = (-(valorB) + Math.sqrt(delta)) / (2* valorA);  
				System.out.println("A raiz' da equação é: " + primeiraRaiz);
				segundaRaiz = (-(valorB) - Math.sqrt(delta)) / (2* valorA); 
				System.out.println("A raiz'' da equação é: " + segundaRaiz);
			}
		}
	}
	
	}

}
