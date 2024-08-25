package main.java.app.a.srp.problem;

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

	// este metodo inflinge el principio, ya que la acccion de cargar no la hace el
	// auto mismo en este caso
	public void cargarCombustible(Integer carga) {
		int nivel = nivel_carga_combustible + carga;
		if (nivel > 100) {
			nivel = 100;
			int sobra = carga - nivel;
			System.out.println("Cargando combustible, estanque al 100%, sobro :" + sobra);
		} else {
			this.nivel_carga_combustible = +carga;
		}
		System.out.println("Cargando combustible, nivel actual:" + nivel_carga_combustible);
	}

}
