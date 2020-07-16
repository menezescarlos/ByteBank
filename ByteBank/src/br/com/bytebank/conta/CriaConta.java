package br.com.bytebank.conta;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.saldo += 100);
	
	
		Conta segundaConta = new Conta();
		segundaConta.saldo = 200.00;
		
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.saldo += 100);
	
		
		Conta terceiraConta = segundaConta;
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.saldo += 100);
	}

}
