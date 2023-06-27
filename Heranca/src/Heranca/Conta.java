package Heranca;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	protected String agencia, numeroConta, nomeTitular, cpf, nomeMae, dataNasc;
	protected double saldo;
	protected List<String> extrato;
	
	public Conta(String agencia, String numeroConta, String nomeTitular, String cpf, 
			String nomeMae, String dataNasc, double saldo) {
		
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.nomeMae = nomeMae;
		this.dataNasc = dataNasc;
		this.saldo = saldo;
		extrato = new ArrayList<String>();
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = this.getSaldo() + saldo;
	}	
	
	public void deposito(double valor) {
		String retorno = "";
		
		if(valor >= 0.0) {
			this.setSaldo(valor);
			retorno = "O saque do valor de "+ valor + " feito com sucesso!";
			this.extrato.add(retorno);
		} else {
			retorno = "Não é possível depositar valores menor ou igual a 0!";
		}
		
		System.out.println(retorno);
	}// fim deposito
	
	public String saque(double valor) {
		
		if(valor <= this.getSaldo()) {
			this.saldo = this.getSaldo() - valor;
			this.extrato.add("Saque no valor de "+ valor +" realizado com sucesso!");
			return "Saque no valor de "+ valor +" realizado com sucesso!";
			
		} else {
			return "Saldo Insuficiente!";
		}
	}//fim saque
	
	public void mostraExtrato() {
	System.out.println("**********************EXTRATO**********************");
	
		for (String elemento : extrato) {
			System.out.println(elemento);
			
		}//fim do for
	}//fim mostraExtrato
}
