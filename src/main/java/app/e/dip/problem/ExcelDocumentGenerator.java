package main.java.app.e.dip.problem;

import java.util.ArrayList;
import java.util.List;

public class ExcelDocumentGenerator {
	ExcelDocument file;

	public void setInputData(List<?> objects) {
		file = new ExcelDocument();
		file.setPayload(obtainData(objects));
	}

	public ExcelDocument generate() {
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
