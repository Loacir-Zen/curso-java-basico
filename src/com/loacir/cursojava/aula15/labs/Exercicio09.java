package com.loacir.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o preço do primeiro produto: ");
		double produtoA = scan.nextDouble();
		
		System.out.print("Digite o preço do segundo produto: ");
		double produtoB = scan.nextDouble();
		
		System.out.print("Digite o preço do terceiro produto: ");
		double produtoC = scan.nextDouble();
		
		
		if((produtoA > produtoB) && (produtoB > produtoC)) {
			System.out.println(produtoC +" - "+ produtoB + " - " + produtoA);
		} else if ((produtoA > produtoC) && (produtoC >  produtoB)){
			System.out.println(produtoB + " - " + produtoC + " - " + produtoA);
		} else if ((produtoB > produtoA) && (produtoA >  produtoC)) {
			System.out.println(produtoC + " - " + produtoA + " - " + produtoB);
		} else if ((produtoB > produtoC) && (produtoC >  produtoA)) {
			System.out.println(produtoA + " - " + produtoC + " - " + produtoB);
		} else if ((produtoC > produtoB) && (produtoB > produtoA)) {
			System.out.println(produtoA + " - " + produtoB + " - " + produtoC);
		} else if ((produtoC > produtoA) && (produtoA > produtoB)) {
			System.out.println(produtoB + " - " + produtoA + " - " + produtoC);
		}	
		
	}

}
