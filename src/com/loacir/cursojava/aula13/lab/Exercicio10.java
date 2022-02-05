package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a temperatura em celsius: ");
		double celsius = scan.nextDouble();
		
		double calcTemperatura = (celsius * 1.8) +  32;
		
		System.out.println("A temperatura em farenheit é: " + calcTemperatura);

	}

}
