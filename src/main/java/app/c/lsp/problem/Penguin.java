package main.java.app.c.lsp.problem;

public class Penguin extends Bird {

	@Override
	public void fly() {
		//de antemano sabemos que los pinguinos no vuelan sin embargo si es un pajaro, por lo que lanzaremos un error intencionado
		throw new Error("Los pingüinos no pueden volar.");
	}
}
