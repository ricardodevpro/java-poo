package br.com.geometria.model;

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
}
