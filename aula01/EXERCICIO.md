# Exercício de Fixação: Aula 01 - Fundamentos de Java

O objetivo deste exercício é consolidar o uso de **tipos primitivos**, **entrada de dados com Scanner**, **manipulação de Strings** e **coleções dinâmicas (ArrayList)**.

---

## O Desafio: Sistema de Inventário Simples

Você deve criar um programa em Java que simule a entrada de um produto em um sistema de estoque. O programa deve interagir com o usuário, processar os dados e exibir um resumo no final.

### Requisitos do Programa:

1.  **Entrada de Dados:**
    * Solicite o **Nome do Produto** (String).
    * Solicite o **Preço Unitário** (double).
    * Solicite a **Quantidade em Estoque** (int).

2.  **Processamento:**
    * Calcule o **Valor Total em Estoque** (Preço × Quantidade).
    * Adicione o nome do produto em uma `ArrayList<String>` chamada `listaDeProdutos`.
    * Converta o nome do produto para **Letras Maiúsculas**.

3.  **Saída de Dados (Console):**
    * Exiba o nome do produto em maiúsculas.
    * Exiba o valor total em estoque formatado com duas casas decimais (Ex: `R$ 1500,45`).
    * Exiba todos os itens presentes na `listaDeProdutos` usando um laço de repetição (`for` ou `foreach`).

---

## Dicas Importantes

### O Problema do "Buffer" do Scanner
Ao ler um número (`nextInt()` ou `nextDouble()`) e logo em seguida ler um texto (`nextLine()`), o Java pode "pular" a leitura do texto. 
**Solução:** Sempre que ler um número e for ler um texto logo depois, adicione uma linha extra de `leitor.nextLine();` apenas para limpar o teclado.

### Formatação de Números
Para exibir apenas 2 casas decimais, utilize:
`System.out.println(String.format("%.2f", variavelTotal));`

### Manipulação de Texto
Para transformar uma String em maiúsculas:
`String nomeMaiusculo = variavelNome.toUpperCase();`

---

## Exemplo de Execução Esperada:

```text
Digite o nome do produto: Notebook Dell
Digite o preço unitário: 3500,00
Digite a quantidade: 2

--- RESUMO DO PRODUTO ---
Produto: NOTEBOOK DELL
Valor Total em Estoque: R$ 7000,00

--- LISTA GERAL ---
1. NOTEBOOK DELL