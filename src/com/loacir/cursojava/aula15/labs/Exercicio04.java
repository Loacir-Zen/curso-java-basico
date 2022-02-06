package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com uma letra entre (a - A) até (z - Z): ");
		char letra = scan.next().charAt(0);
		
		switch(letra) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : System.out.print("vogal"); break;
		default : System.out.print("consoante");
		}

	}

}
