package br.com.bytebank.referenciasdeobjetos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public double saca(double valor) {
		double valor2 = valor + 0.2;
		return super.saca(valor2);
	}
}
