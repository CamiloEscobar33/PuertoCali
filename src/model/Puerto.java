package model;

public class Puerto {

	//relations
	private Contenedor co1;

	private Contenedor co2;

	private Contenedor co3;

	public Puerto(double ancho1, double ancho2, double ancho3, double largo1, double largo2, double largo3, double alto1, double alto2, double alto3) {

		co3 = new Contenedor (ancho1,largo1,alto1);

	    co2 = new Contenedor (ancho2,largo2,alto2);

		co1 = new Contenedor (ancho3,largo3,alto3);
				
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