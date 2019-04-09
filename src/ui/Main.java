package ui;

import model.*;

import java.util.Scanner;

public class Main {

	//Dependencia
	private Puerto puerto;

	private Scanner scanner; 
	
	public Main(){

	Scanner scanner = new Scanner(System.in);
	
	}

	public static void main (String[] args) {

		Main main = new Main();
		main.mostrarResultados();
		
	}

	boolean salir = true;

	int option;

	public void mostrarResultados() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-Puerto de Cali Icesi_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

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

		Contenedor co3 = new Contenedor (ancho1,largo1,alto1);

	   	Contenedor co2 = new Contenedor (ancho2,largo2,alto2);

		Contenedor co1 = new Contenedor (ancho3,largo3,alto3);
		
		Puerto puerto = new Puerto(co1, co2, co3);
	

		System.out.println("Menu");
		System.out.println("1. Calcular el volumen de la mercancia de los contenedores.");
		System.out.println("2. Calcular el volumen promedio de los contenedores.");
		System.out.println("3. Salir de menu.");

		System.out.println("Digite una opción: ");

 		option = scanner.nextInt(); 

			switch (option) {

				case 1: 

				  	System.out.println("El vlomen de la mercancia de los contenedores es " + puerto.calcularVolumenMercancia());

					break;

				case 2: 

					System.out.println("El volumen promedio de los contenedores es " + puerto.calcularVolumenPromedio());

					break;

				case 3: 

					salir = false;
					System.out.println("Hasta luego");

					break;

			}
    } 

}