package main.java.app.x.factura;

import main.java.app.x.factura.model.Libro;

public class Factura {

	protected Libro libro;
	protected int cantidad;
	protected double tasaDescuento;
	protected double tasaImpuesto;
	protected double total;

	public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
		this.libro = libro;
		this.cantidad = cantidad;
		this.tasaDescuento = tasaDescuento;
		this.tasaImpuesto = tasaImpuesto;
		this.total = this.calculaTotal();
	}

	public double calculaTotal() {
		double precio = ((libro.precio - libro.precio * tasaDescuento) * this.cantidad);

		double precioConImpuestos = precio * (1 + tasaImpuesto);

		return precioConImpuestos;
	}
}
