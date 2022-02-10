package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Entre com o lado A: ");
		double ladoA = scan.nextDouble();
		
		System.out.print("Entre com o lado B: ");
		double ladoB = scan.nextDouble();
		
		System.out.print("Entre com o lado C: ");
		double ladoC = scan.nextDouble();
		
		if((ladoA + ladoB > ladoC) || (ladoA + ladoC > ladoB) || (ladoB + ladoC > ladoA)) {
			if ( ladoA == ladoB && ladoB == ladoC) {
				System.out.println("triângulo equilátero");
			} else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoC == ladoA)) {
				System.out.println("triângulo isósceles");
			} else if ((ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC)) {
				System.out.println("triângulo escaleno");
			}
		} else {
			System.out.println("Nâo é um triângulo");
		}

	}

}
