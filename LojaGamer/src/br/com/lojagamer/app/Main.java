/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojagamer.app;

import br.com.modelProduto.Produto;
import br.com.loja.ProdutoDAO;

import java.util.Scanner;     
import java.text.DecimalFormat;
/**
 *
 * @author JORGEJUNIORDEOLIVEIR
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();

        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nProduto " + i);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Setor: ");
            String setor = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(nome, setor, preco);
            dao.cadastrar(produto);
        }

        System.out.println("\n=== PRODUTOS CADASTRADOS ===");
        dao.listar().forEach(produto -> {
            System.out.println(
                produto.getId() + " - " +
                produto.getNome() + " | " +
                produto.getSetor() + " | " +
                df.format(produto.getPreco())
            );
        });

        scanner.close();
    }
}