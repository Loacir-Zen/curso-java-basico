package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Telefonou para a vitima? (S)Sim - (N)Não: ");
		char perguntaA = scan.next().charAt(0);
		
		if(perguntaA == 'S') {
			cont += 1;
		}
		
		System.out.print("Esteve no local do crime? (S)Sim - (N)Não: ");
		char perguntaB = scan.next().charAt(0);
		
		if(perguntaB == 'S') {
			cont += 1;
		}
		
		System.out.print("Mora perto da vítima? (S)Sim - (N)Não: ");
		char perguntaC = scan.next().charAt(0);
		
		if(perguntaC == 'S') {
			cont += 1;
		}
		
		System.out.print("Devia para a vítima? (S)Sim - (N)Não: ");
		char perguntaD = scan.next().charAt(0);
		
		if(perguntaD == 'S') {
			cont += 1;
		}
		
		
		System.out.print("Já trabalhou com a vítima? (S)Sim - (N)Não: ");
		char perguntaE = scan.next().charAt(0);
		
		if(perguntaE == 'S') {
			cont += 1;
		}
		
		
		if(cont == 2) {
			System.out.print("Suspeito");
		} else if(cont > 2 && cont <= 4) {
			System.out.print("Cúmplice");
		} else if (cont == 5) {
			System.out.print("Assassino");
		} else {
			System.out.print("Inocente");
		}


	}

}
