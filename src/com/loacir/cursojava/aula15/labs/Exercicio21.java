package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com o número de litros vendidos: ");
		double litrosVendido = scan.nextDouble();
		
		System.out.print("Entre com o tipo de combustível (A)alcool ou (G)gasolina: ");
		char tipoCombustivel = scan.next().charAt(0);
		double taxaDesconto = 0;
		
		if(tipoCombustivel == 'A') {
			if (litrosVendido <= 20) {
				taxaDesconto = 3;
			} else {
				taxaDesconto = 5;
			}
		} else if(tipoCombustivel == 'G') {
			if (litrosVendido <= 20) {
				taxaDesconto = 4;
			} else {
				taxaDesconto = 6;
			}
		}
		
		double calcValor = 0;
		
		if ( tipoCombustivel == 'A') {
			calcValor = (litrosVendido * 1.90) - (((litrosVendido * 1.90) * taxaDesconto) / 100);
		} else if (tipoCombustivel == 'G') {
			calcValor = (litrosVendido * 2.50) - (((litrosVendido * 2.50) * taxaDesconto) / 100);
		}
				
		System.out.print("O valor a ser pago é: " + calcValor + "R$");		
	}

}
