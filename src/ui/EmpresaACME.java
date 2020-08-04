package ui;

import models.Chefe;
import models.Comissionado;
import models.Empreiteiro;
import models.Funcionario;
import models.Horista;

public class EmpresaACME {
	public static void main(String args[]) {
		
		Funcionario f[] = new Funcionario[7];
		f[0] = new Chefe("Joao Chefao", 1001, 4000.00f, 3.5f, 300.00f);
		f[1] = new Comissionado("Pedro Comissao", 2001, 2200.00f, 16f);
		f[2] = new Comissionado("Maria Comissao", 2002, 2300.00f, 15f);
		f[3] = new Horista("Leandro Hora", 3001, 4.00f, 700f);
		f[4] = new Horista("Luciana Hora", 3002, 4.20f, 600f);
		f[5] = new Empreiteiro("Manuel Empreita", 4001, 1000.00f);
		f[6] = new Empreiteiro("Roberta Empreita", 4002, 1300.00f);
		
		/*  ArrayList<Funcionario> lista;
		 *  lista = new ArrayList<Funcionario>;
		 *  lista.add(new Chefe("Joao Chefao", 1001, 4000.00f, 3.5f, 300.00f));
		 *  (...)
		 */ 
		
		for (Funcionario a : f) {
		//	System.out.println("Funcionario: "+a.getNome()+". Nº: "+a.getNumeroRegistro()+". Salario: "+a.calcularSalario());
		    System.out.printf("%8d    Nome: %-20s Salario: %7.2f\n",a.getNumeroRegistro(),a.getNome(),a.calcularSalario());
		}
		
	}
}
