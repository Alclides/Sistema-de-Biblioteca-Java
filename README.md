📚 Sistema de Biblioteca – Java Puro

Projeto desenvolvido em Java com o objetivo de simular o funcionamento de um sistema de biblioteca no terminal.
O sistema permite gerenciar livros, usuários e controlar empréstimos de forma simples.

🚀 Funcionalidades

📖 Livros

Cadastrar novo livro

Listar todos os livros

Atualizar informações de um livro

Remover livro da biblioteca

👤 Usuários

Cadastrar usuário

Listar usuários cadastrados

🔄 Empréstimos

Registrar empréstimo de livro

Registrar devolução de livro

Listar livros emprestados e disponíveis

🛠️ Tecnologias Utilizadas

Java 17 (ou superior)

IDE: IntelliJ IDEA / Eclipse / VSCode

Paradigma: Programação Orientada a Objetos

📂 Estrutura do Projeto
src/
 └── main/
     └── biblioteca/
         ├── Main.java           # Classe principal (menu interativo no terminal)
         ├── Livro.java          # Classe que representa os livros
         ├── Usuario.java        # Classe que representa os usuários
         ├── Emprestimo.java     # Classe que representa os empréstimos
         ├── Biblioteca.java     # Contém as listas e métodos de gerenciamento
         └── Utils.java          # Métodos auxiliares (opcional)

⚙️ Como Rodar o Projeto

Clone este repositório:

git clone https://github.com/seu-usuario/biblioteca-java.git


Entre na pasta do projeto:

cd biblioteca-java


Compile os arquivos .java:

javac src/biblioteca/*.java


Execute o programa:

java -cp src biblioteca.Main

🎮 Exemplo de Uso
===== MENU BIBLIOTECA =====
1 - Cadastrar Livro
2 - Listar Livros
3 - Cadastrar Usuário
4 - Listar Usuários
5 - Emprestar Livro
6 - Devolver Livro
0 - Sair
===========================

Escolha uma opção:

🔮 Futuras Melhorias

Persistência em arquivo .txt ou .json para salvar dados

Busca de livros por título ou autor

Sistema de login e permissões de administrador

🤝 Contribuições

Sinta-se à vontade para sugerir melhorias ou enviar pull requests.

📜 Licença

Este projeto está sob a licença MIT.
