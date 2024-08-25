package main.java.app.b.ocp.solution;

import main.java.app.b.ocp.problem.Document;

public class EventHandler {
	private Document document;

	public EventHandler(Document document) {
		this.document = document;
	}

	public void generateNewDocument(final IDepartament departament) {
		document.setTitle("informe sueldos");
		document.setCategory("FINANZAS");

		// ahora podremos implementar n depatamentos sin tocar mas esta clase
		document.setDepartament(departament.getDepartamentName());
	}
}
