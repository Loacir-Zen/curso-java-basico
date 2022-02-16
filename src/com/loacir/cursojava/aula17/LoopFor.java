package com.loacir.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for(int i = 0; i<= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-----------------");
		
		for(int y = 10; y >= 0; y--) {
			System.out.println("y = " + y);
		}
		
		System.out.println("-----------------");
		
		for(int i = 0, j=10; i<j; i++, j--) {
			System.out.println("i = " + i + "  -  j = " + j);

		}
		
		System.out.println("-----------------");
		
		int count = 0;
		for( ; count < 10 ; ) {
			System.out.println("count: " + count);
			count += 2;
		}
		
		System.out.println("-----------------");
		
		int soma = 0;
		for(int i =0; i < 5; soma += i++);
		System.out.println("O valor da soma = " + soma);
		
		System.out.println("-----------------");
		
		for(int i = 0; i<= 10; i++) 
			System.out.println("i = " + i);
			System.out.println("Fim");

	}

}
