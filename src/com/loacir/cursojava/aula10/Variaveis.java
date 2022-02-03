package com.loacir.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção java
		int idade = 20;
		String nome = "Loacir";
		String nomeDoMeuCachorro = "Bill";
		String ano2014 = "2014";
		
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		
		//não é convenção java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		
		
		idade = 32;
		
		System.out.println("Idade : " + idade);
		System.out.println("Nome: " + nome);
		System.out.println("Nome do meu cachorro: " + nomeDoMeuCachorro);
		
		//má pratica
		int a = 10;
		String b = "Loacir";
		

	}

}
