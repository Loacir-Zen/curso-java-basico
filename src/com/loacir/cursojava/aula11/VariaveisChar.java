package com.loacir.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char o = 'o';
		
		char l = 'l';
		
		char á = 'á';
		
		char interrogacao = 0X00E1;
		
		
		System.out.println("" + o + l + á);
		
		o = 111;
		l = 108;
		á = 0x00E1;
		
		System.out.println("" + o + l + á + interrogacao);
		

	}

}
