package com.loacir.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 0;
		int max = 10;
		
		while (i <= max) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println(i);
		System.out.println("-----------------------");
		
		int y = 0;
		
		do {
			y++;
			System.out.println("y = " + y);

		}while(y <= max);
		System.out.println(y);
	}

}
