package com.br.escadinha;

import java.util.Scanner;

public class Escadinha {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int continuar =0;
		while (continuar == 0) {
		
		System.out.println("Quantos degraus Você quer para sua Escada? ");
		int tamanhoDaEScada=input.nextInt();
		
		
		StringBuilder escadinha = new StringBuilder();
		
		System.out.println("Escolha um caractere:");
		String caracter = input.next();
		
		
		for(int controle = 0; controle < tamanhoDaEScada  ; controle ++) {
			escadinha.insert(controle,caracter);
			System.out.println(escadinha);
		}
		System.out.println("Aperte 0 para Continuar . 1 Para Sair.");
		continuar = input.nextInt();
		
       
	}

}}
