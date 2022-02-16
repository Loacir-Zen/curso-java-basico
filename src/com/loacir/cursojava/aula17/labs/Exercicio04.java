package com.loacir.cursojava.aula17.labs;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//pais A 80000 taxa de crescimento 3%
		//pais B 200000 taxa de crescimento 1.5
		int count = 0;
		for(long a=80000, b=200000; a<b; a+=(80000*4)/100, b+=(200000*1.5)/100) {
			count++;
			System.out.println("a -> " + a + "  -  b ->" + b);
		}
		System.out.println("A quantidade de anos será: " + count);
	}

}
