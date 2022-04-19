package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			float a,b;
			
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextFloat();
			System.out.println("Digite o segundo valor: ");
			b = scan.nextFloat();
			
			float soma = soma(a,b);
			float subtracao = subtracao(a,b);
			float multiplicacao = multiplicacao (a,b);
			float divisao = divisao (a,b);
			
			System.out.println("soma: " + soma);
			System.out.println("subtração: " + subtracao);
			System.out.println("multiplicação: " + multiplicacao);
			System.out.println("divisão: " + divisao);
		}
		
	}

	public static float soma(float a,float b) {
		return a+b;
}
	
	public static float subtracao(float a,float b) {
		return a-b;
}
	
	public static float divisao(float a,float b) {
		return a/b;
}
	
	public static float multiplicacao(float a,float b) {
		return a*b;
}
	
}
