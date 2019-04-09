package model;

public class Puerto {

	//relations
	private Contenedor co1;

	private Contenedor co2;

	private Contenedor co3;

	public Puerto(Contenedor co1, Contenedor co2, Contenedor co3) {

		this.co1 = co1;

		this.co2 = co2;

		this.co3 = co3;
				
	}

	public Contenedor getCo1() {

		return co1;
	}


	public Contenedor getCo2() {

		return co2;
	}


	public Contenedor getCo3() {

		return co3;
	}

	public double calcularVolumenMercancia() {

		double volumenMerca = 0.0;

		volumenMerca = co1.calcularVolumenContenedor() + co2.calcularVolumenContenedor() + co3.calcularVolumenContenedor();

		return volumenMerca;
	} 

	public double calcularVolumenPromedio() {

		double promedio = 0.0;

		promedio = (co1.calcularVolumenContenedor() + co2.calcularVolumenContenedor() + co3.calcularVolumenContenedor() ) / 3;

		return promedio;
	}

}