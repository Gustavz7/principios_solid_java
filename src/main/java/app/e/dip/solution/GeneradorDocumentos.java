package main.java.app.e.dip.solution;

import java.util.List;

public class GeneradorDocumentos {

	private ExcelDocumentGenerator excelGenerator;

	public GeneradorDocumentos(ExcelDocumentGenerator excelGenerator) {
		this.excelGenerator = excelGenerator;
	}

	//Esto es un problema por que asi quisieramos generar otros documentos tendriamos que modificar esta clase
	public ExcelDocument generar(List<Object> data) {
		excelGenerator.setInputData(data);
		return excelGenerator.generate();
	}
}
