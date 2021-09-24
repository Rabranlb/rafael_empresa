public class Gerente extends Funcionario{
     //Declaração de classe Gerente, junta herença funcionario;
     //Encapsulamento da variável login;
	private String login;
    //Encapsulamento da variável senha;
	private String senha;
	//Consultar login pelo método get;
	public String getLogin() {
		return login;
	}
     //Atribuir login pelo método set
	public void setLogin(String login) {
		this.login = login;
	}
    //Consultar senha pelo método get;
	public String getSenha() {
		return senha;
	}
     //Atribuir senha pelo método set
	public void setSenha(String senha) {
		this.senha = senha;
	}
	//Calculando o valor atual do obejto salário * 0.15;	
	public double bonifica(){
		return this.salario * 0.15;
	}
	
	//Autenticação de acesso, impressão de permitido ou negado;
	public void autentica(String login, String senha) {
		if((this.login == login) && (this.senha == senha)) {
			System.out.println("Acesso Permitido!");
		}else{
			System.out.println("Acesso Negado!");
		}
	}
}
