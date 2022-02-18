package com.loacir.cursojava.aula17.labs;

public class Exercicio16 {

	public static void main(String[] args) {
		int index =0, pos=1, cont =0;
		do {
			System.out.print(pos + " ");
			pos = pos + index;
			index = pos - index;
			cont ++;
		}while(index<500);

	}

}
