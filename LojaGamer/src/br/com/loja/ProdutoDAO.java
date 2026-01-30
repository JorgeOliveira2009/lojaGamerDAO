/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.loja;

import br.com.modelProduto.Produto;
import br.com.configLoja.ConnectionFactory;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
        

/**
 *
 * @author JORGEJUNIORDEOLIVEIR
 */
public class ProdutoDAO {

    public void cadastrar(Produto produto) {

        String sql = "INSERT INTO produtos (nome, setor, preco) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getSetor());
            stmt.setDouble(3, produto.getPreco());

            stmt.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar produto", e);
        }
    }

    public List<Produto> listar() {

        String sql = "SELECT id, nome, setor, preco FROM produtos";

        List<Produto> produtos = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String setor = rs.getString("setor");
                double preco = rs.getDouble("preco");

                Produto produto = new Produto(id, nome, setor, preco);
                produtos.add(produto);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar produtos", e);
        }

        return produtos;
    }
}
