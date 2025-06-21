package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int codigo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        double total1 = valor * quantidade;

        int codigo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
        int quantidade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        double total2 = valor2 * quantidade2;

        double total = total1 + total2;

        JOptionPane.showInputDialog(null,"Código: " + codigo1 +"\n"
                                                                + "Quantidade: " + quantidade + "\n"
                                                                + "Valor do produto: " + valor + "\n"
                                                                + "Total: " + total1 + "\n"
                                                                + "Código: " + codigo2 + "\n"
                                                                + "Quantidade: " + quantidade2 + "\n"
                                                                + "Valor do produto: " + valor2 + "\n"
                                                                + "Total: " + total2 + "\n"
                                                                + "Total á pagar: " + total);

    }
}