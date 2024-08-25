package main.java.app.a.srp.solution;

public class Vehiculo {
	String color;
	String tipo;
	Integer nivel_carga_combustible = 0;

	public Vehiculo(String color, String tipo) {
		super();
		this.color = color;
		this.tipo = tipo;
	}

	public void acelerar() {
		System.out.println("vehiculo acelerando:" + this.toString());
	}

	public void frenar() {
		System.out.println("vehiculo frenando:" + this.toString());
	}

	public Integer getNivelCombustible() {
		return nivel_carga_combustible;
	}

	public void setNivelCombustible(Integer combustible) {
		this.nivel_carga_combustible = combustible;
	}

}
