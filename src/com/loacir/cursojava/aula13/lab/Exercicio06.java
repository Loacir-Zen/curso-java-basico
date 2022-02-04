package com.loacir.cursojava.aula13.lab;

import java.util.Scanner;
import java.math.*;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o raio: ");
		double raio = scan.nextDouble();
		
		double calcArea = (Math.PI * Math.pow(raio, 2)) ;
		System.out.println("A área do circulo é: " + calcArea);
	}

}
