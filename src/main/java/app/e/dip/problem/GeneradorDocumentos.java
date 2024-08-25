package main.java.app.e.dip.problem;

import java.util.List;

import main.java.app.e.dip.solution.GeneratedFile;

public class GeneradorDocumentos {

	private IFileGenerator generator;

	public GeneradorDocumentos(IFileGenerator generator) {
		this.generator = generator;
	}

	//mediante interfaces esto ahora es altamente escalable sin cambios
	public GeneratedFile generar(List<Object> data) {
		generator.setInputData(data);
		return generator.generate();
	}
}
