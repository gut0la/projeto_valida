# Sistema de Gerenciamento de Pedidos

## Descrição

Este projeto é um sistema de gerenciamento de pedidos desenvolvido em Java, seguindo os princípios de Programação Orientada a Objetos (POO). Ele permite:
- Gerenciar informações de um gerente, incluindo salário e endereço.
- Criar e exibir itens com suas descrições.
- Gerenciar pedidos, calculando o valor total e confirmando pagamentos.
- Processar pedidos, verificando se a reserva está vencida.

O sistema inclui herança (entre `Gerente` e `Endereco`) e composição (entre `Pedido`, `Item` e `Date`).



## Estrutura do Projeto

Abaixo está a lista dos arquivos do projeto:

- `Date.java`: Classe para representar datas com dia, mês e ano.
- `Endereco.java`: Classe base com informações de endereço.
- `Gerente.java`: Classe que herda de `Endereco` e gerencia dados do gerente.
- `Item.java`: Classe para representar itens com ID, nome, tipo e valor.
- `Pedido.java`: Classe que gerencia pedidos, contendo uma lista de itens.
- `ProcessaPedido.java`: Classe responsável por processar pedidos e confirmar pagamentos.
- `Menu.java`: Classe principal com o método `main` para testar o sistema.
