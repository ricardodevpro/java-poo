package br.com.geometria;

import br.com.geometria.model.Retangulo;

public class Geometria {
	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo();
		Retangulo retangulo2 = new Retangulo();

		retangulo1.nome = "Retangulo-1";
		retangulo1.lado1 = 10;
		retangulo1.lado2 = 5;

		retangulo2.nome = "Retangulo-2";
		retangulo2.lado1 = 10;
		retangulo2.lado2 = 10;

		retangulo1.exibirInformacoes();;
		retangulo1.calcularArea();
		retangulo1.calcularPerimetro();
		retangulo1.validarRetanguloEspecial();

		System.out.println(".");

		retangulo2.exibirInformacoes();
		retangulo2.calcularArea();
		retangulo2.calcularPerimetro();
		retangulo2.validarRetanguloEspecial();
	}
}
