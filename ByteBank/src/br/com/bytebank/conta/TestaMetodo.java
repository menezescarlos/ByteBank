package br.com.bytebank.conta;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 50;
		contaDoPaulo.deposita(100);
		contaDoPaulo.saldo += 50;
		
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDoPaulo.saca(100));
		System.out.println(contaDoPaulo.saldo);
		
		Cliente paulo = new Cliente();
		paulo.nome = "Carlos Menezes";
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);

		
		Conta contaDaMarcia = new Conta();
		contaDaMarcia.saldo = 10;
		contaDaMarcia.deposita(10);
		contaDaMarcia.saldo += 10;
		
		System.out.println("***********************");
		System.out.println("***********************");
		System.out.println("***********************");
		
		System.out.println(contaDaMarcia.saldo);
		System.out.println(contaDoPaulo.transfere(contaDaMarcia, 50));
		System.out.println(contaDaMarcia.saldo);
	}

}
