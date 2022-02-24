package com.loacir.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numAlunos = 0, somaQtdAlunos = 0;
		int numTurma = 0, count = 0;
		
		System.out.print("Entre com o numero de turmas: ");
		numTurma = scan.nextInt();
		count = numTurma;
		
		while(count > 0) {
		
			do {
				System.out.print("Entre com o numero de alunos: ");
				numAlunos = scan.nextInt();
				
				if(numAlunos > 40) {
					System.out.println("A turma não pode ter mais de 40 alunos");
				} else {
					somaQtdAlunos += numAlunos;
				}
			
			}while(numAlunos > 40);			
			count--;	
		}	

		double mediaAluno = somaQtdAlunos / numTurma;
		System.out.println("A média de alunos é: " + mediaAluno);
	}

}
