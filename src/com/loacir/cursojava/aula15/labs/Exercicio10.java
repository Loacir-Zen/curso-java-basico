package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda (M)matutino - (V)vespertino - (N)noturno ");
		char turno = scan.next().charAt(0);
		
		if(turno == 'm') {
			System.out.println("Bom dia! ");
		} else if (turno == 'v') {
			System.out.println("Boa tarde! ");
		} else if (turno == 'n'){
			System.out.println("Boa noite! ");
		} else {
			System.out.println("Valor inválido! ");
		}

	}

}
