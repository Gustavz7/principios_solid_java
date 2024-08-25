package main.java.app.e.dip.problem;

import java.util.List;

import main.java.app.e.dip.solution.GeneratedFile;

public interface IFileGenerator {

	public void setInputData(List<?> objects);

	public GeneratedFile generate();
}
