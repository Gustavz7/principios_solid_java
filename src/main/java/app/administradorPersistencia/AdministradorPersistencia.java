package main.java.app.administradorPersistencia;

import main.java.app.factura.Factura;
import main.java.app.factura.interfaces.IFacturaPersistencia;
import main.java.app.factura.interfaces.impl.ArchivosPersistencia;
import main.java.app.factura.interfaces.impl.BaseDeDatosPersistencia;

public class AdministradorPersistencia {

	ArchivosPersistencia archivosPersistencia;
	BaseDeDatosPersistencia baseDeDatosPersistencia;

	public AdministradorPersistencia(ArchivosPersistencia archivosPersistencia,
			BaseDeDatosPersistencia baseDeDatosPersistencia) {
		super();
		this.archivosPersistencia = archivosPersistencia;
		this.baseDeDatosPersistencia = baseDeDatosPersistencia;
	}

	public void guardar(IFacturaPersistencia iFacturaPersistencia) {
		Factura factura = null;// desde aqui podriamos trar la factura de otro lado
		iFacturaPersistencia.guardar(factura);
	}

}
