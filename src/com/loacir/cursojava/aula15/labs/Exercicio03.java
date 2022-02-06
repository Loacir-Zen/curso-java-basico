package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um valor (F) ou (M): ");
		char sexo = scan.next().charAt(0);
		
		switch(sexo) {
		case 'F' :
		case 'f' : System.out.println("Feminino"); break;
		case 'M' :
		case 'm' : System.out.println("Masculino");break;
		default : System.out.println("Valor inválido");
		}

	}

}
