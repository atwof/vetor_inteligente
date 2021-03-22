package com.alissom.pratica7vetor;

public class ColecaoDouble {

	private double[] numeros;
	
	public ColecaoDouble(int tamanho) {
		this.numeros = new double[tamanho];
	}
	
	public int getTamanho() {
		return numeros.length;
	}
	
	public double getMedia() {
		return this.getSoma() / this.getTamanho();
	}
	
	public double getSoma() {
		double soma = 0;
		for(int i = 0; i < this.getTamanho(); i++) {
			soma += numeros[i];
		}
		return soma;
	}
	
	public double getMaior() {
		double maior = numeros[0];
		for(int i = 1; i < this.getTamanho(); i++) {
			if(maior < numeros[i]) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	public double getMenor() {
		double menor = numeros[0];
		for(int i = 1; i < this.getTamanho(); i++) {
			if(menor > numeros[i]) {
				menor = numeros[i];
			}
		}
		return menor;
	}
	
	public double[] getPares() {
		double[] par = new double[this.getTamanho()];
		double teste;
		int x = 0;
		for(int i = 0; i < this.getTamanho(); i++) {
			if(numeros[i] % 2 == 0) {
				teste = numeros[i];
				par[x] = teste;
				x++;
			}
		}
		return par;
	}

	public double[] getImpares() {
		double[] impar = new double[this.getTamanho()];;
		double teste;
		int x = 0;
		for(int i = 0; i < this.getTamanho(); i++) {
			if(numeros[i] % 2 == 1) {
				teste = numeros[i];
				impar[x] = teste;
				x++;
			}
		}
		return impar;
	}

	public double[] getMaiorQue(int maior) {
		double[] maiores = new double[numeros.length];
		double valor;
		int x = 0;
		for(int i = 0; i < this.getTamanho(); i++) {
			if(numeros[i] > maior) {
				valor = numeros[i];
				maiores[x] = valor;
				x++;
			}
		}
		return maiores;
	}
	
	public double[] getMenorQue(int menor){
		double[] menores = new double[numeros.length];
		double valor;
		int x = 0;
		for(int i = 0; i < this.getTamanho(); i++) {
			if(numeros[i] < menor) {
				valor = numeros[i];
				menores[x] = valor;
				x++;
			}
		}
		return menores;
	}
	
	public double[] getNumeros() {
		return numeros;
	}
	
	public void setNumeroEm(int i, double numero) {
			numeros[i] = numero;
			System.out.println(numeros[i]);
		}	
	}
