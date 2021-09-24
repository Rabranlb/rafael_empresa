public class ControleDeBonificacao {
    //Declaração de classe ControleDeBonificacao;
	private double totalDebonus;
    //Encapsulamento da variável totalDebonus ;
	//Consultar total de bônus pelo metódo get;
	public double getTotalDeBonus() {
		return this.totalDebonus;
	}
	  //Calculando o valor atual de total de bônus + bonifica;
	public double calculaTotalDeBonus(Funcionario f) {
		return this.totalDebonus = this.totalDebonus + f.bonifica();
	}
}
