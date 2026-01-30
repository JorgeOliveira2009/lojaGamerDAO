/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modelProduto;

/**
 *
 * @author JORGEJUNIORDEOLIVEIR
 */
public class Produto {

    private int id;
    private String nome;
    private String setor;
    private double preco;

    // Construtor vazio
    public Produto() {
    }

    // Construtor com nome, setor e preço
    public Produto(String nome, String setor, double preco) {
        this.nome = nome;
        this.setor = setor;
        this.preco = preco;
    }

    // Construtor completo
    public Produto(int id, String nome, String setor, double preco) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
