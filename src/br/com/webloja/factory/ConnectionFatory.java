package br.com.webloja.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFatory {
	
	private static final String USUARIO ="root";
	private static final String SENHA ="";
	private static final String URL="jdbc:mysql://localhost:3306/loja";
	
	public static Connection connection() throws SQLException{
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		Connection connnection = DriverManager.getConnection(URL,USUARIO,SENHA);
		return connnection;
	}
	public static void main(String[] args) {
		try{
			Connection connection = ConnectionFatory.connection();
		}catch (SQLException e) {
			System.out.println("Falha ao abrir conexao : "+e);
		}
	}

}
