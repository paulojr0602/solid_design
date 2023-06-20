package br.com.solid.exercicio;
import static br.com.solid.exercicio.Cargo.DBA;
import static br.com.solid.exercicio.Cargo.DESENVOLVEDOR;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {
		/* Jeito Ruim de Solução
		if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
			return new DezOuVintePorCento().calcular(funcionario);
		}
		
		if(DBA.equals(funcionario.getCargo())) {
			return new QuinzeOuVinteECincoPorCento().calcular(funcionario);
		}*/
		
		/*Método encapsulado dentro da classe Funcionario;*/
		return funcionario.CalcularSalario(funcionario);
	}
}
