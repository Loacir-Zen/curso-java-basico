package com.loacir.cursojava.aula13.lab;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a temperatura em farenheit: ");
		double farenheit = scan.nextDouble();
		
		double calcTemperatura = (5 * (farenheit - 31) / 9);
		System.out.println("A temperatura em celsius é: " + calcTemperatura);
	}

}
