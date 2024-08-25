package main.java.app.e.dip.solution;

import java.util.List;

import main.java.app.e.dip.problem.IFileGenerator;

public class MDDocumentGenerator implements IFileGenerator{
	private MDDocument mdDocument;

	@Override
	public void setInputData(List<?> objects) {
		mdDocument = new MDDocument();
		//mdDocument.setDetails(objects.getObject());
		// metodo para agregar los datos a los objetos pertienentes
		
	}

	@Override
	public GeneratedFile generate() {
		//metodo para generar el doc y retornarlo
		return mdDocument;
	}

}
