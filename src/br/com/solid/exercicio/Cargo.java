package br.com.solid.exercicio;
	
/*Ao criar um cargo, o mesmo deve receber uma regra de negócio*/
public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteECincoPorCento()),	
	TESTER(new QuinzeOuVinteECincoPorCento());

	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
