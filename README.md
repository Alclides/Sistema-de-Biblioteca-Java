# 📚 Sistema de Biblioteca -- Java Puro

Projeto desenvolvido em **Java** com o objetivo de simular o
funcionamento de um sistema de biblioteca no **terminal**.\
O sistema permite gerenciar livros, usuários e controlar empréstimos de
forma simples.

------------------------------------------------------------------------

## 🚀 Funcionalidades

-   📖 **Livros**
    -   Cadastrar novo livro\
    -   Listar todos os livros\
    -   Atualizar informações de um livro\
    -   Remover livro da biblioteca
-   👤 **Usuários**
    -   Cadastrar usuário\
    -   Listar usuários cadastrados
-   🔄 **Empréstimos**
    -   Registrar empréstimo de livro\
    -   Registrar devolução de livro\
    -   Listar livros emprestados e disponíveis

------------------------------------------------------------------------

## 🛠️ Tecnologias Utilizadas

-   **Java 17** (ou superior)\
-   **IDE**: IntelliJ IDEA / Eclipse / VSCode\
-   **Paradigma**: Programação Orientada a Objetos

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

    src/
     └── main/
         └── biblioteca/
             ├── Main.java           # Classe principal (menu interativo no terminal)
             ├── Livro.java          # Classe que representa os livros
             ├── Usuario.java        # Classe que representa os usuários
             ├── Emprestimo.java     # Classe que representa os empréstimos
             ├── Biblioteca.java     # Contém as listas e métodos de gerenciamento
             └── Utils.java          # Métodos auxiliares (opcional)

------------------------------------------------------------------------

## ⚙️ Como Rodar o Projeto

1.  Clone este repositório:

    ``` bash
    git clone https://github.com/seu-usuario/biblioteca-java.git
    ```

2.  Entre na pasta do projeto:

    ``` bash
    cd biblioteca-java
    ```

3.  Compile os arquivos `.java`:

    ``` bash
    javac src/biblioteca/*.java
    ```

4.  Execute o programa:

    ``` bash
    java -cp src biblioteca.Main
    ```

------------------------------------------------------------------------

## 🔮 Futuras Melhorias

-   Persistência em arquivo `.txt` ou `.json` para salvar dados\
-   Busca de livros por título ou autor\
-   Sistema de login e permissões de administrador

------------------------------------------------------------------------

## 🤝 Contribuições

Sinta-se à vontade para sugerir melhorias ou enviar pull requests.

------------------------------------------------------------------------

## 📜 Licença

Este projeto está sob a licença MIT.
