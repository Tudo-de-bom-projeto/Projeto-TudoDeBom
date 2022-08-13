package br.com.tudodebom.app;
import br.com.tudodebom.conexao.BancoDeDados;

/*
 * 
 */
public class Gerenciamento {

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
