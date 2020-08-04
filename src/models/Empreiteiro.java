package models;

public class Empreiteiro extends Funcionario{
	
	public float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	public float getValorEmpreita() {
		return valorEmpreita;
	}
	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	public float calcularSalario() {
		return valorEmpreita ;
	}

}
