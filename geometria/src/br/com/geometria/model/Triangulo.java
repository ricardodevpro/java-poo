package br.com.geometria.model;

import java.util.Arrays;

public class Triangulo {

	public double base, ladoB, ladoC, area, altura, perimetro;

	public String nome;
	
	public void exibirInformacoes() {
		System.out.println("O nome do objeto é: " + nome);
		System.out.println("A base é: " + base);
		System.out.println("O ladoB é: " + ladoB);
		System.out.println("O ladoC é: " + ladoC);
	}

	public Boolean validarTriangulo() {
		if (base + ladoB >= ladoC && base + ladoC >= ladoB && ladoB + ladoC >= base) {
			System.out.println("Este objeto " + nome + " é um Triângulo.");
			return true;
		} else {
			System.out.println("Este objeto " + nome + " não é um Triângulo");
			return false;
		}
	}

	public void calcularArea() {
		area = (base * altura) / 2;
		System.out.println("A area do objeto " + nome + " é " + area);
	}

	public void calcularPerimetro() {
		perimetro = base + ladoB + ladoC;
		System.out.println("O perimetro do objeto " + nome + " é " + perimetro);
	}

	public void definirTipoTriangulo() {
		if (base == ladoB && base == ladoC && ladoB == ladoC) {
			System.out.println("Este é um Triângulo Equilátero");
		} else if (base == ladoB || base == ladoC || ladoB == ladoC) {
			System.out.println("Este é um Triângulo Isoceles");
		} else {
			System.out.println("Este é um Triângulo Escaleno");
		}
	}

	public void definirTrianguloRetangulo() {

		double [] ladosTriangulo = {base, ladoB, ladoC};

		Arrays.sort(ladosTriangulo); // Ordena as variaveis do menor para o maior.

		double cateto1 = ladosTriangulo[0];
		double cateto2 = ladosTriangulo[1];
		double hipotenusa = ladosTriangulo[2];

		if (Math.pow(cateto1, 2 ) + Math.pow(cateto2, 2) == Math.pow(hipotenusa, 2)) {
			System.out.println("Este Triângulo é um Triângulo Retângulo");
		} else {
			System.out.println("Este Triângulo não é um Triângulo Retângulo");
		}
	}
}
