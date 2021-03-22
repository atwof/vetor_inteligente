package com.alissom.pratica7vetor;

public class MainColecaoDouble {

	public static void main(String[] args) {

		int tamanho = Entrada.leiaInt("Digite o tamanho do Array");
		
		ColecaoDouble cd = new ColecaoDouble(tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			double numero = Entrada.leiaDouble("Digite número");
			cd.setNumeroEm(i, numero);
		}
		
		double[] numbers = cd.getNumeros();
		double[] pares = cd.getPares();
		double[] impares = cd.getImpares();
				
		System.out.print("\nOs números digitados foram: ");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n\nA quantidade de números digitados foi: " + cd.getTamanho());
		System.out.println("A soma dos números é: " + cd.getSoma());
		System.out.println("A média dos números é: " + cd.getMedia());
		System.out.println("O maior número é: " + cd.getMaior());
		System.out.println("O menor número é: " + cd.getMenor());
		
		System.out.print("\nOs números pares são: ");
		for(int i = 0; i < pares.length; i++) {
			if(pares[i] != 0) {
				System.out.print(pares[i] + " ");
			}
		}
		
		System.out.print("\nOs números ímpares são: ");
		for(int i = 0; i < impares.length; i++) {
			if(impares[i] != 0) {
				System.out.print(impares[i] + " ");
			}
		}
		
		int maior = Entrada.leiaInt("\nDigite um valor para mostrar os números maiores que ele");
		double[] maiores = cd.getMaiorQue(maior);
		
		System.out.print("\nOs números maiores que "+ maior + " são: ");
		for(int i = 0; i < maiores.length; i++) {
			if(maiores[i] != 0) {
				System.out.print(maiores[i] + " ");
			}
		}
		
		int menor = Entrada.leiaInt("\nDigite um valor para mostrar os números menores que ele");
		double[] menores = cd.getMenorQue(menor);
		
		System.out.print("\nOs números menores que "+ menor + " são: ");		
		for(int i = 0; i < menores.length; i++) {
			if(menores[i] != 0) {
				System.out.print(menores[i] + " ");
			}
		}
		System.exit(1);
		
		
		}
	}
