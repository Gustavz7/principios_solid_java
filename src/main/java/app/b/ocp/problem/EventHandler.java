package main.java.app.b.ocp.problem;

public class EventHandler {

	private Document document;

	public EventHandler(Document document) {
		this.document = document;
	}

	public void generateNewDocument(final DocumentTypeEnum docType) {
		document.setTitle("informe sueldos");
		document.setCategory("FINANZAS");

		switch (docType) {
		case WORD:
			document.setDepartament("RRHH");
			break;
		case TXT:
			document.setDepartament("Comision");
			break;
		case CSV:
			document.setDepartament("POWER BI");
			break;
		default:
			document.setDepartament("BDD");
			break;
		}
	}
}
