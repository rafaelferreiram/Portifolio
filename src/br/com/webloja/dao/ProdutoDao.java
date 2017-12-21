package br.com.webloja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.webloja.Produto;
import br.com.webloja.factory.ConnectionFatory;

public class ProdutoDao {
	
	public void crete(Produto produto) throws SQLException {
		String sql = "INSERT INTO webloja (nome,tipo,preco) VALUES (?,?,?)";
		Connection con = ConnectionFatory.connection();
		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.setString(1, produto.getNome());
		stmt.setString(2, produto.getTipo());
		stmt.setDouble(3, produto.getPreco());

		System.out.println(stmt);

		stmt.execute();
	}
	
	public void delete(Produto produto) throws SQLException{
		String sql = "DELETE FROM  webloja WHERE id=?";
		Connection con = ConnectionFatory.connection();
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setLong(1,produto.getId());
		stmt.execute();
	}

}
