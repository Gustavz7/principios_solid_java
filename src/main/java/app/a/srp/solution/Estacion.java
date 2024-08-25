package main.java.app.a.srp.solution;

public class Estacion {

	String proveedor = "PETROLLEC";
	String direccion = "esquina 11";
	Vehiculo vehiculoEnCarga;

	public Estacion(Vehiculo vehiculo) {
		this.vehiculoEnCarga = vehiculo;
		System.out.println("nuevo vehiculo atendiendose en la estacion");
	}

	public Vehiculo cargarCombustible(Integer carga) {
		System.out.println("Cargando: " + carga + " de combustible");
		Integer nivel = vehiculoEnCarga.nivel_carga_combustible + carga;
		if (nivel > 100) {
			int sobra = nivel - carga;
			nivel = 100;
			vehiculoEnCarga.nivel_carga_combustible = 100;
			System.out.println("Cargando combustible, estanque al 100%, sobro :" + sobra);
		} else {
			vehiculoEnCarga.nivel_carga_combustible = +carga;
		}
		System.out.println("Cargando combustible, nivel final:" + vehiculoEnCarga.nivel_carga_combustible);
		this.vehiculoEnCarga.setNivelCombustible(nivel);
		return vehiculoEnCarga;
	}
}
