# Cálculo Simples de Produtos em Java

Este programa Java calcula o custo total de dois produtos diferentes com base na entrada do usuário. Ele solicita ao usuário que digite o código, a quantidade e o valor de cada produto e, em seguida, exibe um resumo da entrada e os totais calculados.

## Como Executar

1.  **Salve o código:** Salve o código Java fornecido como `Main.java` em um diretório (por exemplo, `calculadora_produtos`).
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório onde você salvou o arquivo e compile o código usando o compilador Java:
    ```bash
    javac principal/Main.java
    ```
    Isso criará um arquivo `Main.class` dentro do diretório `principal`.
3.  **Execute o programa:** Execute o código compilado usando a Máquina Virtual Java:
    ```bash
    java principal.Main
    ```
    Uma série de caixas de diálogo pop-up aparecerá, solicitando que você insira as informações para cada produto.

## Explicação do Código

O programa executa os seguintes passos:

1.  **Entradas para o Primeiro Produto:**
    * Solicita ao usuário que digite o código do primeiro produto usando `JOptionPane.showInputDialog()`. A entrada é armazenada como um inteiro na variável `codigo1`.
    * Solicita ao usuário que digite a quantidade do primeiro produto e a armazena como um inteiro na variável `quantidade`.
    * Solicita ao usuário que digite o valor (preço) do primeiro produto e o armazena como um double na variável `valor`.
    * Calcula o custo total do primeiro produto multiplicando o `valor` pela `quantidade`, armazenando o resultado na variável `total1`.

2.  **Entradas para o Segundo Produto:**
    * Solicita ao usuário o código, a quantidade e o valor do segundo produto, de forma semelhante ao primeiro produto. Esses valores são armazenados em `codigo2`, `quantidade2` e `valor2`, respectivamente.
    * Calcula o custo total do segundo produto multiplicando `valor2` por `quantidade2`, armazenando o resultado em `total2`.

3.  **Cálculo do Total Geral:**
    * Calcula o valor total a ser pago somando os custos totais dos dois produtos (`total1` e `total2`) e armazena o resultado na variável `total`.

4.  **Saída:**
    * Exibe uma caixa de diálogo de mensagem (`JOptionPane.showMessageDialog()`) mostrando as seguintes informações:
        * Código do primeiro produto.
        * Quantidade do primeiro produto.
        * Valor do primeiro produto.
        * Custo total do primeiro produto.
        * Código do segundo produto.
        * Quantidade do segundo produto.
        * Valor do segundo produto.
        * Custo total do segundo produto.
        * O valor total geral a ser pago.

Este programa fornece um exemplo básico de como obter entrada do usuário, realizar cálculos e exibir os resultados usando o `JOptionPane` do Swing em Java.
