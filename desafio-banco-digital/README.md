## Banco Digital

Este é um projeto de um sistema de banco digital desenvolvido em Java. Ele oferece funcionalidades básicas de um banco, como abrir uma conta, depositar, sacar, transferir e fechar uma conta.

### Funcionalidades

- **Abertura de Conta**: Permite que novos clientes abram uma conta corrente ou poupança no banco digital.
- **Depósito**: Permite que os clientes depositem dinheiro em suas contas.
- **Saque**: Permite que os clientes retirem dinheiro de suas contas, respeitando o saldo disponível e o limite do cheque especial, se aplicável.
- **Transferência**: Permite que os clientes transfiram dinheiro entre contas, tanto do mesmo banco digital quanto de bancos diferentes.
- **Fechamento de Conta**: Permite que os clientes fechem suas contas no banco digital.

### Componentes do Projeto

- **Cliente**: Representa um cliente do banco, com nome, CPF e endereço.
- **Conta**: Uma classe abstrata que define os atributos e métodos comuns para todas as contas bancárias.
    - **ContaCorrente**: Uma subclasse de `Conta` que representa uma conta corrente, com um limite de cheque especial.
    - **ContaPoupanca**: Uma subclasse de `Conta` que representa uma conta poupança, com uma taxa de juros.
- **Transacao**: Representa uma transação bancária, como depósito ou transferência, entre contas.
- **BancoDigital**: Gerencia as contas e transações do banco digital.

### Como Usar

1. Clone este repositório: `git clone https://github.com/seu-usuario/banco-digital.git`
2. Importe o projeto em sua IDE Java preferida.
3. Execute o arquivo `Main.java` para testar as funcionalidades do banco digital.

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir um problema ou enviar uma solicitação de recebimento para sugerir melhorias ou correções.