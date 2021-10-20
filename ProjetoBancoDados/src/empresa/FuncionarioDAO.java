package empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO {
	
	private Connection connection;
	private String mensagem;
	
	// Constantes
	public static final String FALHA_CONEXAO = "Falha na conexão com o banco de dados";
	public static final String FALHA_OPERACAO = "Falha na operação do banco de dados";
	public static final String CADASTRO_SUCESSO = "Cadastro realizado com sucesso";
	public static final String CADASTRO_INSUCESSO = "O cadastro não foi realizado";
	public static final String CONSULTA_VAZIA = "A consulta não retornou resultados";
	public static final String ATUALIZACAO_SUCESSO = "Atualização realizada com sucesso";
	public static final String ATUALIZACAO_INSUCESSO = "A atualização não foi realizada";
	public static final String EXCLUSAO_SUCESSO = "Exclusão realizada com sucesso";
	public static final String EXCLUSAO_INSUCESSO = "A exclusão não foi realizada";
	

	public String getMensagem() {
		return mensagem;
	}

	public boolean inserir(Funcionario funcionario) {
		
		String query = null;
		PreparedStatement ps = null;
		int inserted = 0;
		boolean status = true;

		connection = ConnectionFactory.getConnection();

		if (connection == null) {
			mensagem = FALHA_CONEXAO;
			return false;
		}
		
		query = "INSERT INTO tb_funcionario (id, nome, salario, cargo)" +
				"VALUES (?, ?, ?, ?)";

		try {
			ps = connection.prepareStatement(query);
			ps.setInt(1, funcionario.getId());
			ps.setString(2, funcionario.getNome());
			ps.setDouble(3, funcionario.getSalario());
			ps.setString(4, funcionario.getCargo());

			inserted = ps.executeUpdate();
			
			if (inserted > 0) {
				mensagem = CADASTRO_SUCESSO;
			}
			else {
				mensagem = CADASTRO_INSUCESSO;
				status = false;
			}
		}
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			mensagem = FALHA_OPERACAO;
			status = false;
		}
		finally {
			try { if (ps != null) ps.close(); } 
			catch (Exception ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}
		}

		ConnectionFactory.closeConnection();
		
		return status;
	}
	
	public List<Funcionario> listar() {
		
		List<Funcionario> lista = null;	
		String query = null;
		Statement s = null;
		int count = 0;

		connection = ConnectionFactory.getConnection();

		if (connection == null) {
			mensagem = FALHA_CONEXAO;
			return null;
		}

		query = "SELECT * FROM tb_funcionario";
		
		try {
			s = connection.createStatement();
			ResultSet rs = s.executeQuery(query);
			
			lista = new ArrayList<Funcionario>();
			
			while (rs.next()) {
				
				Funcionario funcionario = new Funcionario();
				
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setSalario(rs.getDouble("salario"));
				funcionario.setCargo(rs.getString("cargo"));
				
				lista.add(funcionario);
				count++;
			}
			
			if (count == 0) {
				mensagem = CONSULTA_VAZIA;
			}
			
		}
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			mensagem = FALHA_OPERACAO;
			lista = null;
		}
		finally {
			try { if (s != null) s.close(); } 
			catch (Exception ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}
		}

		ConnectionFactory.closeConnection();
		
		return lista;
	}
	
	public List<Funcionario> pesquisar(String nome) {
		
		List<Funcionario> lista = null;
		String query = null;
		PreparedStatement ps = null;
		int count = 0;

		connection = ConnectionFactory.getConnection();

		if (connection == null) {
			mensagem = FALHA_CONEXAO;
			return null;
		}

		query = "SELECT * FROM tb_funcionario WHERE nome ILIKE ?";
		
		try {
			ps = connection.prepareStatement(query);
			ps.setString(1, "%" + nome + "%");
			
			ResultSet rs = ps.executeQuery();
			
			lista = new ArrayList<Funcionario>();
			
			while (rs.next()) {
				
				Funcionario funcionario = new Funcionario();
				
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setSalario(rs.getDouble("salario"));
				funcionario.setCargo(rs.getString("cargo"));
				
				lista.add(funcionario);
				count++;
			}
			
			if (count == 0) {
				mensagem = CONSULTA_VAZIA;
			}
		}
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			mensagem = FALHA_OPERACAO;
			lista = null;
		}
		finally {
			try { if (ps != null) ps.close(); } 
			catch (Exception ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}
		}

		ConnectionFactory.closeConnection();
		
		return lista;
	}
	
	public boolean remover(int id) {
		
		String query = null;
		PreparedStatement ps = null;
		int deleted = 0;
		boolean status = true;

		connection = ConnectionFactory.getConnection();

		if (connection == null) {
			mensagem = FALHA_CONEXAO;
			return false;
		}

		query = "DELETE FROM tb_funcionario WHERE id = ?";

		try {
			ps = connection.prepareStatement(query);
			ps.setInt(1, id);

			deleted = ps.executeUpdate();
		
			if (deleted > 0) {
				mensagem = EXCLUSAO_SUCESSO;
			}
			else {
				mensagem = EXCLUSAO_INSUCESSO;
				status = false;
			}
		}
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			mensagem = FALHA_OPERACAO;
			status = false;
		}
		finally {
			try { if (ps != null) ps.close(); } 
			catch (Exception ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}
		}

		ConnectionFactory.closeConnection();
	
		return status;
	}
	
	public boolean atualizar(Funcionario funcionario) {
		
		String query = null;
		PreparedStatement ps = null;
		int updated = 0;
		boolean status = true;

		connection = ConnectionFactory.getConnection();

		if (connection == null) {
			mensagem = FALHA_CONEXAO;
			return false;
		}

		query = "UPDATE tb_funcionario SET id=?, nome=?, salario=?, cargo=?";

		try {
			ps = connection.prepareStatement(query);
			
			ps.setInt(1, funcionario.getId());
			ps.setString(2, funcionario.getNome());
			ps.setDouble(3, funcionario.getSalario());
			ps.setString(4, funcionario.getCargo());
			
			updated = ps.executeUpdate();
		
			if (updated > 0) {
				mensagem = ATUALIZACAO_SUCESSO;
			}
			else {
				mensagem = ATUALIZACAO_INSUCESSO;
				status = false;
			}
		}
		catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			mensagem = FALHA_OPERACAO;
			status = false;
		}
		finally {
			try { if (ps != null) ps.close(); } 
			catch (Exception ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}
		}

		ConnectionFactory.closeConnection();
	
		return status;
	}
}
