# Banco Barbosa

Projeto de estudo em Java que simula operações básicas de uma conta bancária por meio do terminal. O programa apresenta um menu para o cliente realizar depósitos, transferências e saques, além de consultar o saldo atualizado após cada operação.

## Sobre o projeto

O **Banco Barbosa** foi criado para praticar conceitos iniciais de programação em Java, como variáveis, leitura de dados, estruturas condicionais e laços de repetição.

O programa começa com um saldo de **R$ 1.000,00**, solicita o nome do cliente e o tipo de conta e, em seguida, mostra um menu de operações.

## Funcionalidades

- Solicita o nome e o sobrenome do cliente.
- Pergunta o tipo de conta.
- Exibe um menu com as opções:
  1. Depositar
  2. Transferir
  3. Sacar
  4. Sair
- Atualiza o saldo após um depósito.
- Verifica se há saldo suficiente antes de realizar uma transferência ou saque.
- Exibe uma mensagem de erro quando o cliente escolhe uma opção inválida.
- Mostra o saldo atualizado após cada operação financeira.

## Tecnologias e conceitos

- Java
- `Scanner` para receber dados digitados no terminal
- Variáveis e tipos como `String`, `int` e `double`
- Estruturas condicionais (`if` e `else`)
- Laço de repetição (`while`)

## Como executar

Você precisa ter o **Java JDK** instalado no computador e um ambiente de desenvolvimento, como IntelliJ IDEA, Eclipse ou Visual Studio Code com suporte a Java.

1. Abra o projeto no ambiente de desenvolvimento.
2. Localize a classe `Banco`.
3. Execute o método `main`.
4. Digite as informações e escolha as opções pelo terminal.

## Exemplo de uso

```text
Bem vindo ao Banco Barbosa
Nome e Sobrenome, por favor
Ana Silva
Olá, Ana, Silva
Seu Saldo $1000.0
Tipo de conta? Corrente ou Poupança
Corrente
Conta: Corrente

1.Depositar
2.Transferir
3.Saque
4.Sair
Escolha uma opção:
```

## Observação

Este projeto é uma simulação para fins de estudo. As operações acontecem apenas durante a execução do programa; os dados da conta não são salvos.

## Próximas melhorias

- Validar valores de depósito, saque e transferência para impedir valores negativos ou iguais a zero.
- Melhorar a formatação dos valores como moeda.
- Permitir nomes e sobrenomes compostos.
- Organizar o programa em classes e métodos.
- Salvar os dados da conta para uso posterior.

## Autor

Projeto desenvolvido por **[Luiz Gustavo]** como prática de programação em Java.