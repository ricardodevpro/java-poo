package br.com.geometria;

import br.com.geometria.model.Circulo;
import br.com.geometria.model.Retangulo;
import br.com.geometria.model.Triangulo;

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

		// Instanciando Circulo1
		Circulo circulo1 = new Circulo();

		circulo1.nome = "Circulo-1";
		circulo1.raio = 10;

		circulo1.exibirInformacoes();
		circulo1.calcularDiametro();
		circulo1.calcularArea();
		circulo1.calcularPerimetro();

		// Instanciando Circulo2
		Circulo circulo2 = new Circulo();

		circulo2.nome = "Circulo-2";
		circulo2.raio = 15;

		circulo2.exibirInformacoes();
		circulo2.calcularDiametro();
		circulo2.calcularArea();
		circulo2.calcularPerimetro();

		// Instanciando Triangulo1
		Triangulo triangulo1 = new Triangulo();

		triangulo1.nome = "Triangulo - 1";
		triangulo1.base = 5;
		triangulo1.ladoB = 3;
		triangulo1.altura = 8;

		boolean validarTriangulo = triangulo1.validarTriangulo();

		if (validarTriangulo) {
			triangulo1.exibirInformacoes();
			triangulo1.calcularArea();
			triangulo1.calcularPerimetro();
		}
	}
}
