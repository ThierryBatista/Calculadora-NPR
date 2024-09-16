package view;
import javax.swing.JOptionPane;

import controller.NPRcontroller;

public class Principal {

	public static void main(String[] args) {
		NPRcontroller n = new NPRcontroller();
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n.insereValor(valor1);
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        n.insereValor(valor2);
        String op = JOptionPane.showInputDialog("Digite a operação");
        n.insereOp(op);
        n.npr();
	}
	

}
