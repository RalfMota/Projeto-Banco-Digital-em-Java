
public class Main {

	public static void main(String[] args) {
		Cliente ralfmota = new Cliente();
		ralfmota.setNome("ralfmota");
		
		Conta cc = new ContaCorrente(ralfmota);
		Conta poupanca = new ContaPoupanca(ralfmota);

		cc.depositar(500);
		cc.transferir(250, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
