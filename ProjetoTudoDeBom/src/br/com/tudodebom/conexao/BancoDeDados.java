package br.com.tudodebom.conexao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * Classe responsável por estabelecer a conexão com o banco de dados.
 */
public class BancoDeDados {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;

	/* Metodo para fazer a conexão */
	public void conectar() {

		/* Variável para se conectar ao DataBase */
		String servidor = "jdbc:mysql://localhost/db_tudodebom";

		/* Variável para receber o nome do usuário do Banco de Dados */
		String usuario = "root";

		/* Variável para receber a senha do usuário do Banco de dados */
		String senha = "mysql";

		/* Variável para vincular o driver de conexão */
		String driver = "com.mysql.cj.jdbc.Driver";

		/*
		 * Permite realizar tratamento da exceção se a conexão com o Banco de Dados
		 * falhar
		 */
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();

		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}

	}

	/* @return Se está conectado ao banco de dados */
	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		}else {
			return false;
		}
	}

	public void listaClientes() {
		try {
			// Tratando excecao do retorno select
			String query = "Select * from clientes";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			// laco de repeticao para retornar registros da tabela
			while (this.resultset.next()) {
				String meuID = resultset.getString("id_cliente");
				String meuNome = resultset.getString("nome_cliente");
                
				System.out.println("id:" + meuID);
				System.out.println("nome:" + meuNome);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

//inserir registros
	public void inserirCliente(String clientes) {
		try {
			// linha de execucao da sintaxe de insert em sql
			String query = "insert into clientes (clientes) values (' " + clientes + " ' );";
			System.out.println(query);
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}

	public void alterarCliente(String clientes, int id) {
		try {
			// linha de execucao da sinxtaxe update em sql
			String query = "update clientes set clientes='" + clientes + " 'where id=" + id + ";";
			System.out.println(query);
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}

	public void deletarCliente(int id) {
		try {
			// linha de execucao da sintaxe delete em sql
			String query = "delete from clientes where id=" + id + ";";
			System.out.println(query);
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}

}
