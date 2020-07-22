package br.com.bytebank.referenciasdeobjetos;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
