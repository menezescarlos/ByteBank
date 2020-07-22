package br.com.bytebank.referenciasdeobjetos;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	protected Cliente titular;

	public Conta(int agencia, int numero, double saldo) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.deposita(saldo);
	}
	

	public double saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			//String retornoSaca = "Saque realizado com sucesso";
			return this.saldo;
		} else {
			String retornoSaca = "Saque não realizado";
			return this.saldo;
		}
	}

	public abstract void deposita(double valor);
	

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	


	public double getSaldo() {
		return saldo;
	}
	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
