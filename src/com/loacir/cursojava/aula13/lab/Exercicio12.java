package com.loacir.cursojava.aula13.lab;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com sua altura: ");
		double altura = scan.nextDouble();
		
		double calcPesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Segundo calculos o seu peso ideal seria: " + calcPesoIdeal);

	}

}
