package br.com.solid.exercicio;

import java.util.Calendar;

public class Funcionario {
	
	private int id;
	private String nome;
	private Cargo cargo;
	private Calendar dataDeAdmissao;
	private double salarioBase;

	public int getSalarioBase() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.setCargo(cargo);
	}

	public double getSalario() {
		return salarioBase;
	}

	public void setSalario(double salario) {
		this.salarioBase = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}


	public void setDataDeAdmissao(Calendar dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}


	public double CalcularSalario(Funcionario funcionario) {
		
		return getCargo().getRegra().calcular(funcionario);
	}
	

}
