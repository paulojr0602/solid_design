package br.com.solid.exercicio;

public class DezOuVintePorCento implements RegraDeCalculo {
	
	public double calcular(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000) {
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.9;
		}
				
	}

}
