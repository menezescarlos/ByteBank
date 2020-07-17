package br.com.bytebank.conta;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
	public String saca(double valor){
		if(saldo >= valor) {
			this.saldo -= valor;
			String retornoSaca = "Saque realizado com sucesso";
			return retornoSaca;
		} else {
			String retornoSaca = "Saque não realizado";
			return retornoSaca;
		}
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public String transfere(Conta destino, double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			String retornoTransferencia = "Tranferencia realizado com sucesso";
			return retornoTransferencia;
		} else {
			String retornoTransferencia = "Transferencia não realizado";
			return retornoTransferencia;
		}
	}
}
