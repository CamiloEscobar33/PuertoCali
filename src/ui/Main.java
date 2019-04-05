package ui;

/*import model.*;*/

import java.util.Scanner;

public class Main {

	//Dependencia
	private Puerto puerto;

	private Scanner scanner; 
	
	public Main(){

	scanner = new Scanner(System.in);
	
	puerto = new Puerto();
	
	}

	public static void main (String[] args) {

		Main main = new Main();
		main.mostrarResultados();
		
	}

	public void mostrarResultados() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-Puerto de Cali Icesi_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("\nDigite la dimensiones de los 3 contenedores:");

		System.out.println("Contenedor 1");

		System.out.println("Ancho: ");

		double ancho1 = scanner.nextDouble();

		System.out.println("Largo:");

		double largo1 = scanner.nextDouble();

		System.out.println("Alto:");

		double alto1 = scanner.nextDouble();

		System.out.println("Contenedor 2");

		System.out.println("Ancho: ");

		double ancho2 = scanner.nextDouble();

		System.out.println("Largo:");

		double largo2 = scanner.nextDouble();

		System.out.println("Alto:");

		double alto2 = scanner.nextDouble();

		System.out.println("Contenedor 3");

		System.out.println("Ancho:");

		double ancho3 = scanner.nextDouble();

		System.out.println("Largo:");

		double largo3 = scanner.nextDouble();

		System.out.println("Alto:");

		double alto3 = scanner.nextDouble();



		/*Contenedor co1 = new Contenedor (ancho1,largo1,alto1);

		Contenedor co2 = new Contenedor (ancho2,largo2,alto2);

		Contenedor co3 = new Contenedor (ancho3,largo3,alto3);*/

		System.out.println("Menu");



		/*double area = rectangle.calcularArea();

		double perimetro = rectangle.calcularPerimetro();

		double longitudDiagonal = rectangle.calcularDiagonal();

		System.out.println("El area de rectangulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro + "\nLa longitud del la diagonal del rectangulo es: " + longitudDiagonal);		
	    */



    }


}