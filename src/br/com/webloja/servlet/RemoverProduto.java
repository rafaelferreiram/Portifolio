package br.com.webloja.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.webloja.Produto;
import br.com.webloja.dao.ProdutoDao;


@WebServlet("/RemoverProduto")
public class RemoverProduto extends HttpServlet {
	
	private void service(HttpServletResponse response , HttpServletRequest request) throws ServletException, IOException{
		
		long id = Long.parseLong(request.getParameter("id"));

		Produto produto = new Produto();
		produto.setId(id);
		
		ProdutoDao dao = new ProdutoDao();
		try{
			dao.delete(produto);
		}catch(SQLException e){
			System.out.println("Erro ao deletar -> "+e);
		}
	}
}
