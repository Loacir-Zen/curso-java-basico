package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = "";
		String senha = "";
		
		do {
			System.out.print("Entre com seu nome: ");
			nome = scan.nextLine();
			System.out.print("Entre com sua senha: ");
			senha = scan.nextLine();
		}while(nome.equals(senha));
		
		System.out.println("Autenticado com sucesso");

	}

}
