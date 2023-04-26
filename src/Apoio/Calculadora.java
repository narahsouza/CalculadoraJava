package Apoio;

public class Calculadora {
	
	// ATRIBUTOS
	private double resultado;
	
	// GETTERS E SETTERS
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
		
	// CONSTRUTORES
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	// METODOS
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
}
