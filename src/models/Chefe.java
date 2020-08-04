package models;

public class Chefe extends Funcionario{
	public float salarioBase;
	public float adicionalFuncao;
	public float beneficioTerno;
	
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTerno() {
		return beneficioTerno;
	}
	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	public float calcularSalario(){
		return salarioBase + salarioBase * adicionalFuncao/100 + beneficioTerno;
	}
	
}
