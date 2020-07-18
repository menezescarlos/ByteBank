package br.com.bytebank.referenciasdeobjetos;

public class TestaConta {

	public static void main(String[] args) {
		Conta contaCorrente = new Conta();
		contaCorrente.agencia = 123;
		contaCorrente.numero = 123456;
		contaCorrente.saldo = 100.20;
		
		
		Cliente clientePF = new Cliente();
		clientePF.cpf = "123456789";
		clientePF.nome = "Carlos Menezes";
		clientePF.profissao = "Programador";
		
		contaCorrente.titular = new Cliente();
		contaCorrente.titular.nome = clientePF.cpf;
		System.out.println(contaCorrente.titular.nome = clientePF.nome);
	}

}
