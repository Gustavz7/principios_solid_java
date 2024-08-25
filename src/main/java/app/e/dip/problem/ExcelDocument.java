package main.java.app.e.dip.problem;

import java.util.List;

public class ExcelDocument {
	String title;
	List<String> sheetNames;
	List<String> payload;
	String excelVersion;
	String fileExtension;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getSheetNames() {
		return sheetNames;
	}

	public void setSheetNames(List<String> sheetNames) {
		this.sheetNames = sheetNames;
	}

	public List<String> getPayload() {
		return payload;
	}

	public void setPayload(List<String> payload) {
		this.payload = payload;
	}

	public String getExcelVersion() {
		return excelVersion;
	}

	public void setExcelVersion(String excelVersion) {
		this.excelVersion = excelVersion;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
}
