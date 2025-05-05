package br.com.geometria.model;

public class Retangulo {

	public int lado1, lado2;
	public double perimetro, area;
	public String nome;

	public void exibirInformacoes() {
		System.out.println("O nome é: " + nome);
		System.out.println("O lado1 é: " + lado1);
		System.out.println("O lado2 é: " + lado2);
	}

	public void calcularArea() {
		area = lado1 * lado2;
		System.out.println("A area do objeto " + nome + " é " + area);
	}

	public void calcularPerimetro() {
		perimetro = 2 * lado1 + 2 * lado2;
		System.out.println("O perimetro do objeto " + nome + " é " + perimetro);
	}

	public void validarRetanguloEspecial() {
		if (lado1 == lado2) {
			System.out.println("É um retângulo especial (Quadrado) ...");
		} else {
			System.out.println("Não é um retângulo especial ..." );
		}
	}
}