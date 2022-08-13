package br.com.tudodebom.conexao;

/*
 * 
 */
public class Clientes {

	public static void main(String[] args) {
		
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			sintaxeBanco.listaClientes();
			System.out.println("Conexao ao banco de dados executada com êxito.");
		}else {
			System.out.println("Não foi possível conectar ao Banco de Dados.");
		}
	}
}
