public class Programa {
    //Declaração de classe Programa;
	public static void main(String[] args) {
        //Método principal main;
        //Criar objeto na memária através do new, () = método construtor;
        //Acessar todos os métodos;
		Vendedor v = new Vendedor();
		v.setDataDeEntrada("10/01/2010");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Breno");
		v.setRg("45");
		v.calculaSalario();		
		 
		//Criar objeto na memária através do new, () = método construtor;
        //Acessar todos os métodos;
		Gerente g1 = new Gerente();
		g1.departamento = "Vendas";
		g1.dataDeEntrada = "03/02/1990";
		g1.estaNaEmpresa = true;
		g1.nome = "Eric";		
		g1.rg = "48";
		g1.salario = 3500.0;
		g1.calculaSalario();
		g1.setLogin("eric");
		g1.setSenha("123");
		//Criar objeto na memária através do new, () = método construtor;
        //Acessando ao método;
		Supervisor supervisor = new Supervisor();
		supervisor.salario = 5000.0;
		//Criar objeto na memária através do new, () = método construtor;
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.calculaTotalDeBonus(v);
		controle.calculaTotalDeBonus(g1);
		controle.calculaTotalDeBonus(supervisor);
		//Saídas de texto, dos métodos;	
		System.out.println(v.getDataDeEntrada());
		System.out.println(v.getDepartamento());
		System.out.println(v.getNome());
		System.out.println(v.getRg());
		System.out.println(v.getSalario());
		System.out.println(v.isEstaNaEmpresa());
		System.out.println(v.bonifica());
		
		System.out.println("//////////////////////////////");
		g1.autentica("eric", "124");
		System.out.println(g1.getDataDeEntrada());
		System.out.println(g1.getDepartamento());
		System.out.println(g1.getNome());
		System.out.println(g1.getRg());
		System.out.println(g1.getSalario());		
		System.out.println(g1.bonifica());
		
		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
			
	}
}