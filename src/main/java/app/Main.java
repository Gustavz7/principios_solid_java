package main.java.app;

import main.java.app.a.srp.problem.Vehiculo;
import main.java.app.a.srp.solution.Estacion;
import main.java.app.b.ocp.problem.Document;
import main.java.app.b.ocp.solution.BDDDepartamentImpl;
import main.java.app.b.ocp.solution.ComisionDepartamentImpl;
import main.java.app.b.ocp.solution.EventHandler;
import main.java.app.b.ocp.solution.PowerBIDepartamentImpl;
import main.java.app.b.ocp.solution.RRHHDepartamentImpl;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo("rojo", "Camion");
		v1.acelerar();
		v1.frenar();
		// este metodo debe llevado a una clase que se encargue exclusivamente
		v1.cargarCombustible(50);

		//////////////// SOLUCION
		main.java.app.a.srp.solution.Vehiculo v2 = new main.java.app.a.srp.solution.Vehiculo("verde", "Auto");
		Estacion e = new Estacion(v2);
		e.cargarCombustible(80);
		e.cargarCombustible(100);

		// OPEN/CLOSE - TEST SOLUTION
		EventHandler eventHandler = new EventHandler(new Document());
		eventHandler.generateNewDocument(new RRHHDepartamentImpl());
		eventHandler.generateNewDocument(new ComisionDepartamentImpl());
		eventHandler.generateNewDocument(new PowerBIDepartamentImpl());
		eventHandler.generateNewDocument(new BDDDepartamentImpl());

	}
}
