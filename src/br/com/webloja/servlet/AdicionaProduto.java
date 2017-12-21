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

@WebServlet("/AdicionaProduto")
public class AdicionaProduto extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		String preco = request.getParameter("preco");

		String strp = preco.replace(".", "");

		double precoNovo = Double.parseDouble(strp);

		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setTipo(tipo);
		produto.setPreco(precoNovo);

		ProdutoDao dao = new ProdutoDao();
		try {
			dao.crete(produto);
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar -> " + e);
		}
	}

}
