# 🎮 Loja Gamer - Java + JDBC + DAO

Projeto desenvolvido em Java com JDBC e MySQL para demonstrar o uso da **arquitetura em camadas** e do padrão **DAO (Data Access Object)**.

O sistema permite cadastrar e listar produtos, armazenando as informações em um banco de dados relacional.

---

## 🚀 Funcionalidades

- Cadastrar produtos
- Listar produtos cadastrados
- Persistência de dados com MySQL
- Acesso ao banco utilizando JDBC

---

## 🎯 Objetivos

- Separar responsabilidades no código
- Demonstrar a comunicação entre Java e Banco de Dados
- Aplicar boas práticas de desenvolvimento
- Evitar SQL Injection com `PreparedStatement`
- Facilitar manutenção e evolução do sistema

---

## 🗂️ Estrutura do Projeto

<img width="275" height="184" alt="Captura de tela 2026-01-30 161527" src="https://github.com/user-attachments/assets/5b941a40-e6fa-45bf-8157-6fe8ff391131" />

---

## 🧱 Arquitetura em Camadas

### Main (app)
Responsável por interagir com o usuário via console, receber dados e chamar o DAO.
Não contém comandos SQL.

### Produto (model)
Representa a tabela `Produtos` do banco de dados.

Atributos:
- id
- nome
- setor
- preco

### ProdutoDAO (dao)
Responsável pelas operações de acesso ao banco de dados (CRUD).

Métodos:
- cadastrar(Produto produto)
- listar()

### ConnectionFactory (config)
Centraliza a criação das conexões com o banco de dados, evitando repetição de código.

---

## 🧠 Padrão DAO

O padrão DAO é utilizado para:

- Separar regras de negócio do acesso ao banco
- Tornar o código mais organizado
- Facilitar testes e manutenção
- Permitir troca do banco sem impactar o sistema

---

## 🛠️ Tecnologias Utilizadas

- Java
- JDBC
- MySQL

---

