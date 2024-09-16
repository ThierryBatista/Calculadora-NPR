package controller;
import model.PilhaInt;
import models.PilhaString;

public class NPRcontroller {

	public NPRcontroller() {
		super();
	}
	PilhaInt p = new PilhaInt();
	PilhaString ps = new PilhaString();
	
	public void insereValor(int valor) {
		p.push(valor);
	}
	public void insereOp(String operacao) {
		ps.pushS(operacao);
	}
	
	public void npr() {
		int tamanho = p.size();
		int tamanhoS = ps.size();
		int a = 0;
		int b = 0;
		String op = "";
		int r = 0;
		if (tamanho < 2 || tamanhoS != 1) {
			System.out.println("Incapaz de realizar a operação");
		}		
		
		 try {
			 a = p.pop();
			 b = p.pop();
			 op = ps.popS();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if (op.contains("+")) {
			 r = a + b;
			 System.out.println(a+" + "+b+" = "+r);
		 } else if (op.contains("-")) {
			 r = a - b;
			 System.out.println(a+" - "+b+" = "+r);
		 } else if (op.contains("*")) {
			 r = a * b;
			 System.out.println(a+" * "+b+" = "+r);
		 } else if (op.contains("/")) {
			 r = a / b;
			 System.out.println(a+" / "+b+" = "+r);
		 } else if (op.contains("%")) {
			 r = a % b;
			 System.out.println(a+" % "+b+" = "+r);
		 } else {
			 System.out.println("Incapaz de realizar a operação");
		 }
		
	}
}
