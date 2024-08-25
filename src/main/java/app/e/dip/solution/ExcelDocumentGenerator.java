package main.java.app.e.dip.solution;

import java.util.ArrayList;
import java.util.List;

import main.java.app.e.dip.problem.IFileGenerator;

public class ExcelDocumentGenerator implements IFileGenerator {
	ExcelDocument file;

	@Override
	public void setInputData(List<?> objects) {
		file = new ExcelDocument();
		file.setPayload(obtainData(objects));
	}

	@Override
	public GeneratedFile generate() {
		return new ExcelDocument();
	}

	private List<String> obtainData(List<?> source) {
		List<String> result = new ArrayList<>();
		source.forEach(element -> {
			if (element instanceof String castedValue) {
				result.add(castedValue);
			}
		});
		return result;
	}
}
