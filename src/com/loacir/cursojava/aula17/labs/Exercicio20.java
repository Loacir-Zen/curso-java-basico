package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		double idade = 0, somaIdade = 0;
		char op = 'S';
		
		do {
			System.out.print("Digite a idade: ");
			idade = scan.nextDouble();
			somaIdade += idade;
			count ++;
			System.out.print("Deseja informar outra idade: ");
			op = scan.next().charAt(0);
		}while(op == 'S' || op == 's');
		
		double mediaIdade = somaIdade / count;
		
		if(mediaIdade > 0 && mediaIdade <= 25) {
			System.out.println("A turma é jovem");
		} else if (mediaIdade > 25 && mediaIdade <= 60) {
			System.out.println("A turma é adulta");
		} else {
			System.out.println("A turma é idosa");
		}

	}

}
