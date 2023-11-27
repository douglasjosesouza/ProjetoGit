import br.com.dsystem.conta.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Douglas Jose de Souza");
		conta.setSaldo(25000.00);
		System.out.println("Correntista...:" + conta.getTitular() + " -- Saldo da Conta..." + conta.getSaldo());
				

		System.out.println(conta.sacar(3000));

	}

}
