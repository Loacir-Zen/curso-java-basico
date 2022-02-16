package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome = "";
		do {
			System.out.print("Entre com o nome: ");
			nome = scan.nextLine();
		}while(nome.length() <= 3);
		
		int idade;
		do {
			System.out.print("Entre com a idade: ");
			idade = scan.nextInt();
		}while(idade < 0 || idade > 150);
		
		double salario;
		do {
			System.out.print("Entre com o salário: ");
			salario = scan.nextDouble();
		}while(salario < 0);
		
		char sexo;
		do {
			System.out.println("Entre com o sexo: ");
			sexo = scan.next().charAt(0);
		}while(!(sexo == 'f' || sexo == 'm'));
		
		char estadoCivil;
		do {
			System.out.println("Entre com o estado civil: ");
			estadoCivil = scan.next().charAt(0);
		}while(!(estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'));
	}
}
