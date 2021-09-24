public abstract class Funcionario {
    //Declaração de classe Funcionario;
    //Declaração das variáveis como protected, que torna acessível para as classes da mesma herança;
	protected String nome;
	protected String departamento;
	protected double salario;
	protected String dataDeEntrada;
	protected String rg;
	protected boolean estaNaEmpresa;
	//Consultar nome pelo metódo get;
	public String getNome() {
		return nome;
	}
    //Atribuir nome pelo metódo set;
	public void setNome(String nome) {
		this.nome = nome;
	}
    //Consultar Departamento pelo metódo get;
	public String getDepartamento() {
		return departamento;
	}
    //Atribuir Departemento pelo metódo set;
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
    //Consultar salário pelo metódo get;
	public double getSalario() {
		return salario;
	}
    //Atribuir salário pelo metódo set;
	public void setSalario(double salario) {
		this.salario = salario;
	}
    //Consultar data de entrega pelo metódo get;
	public String getDataDeEntrada() {
		return dataDeEntrada;
	}
    //Atribuir data de entrega pelo metódo set;
	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
     //Consultar RG pelo metódo get;
	public String getRg() {
		return rg;
	}
    //Atribuir RG pelo metódo set;
	public void setRg(String rg) {
		this.rg = rg;
	}
    //Se está ou não na empresa;
	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}
     //Atribuir true ou false pelo método set, se está na empresa;
	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	 //Calculando o valor de entrada * 0.06;
	public void calculaSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}
    //Calculando o valor do salário mais o valor da hora extra;
	public void calculaSalario(double valor, double horaExtra) {
		double valorHorasExtra = (valor/30) / 8 * horaExtra;
		this.salario = valor - (valor*0.06) + valorHorasExtra;
	}
    //Calculando o valor atual do obejto salário * 0.06;
	public double  calculaSalario() {
		return this.salario = this.salario - (this.salario * 0.06);
	}
    //Calculando o valor atual do obejto salário * 0.10;
	public double bonifica(){
		return this.salario * 0.10;
	}
	//Demetido se não está na empresa;     
	public void demite() {
		estaNaEmpresa = false;
	}
    //Calculando ganho anual;
	public double calculaGanhoAnual() {
		return salario * 12;
	}

}