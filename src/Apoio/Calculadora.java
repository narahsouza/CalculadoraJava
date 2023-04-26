package Apoio;

public class Matematica {

	// AQUI FICARÃO OS ATRIBUTOS DA CLASSE
	private double resultado;

	// AQUI FICARÃO OS MÉTODOS DA CLASSE
	public void somar(double valor1, double valor2) {
		setResultado(valor1 + valor2);
	}

	public void subtrair(double valor1, double valor2) {
		setResultado(valor1 - valor2);
	}

    public void multiplicar(double valor1, double valor2) {
		setResultado(valor1 * valor2);
	}

    public void dividir(double valor1, double valor2) {
		setResultado(valor1 / valor2);
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
}